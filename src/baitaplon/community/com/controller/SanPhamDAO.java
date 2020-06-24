/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import community.com.model.SanPham;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamDAO extends DataConnection{

    private String table="SANPHAM";
    public SanPhamDAO(){
        super();
    }
    public ArrayList<SanPham> getSanPhams(){
        ArrayList<SanPham> items = new ArrayList<>();
        String sql = "select * from " + table+" WHERE DELETED=0";
        PreparedStatement ps;
      
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham dd = new SanPham();
                dd.setMaSP(rs.getString("MASP"));
                dd.setTenSP(rs.getString("TENSP"));
                dd.setGia(rs.getDouble("GIA"));
                dd.setKieuDang(rs.getString("KIEUDANG"));
                dd.setMauSac(rs.getString("MAUSAC"));
                dd.setXuatXu(rs.getString("XUATXU"));
                dd.setSoLuong(rs.getInt("SOLUONG"));
                dd.setMoTa(rs.getString("MOTA"));                   
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
    

    public boolean addItem(SanPham item){
        String sql="INSERT INTO "+table+"(MASP,TENSP,GIA,KIEUDANG,MAUSAC,XUATXU,SOLUONG,MOTA) VALUES(?,?,?,?,?,?,?,?) ";
        
        try {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, item.getMaSP());
        preparedStatement.setString(2, item.getTenSP());
        preparedStatement.setDouble(3, item.getGia());
        preparedStatement.setString(4, item.getKieuDang());
        preparedStatement.setString(5, item.getMauSac());
        preparedStatement.setString(6, item.getXuatXu());
        preparedStatement.setInt(7, item.getSoLuong());
        preparedStatement.setString(8, item.getMoTa());
        
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
    
    public boolean updateItem(SanPham item){
        String sql="UPDATE "+table+" SET TENSP=?,GIA=?,KIEUDANG=?,MAUSAC=?,XUATXU=?,SOLUONG=?,MOTA=? WHERE MaSP=?" ;
        
        try {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(8, item.getMaSP());
        preparedStatement.setString(1, item.getTenSP());
        preparedStatement.setDouble(2, item.getGia());
        preparedStatement.setString(3, item.getKieuDang());
        preparedStatement.setString(4, item.getMauSac());
        preparedStatement.setString(5, item.getXuatXu());
        preparedStatement.setInt(6, item.getSoLuong());
        preparedStatement.setString(7, item.getMoTa());
        
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
    
public ArrayList<SanPham> searchItem(String maSP,String tenSP){
    ArrayList<SanPham> items = new ArrayList<>();
        String sql = "select * from " + table+" WHERE MASP =? OR TENSP=?";
        PreparedStatement ps;
      
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, maSP);
            ps.setString(2, tenSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham dd = new SanPham();
                dd.setMaSP(rs.getString("MASP"));
                dd.setTenSP(rs.getString("TENSP"));
                dd.setGia(rs.getDouble("GIA"));
                dd.setKieuDang(rs.getString("KIEUDANG"));
                dd.setMauSac(rs.getString("MAUSAC"));
                dd.setXuatXu(rs.getString("XUATXU"));
                dd.setSoLuong(rs.getInt("SOLUONG"));
                dd.setMoTa(rs.getString("MOTA"));                   
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
    public boolean deleteItem(SanPham item){
        
      String sql = "update "+ table+" set DELETED=1 WHERE MASP = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getMaSP());
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
