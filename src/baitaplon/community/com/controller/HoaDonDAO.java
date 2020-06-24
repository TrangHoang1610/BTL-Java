/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import community.com.model.HoaDon;
import community.com.model.SanPham;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HoaDonDAO extends DataConnection {

    private String table = "HOADON";

    public HoaDonDAO() {
        super();
    }

    public ArrayList<HoaDon> getHoaDOns() {
        ArrayList<HoaDon> items = new ArrayList<>();
        String sql = "select MAHD,MAKH,MANV,NGAYLAP, SUM(HOADON.SOLUONG*GIA) AS 'TONGTIEN' from HOADON INNER JOIN SANPHAM ON HOADON.MASP=SANPHAM.MASP\n"
                + "group by  MAHD,MAKH,MANV,NGAYLAP";
        PreparedStatement ps;
        DecimalFormat f = new DecimalFormat("#,###,###,###");
        try {

            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon dd = new HoaDon();
                dd.setMaHD(rs.getString("MAHD"));
                dd.setMaNV(rs.getString("MANV"));
                dd.setMaKH(rs.getString("MAKH"));
                dd.setNgayLap(rs.getString("NGAYLAP"));
                dd.setTongTien(rs.getDouble("TONGTIEN"));
                items.add(dd);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return items;
    }

    public boolean addItem(HoaDon item) {
        String sql = "INSERT INTO " + table + "(MAHD,MANV,MASP,MAKH,NGAYLAP,SOLUONG) VALUES(?,?,?,?,?,?) ";
        PreparedStatement pr;
        ResultSet rs = null;

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            String masp = item.getMaSP();
            int slothem = item.getSoLuong();
            String sl = "SELECT* FROM SANPHAM WHERE MASP='" + masp + "'";

            pr = conn.prepareStatement(sl);

            rs = pr.executeQuery();
            int a = 0;
            if (rs.next()) {
                a = rs.getInt("SOLUONG");
            }

            if (a < slothem) {
                JOptionPane.showMessageDialog(null, "Sản phẩn mua nhiều hơn sản phẩm còn lại trong kho.");
                return false;
            }

            preparedStatement.setString(1, item.getMaHD());
            preparedStatement.setString(2, item.getMaNV());
            preparedStatement.setString(3, item.getMaSP());
            preparedStatement.setString(4, item.getMaKH());
            preparedStatement.setString(5, item.getNgayLap());
            preparedStatement.setInt(6, item.getSoLuong());

            int isSuccess = preparedStatement.executeUpdate();
            preparedStatement.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ;

        return false;
    }

    public boolean updateItem(HoaDon item) {
        String sql = "UPDATE " + table + " SET SOLUONG=? WHERE MaHD=? AND MaSP=?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(2, item.getMaHD());
            preparedStatement.setString(3, item.getMaSP());
            preparedStatement.setInt(1, item.getSoLuong());

            int isSuccess = preparedStatement.executeUpdate();
            preparedStatement.close();
//            conn.close();
            return isSuccess > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ;

        return false;
    }

    public ArrayList<HoaDon> searchItem(String maHD) {
        ArrayList<HoaDon> items = new ArrayList<>();
        String sql = "select * from " + table + " WHERE MAHD =?";
        PreparedStatement ps;

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, maHD);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon dd = new HoaDon();

                dd.setMaHD(rs.getString("MAHD"));
                dd.setMaNV(rs.getString("MANV"));
                dd.setMaSP(rs.getString("MASP"));
                dd.setMaKH(rs.getString("MAKH"));
                dd.setNgayLap(rs.getString("NGAYLAP"));
                dd.setSoLuong(rs.getInt("SOLUONG"));
                items.add(dd);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    public boolean deleteItem(HoaDon item) throws SQLException {
         String sql = "DELETE FROM "+ table+" WHERE MAHD = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getMaHD());
            int isSuccess = ps.executeUpdate();
            ps.close();
            conn.close();
            return isSuccess > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return false;
    }

}
