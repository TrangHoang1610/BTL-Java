/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import baitaplon.DataConnection;
import com.sun.corba.se.spi.orbutil.fsm.Guard;
import community.com.model.KhachHangObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoang
 */
public class KhachHangController {

    Connection connect = new DataConnection().getConnection();

    public ArrayList<community.com.model.KhachHangObject> getKH() {
        ArrayList<community.com.model.KhachHangObject> dsKH = new ArrayList<>();

        try {
            Statement stm = connect.createStatement();
            String query = "SELECT * FROM KhachHang";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                dsKH.add(new community.com.model.KhachHangObject(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6)));
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsKH;
    }

    public boolean themKhachHang(KhachHangObject khachHang) {
        int result = 0;
        
        try {
            String sql = "INSERT INTO KHACHHANG(MAKH,TENKH,SODT,NGAYSINH,THOIQUEN,SOTHICH) values(?,?,?,?,?,?)";
               
            PreparedStatement ppst = connect.prepareStatement(sql);
            ppst.setString(1, khachHang.getMaKH());
            ppst.setString(2, khachHang.getTenKH());
            ppst.setString(3, khachHang.getSoDT());
            ppst.setDate(4, khachHang.getNgaySinh());
            ppst.setString(5, khachHang.getThoiQuen());
            ppst.setString(6, khachHang.getSoThich());
            result = ppst.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result >0;
    }

    public ArrayList<KhachHangObject> timKiemKhachHang(String name, String condition) {
        ArrayList<KhachHangObject> list = new ArrayList<>();
        try {
           
           String sql = "select * from KHACHHANG where "+name.trim()+" = ?";

            PreparedStatement ppst = connect.prepareStatement(sql);
          
            ppst.setString(1, condition);
            

            ResultSet data = ppst.executeQuery();
           
            
            while (data.next()) {
                System.out.println("have data");
                list.add(new KhachHangObject(data.getString(1),data.getString(2),data.getString(3),data.getDate(4),data.getString(5),data.getString(6)));
            }
            
            //System.out.println("size:" + list.size());

            }catch (Exception e) {
            e.printStackTrace();
        }
            return list;
        }
    public boolean suaKhachHang(KhachHangObject khachHang) {
        int result = 0;
        try {
            String sql = "UPDATE KHACHHANG SET TENKH = ?, SODT = ?, NGAYSINH= ?, THOIQUEN = ?, SOTHICH = ? WHERE MAKH = ?";
            System.out.println("TenKH "+ khachHang.getTenKH());
            System.out.println("sodt "+ khachHang.getSoDT());
            System.out.println("ngaysinh "+ khachHang.getNgaySinh());
            System.out.println("thoiquen "+ khachHang.getThoiQuen());
            System.out.println("sothich "+ khachHang.getSoThich());
            System.out.println("ma "+ khachHang.getMaKH());
            PreparedStatement ppst = connect.prepareStatement(sql);
            

            
            ppst.setString(1, khachHang.getTenKH());
            ppst.setString(2, khachHang.getSoDT());
            ppst.setDate(3, khachHang.getNgaySinh());
            ppst.setString(4, khachHang.getThoiQuen());
            ppst.setString(5, khachHang.getSoThich());
            ppst.setString(6, khachHang.getMaKH());
            

            result = ppst.executeUpdate();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result >0;
    }
     public boolean xoaKhachHang(KhachHangObject khachHang) {
        int result = 0;
        try {
            String sql = "DELETE from KHACHHANG WHERE MAKH = ?";            
            PreparedStatement ppst = connect.prepareStatement(sql);        
            ppst.setString(1, khachHang.getMaKH());
            result = ppst.executeUpdate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result >0;
    }
    public boolean checkTon(KhachHangObject khachHang) {
        //Re result = 0;
        try {
            String sql = "SELECT MAKH FROM KHACHHANG WHERE MAKH = ?";            
            PreparedStatement ppst = connect.prepareStatement(sql);        
            ppst.setString(1, khachHang.getMaKH());
            ResultSet result = ppst.executeQuery();   
            if(result != null){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
 
    }
