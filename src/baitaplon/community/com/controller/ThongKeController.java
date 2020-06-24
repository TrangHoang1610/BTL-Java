/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import baitaplon.community.com.controller.DataConnection;
import community.com.model.KhachHangObject;
import community.com.model.ThongKe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoang
 */
public class ThongKeController extends DataConnection {

    public ThongKeController() {
        super();
    }

    public void thongKe_TongTien(JLabel jltongtien, String txtThang, String txtNam) {
        String sql = "   select SUM(gia*HOADON.soluong) as tongtien		\n" +
"                 from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where  month(HOADON.NGAYLAP) = ? and YEAR(HOADON.NGAYLAP) = ? ";
        try {
            PreparedStatement ppst = conn.prepareStatement(sql);
            ppst.setString(1, txtThang);
            ppst.setString(2, txtNam);
            ResultSet data = ppst.executeQuery();

            while (data.next()) {
                jltongtien.setText(data.getString("tongtien"));            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void tongTienTheoNgay(JLabel jltongtien,String ngay,String thang,String nam){
        String query = "select SUM(gia*HOADON.soluong) as tongtien		\n" +
"                 from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where day(HOADON.NGAYLAP) = ? and  month(HOADON.NGAYLAP) = ? and YEAR(HOADON.NGAYLAP) = ? ";
        try{
            PreparedStatement ppst = conn.prepareStatement(query);
            ppst.setString(1,ngay);
            ppst.setString(2, thang);
            ppst.setString(3, nam);
            ResultSet data = ppst.executeQuery();
            
             while (data.next()) {
                jltongtien.setText(data.getString("tongtien"));            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void thongKe_SoKhach(JLabel jlbTongSoKhach, String txtThang, String txtNam) {
        String sql = "select count(*) as tongsokhach  from Khachhang  where KHACHHANG.MAKH in (select distinct KHACHHANG.MAKH from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where month(HOADON.NGAYLAP) = ? and YEAR(HOADON.NGAYLAP) = ?)";

        try {
            PreparedStatement ppst = conn.prepareStatement(sql);
            ppst.setString(1, txtThang);
            ppst.setString(2, txtNam);
            ResultSet data = ppst.executeQuery();

            while (data.next()) {
                jlbTongSoKhach.setText(data.getString("tongsokhach"));            
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void thongKe_SoKhachNgay(JLabel jlbTongSoKhach,String ngay, String txtThang, String txtNam) {
        String sql = "select count(*) as tongsokhach  from Khachhang  where KHACHHANG.MAKH in (select distinct KHACHHANG.MAKH from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where day(HOADON.NGAYLAP) = ? and month(HOADON.NGAYLAP) = ? and YEAR(HOADON.NGAYLAP) = ?)";

        try {
            PreparedStatement ppst = conn.prepareStatement(sql);
            ppst.setString(1, ngay);
            ppst.setString(2, txtThang);
            ppst.setString(3, txtNam);
            ResultSet data = ppst.executeQuery();

            while (data.next()) {
                jlbTongSoKhach.setText(data.getString("tongsokhach"));            
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    public void tongTienTheoQuy(JLabel jltongtien,String thangDau,String thangCuoi,String nam){
        String query = "select SUM(gia*HOADON.soluong) as tongtien		\n" +
"                 from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where month(HOADON.NGAYLAP) >= ? and  month(HOADON.NGAYLAP) <= ? and YEAR(HOADON.NGAYLAP) = ? ";
        try{
            PreparedStatement ppst = conn.prepareStatement(query);
            ppst.setString(1,thangDau);
            ppst.setString(2, thangCuoi);
            ppst.setString(3, nam);
            ResultSet data = ppst.executeQuery();
            
             while (data.next()) {
                jltongtien.setText(data.getString("tongtien"));            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void thongKe_SoKhachQuy(JLabel jlbTongSoKhach,String thangDau,String thangCuoi, String txtNam) {
        String sql = "select count(*) as tongsokhach  from Khachhang  where KHACHHANG.MAKH in (select distinct KHACHHANG.MAKH from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where month(HOADON.NGAYLAP) >= ? and  month(HOADON.NGAYLAP) <= ? and YEAR(HOADON.NGAYLAP) = ? )";

        try {
            PreparedStatement ppst = conn.prepareStatement(sql);
            ppst.setString(1, thangDau);
            ppst.setString(2, thangCuoi);
            ppst.setString(3, txtNam);
            ResultSet data = ppst.executeQuery();

            while (data.next()) {
                jlbTongSoKhach.setText(data.getString("tongsokhach"));            
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void tongTienTheoNam(JLabel jltongtien,String nam){
        String query = "select SUM(gia*HOADON.soluong) as tongtien		\n" +
"                 from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where YEAR(HOADON.NGAYLAP) = ? ";
        try{
            PreparedStatement ppst = conn.prepareStatement(query);
        
            ppst.setString(1, nam);
            ResultSet data = ppst.executeQuery();
            
             while (data.next()) {
                jltongtien.setText(data.getString("tongtien"));            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void thongKe_SoKhachNam(JLabel jlbTongSoKhach, String txtNam) {
        String sql = "select count(*) as tongsokhach  from Khachhang  where KHACHHANG.MAKH in (select distinct KHACHHANG.MAKH from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n" +
"		 inner join SANPHAM on HOADON.MASP = SANPHAM.MASP\n" +
"                 where  YEAR(HOADON.NGAYLAP) = ? )";

        try {
            PreparedStatement ppst = conn.prepareStatement(sql);
          
            ppst.setString(1, txtNam);
            ResultSet data = ppst.executeQuery();

            while (data.next()) {
                jlbTongSoKhach.setText(data.getString("tongsokhach"));            
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ThongKe> thongKe(String ngay,int thang,int nam, int quybd,int quykt,int kieu) {
        ArrayList<ThongKe> list = new ArrayList<>();
        try {
                String sql="";
            if(kieu ==1 )
            {
                  sql = "select * from thongKeNgay('" + ngay.trim() + "')";
            }
            if(kieu ==2 )
            {
                System.out.println(thang + nam);
                sql = "select * from thongKeThang('" + thang + "','"+nam+"')";
            }
            if(kieu ==3 )
            {
                sql = "select * from thongKeNam('" + nam + "')";
            }
            if(kieu ==4 )
            {
            
                sql = "select * from thongKeTheoQuy('" + quybd + "','"+quykt+"','"+nam+"')";
            }
            
           

            PreparedStatement ppst = conn.prepareStatement(sql);     
            ResultSet data = ppst.executeQuery();
            while (data.next()) {
                list.add(new ThongKe(data.getString(1), data.getString(2), data.getString(3), data.getString(4), data.getDate(5), data.getInt(6)));
            }
           
            //System.out.println("size:" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
