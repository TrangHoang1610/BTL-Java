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

public class HangTonDAO extends DataConnection {
    private String table="SANPHAM";
    public HangTonDAO(){
        super();
    }
    public ArrayList<SanPham> getHangTons(){
        ArrayList<SanPham> items = new ArrayList<>();
        String sql = "select * from " + table+" where DELETED=1";
        PreparedStatement ps;
      
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham dd = new SanPham();
                dd.setMaSP(rs.getString("MASP"));
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
//    public boolean addItem(SanPham item){
//        String sql="INSERT INTO "+table+"(MASP,SOLUONG) VALUES(?,?) ";
//        
//        try {
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//        preparedStatement.setString(1, item.getMaSP());
//        preparedStatement.setInt(2, item.getSoLuong());
//      
//        int isSuccess = preparedStatement.executeUpdate();
//            preparedStatement.close();
//            conn.close();
//            return isSuccess > 0;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//;
//        
//       return false; 
//    }
//    public boolean updateItem(SanPham item){
//        String sql="UPDATE "+table+" SET SOLUONG=? WHERE MaSP=?" ;
//        
//        try {
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//        preparedStatement.setString(3, item.getMaSP());
//        preparedStatement.setInt(1, item.getSoLuong());
//      int isSuccess = preparedStatement.executeUpdate();
//            preparedStatement.close();
//            conn.close();
//            return isSuccess > 0;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//;
//        
//       return false; 
//       
//    }
    public ArrayList<SanPham> searchItem(String maSP){
    ArrayList<SanPham> items = new ArrayList<>();
        String sql = "select * from " + table+" WHERE MASP =?";
        PreparedStatement ps;
      
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, maSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham dd = new SanPham();
                dd.setMaSP(rs.getString("MASP"));
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
//    public boolean deleteItem(SanPham item){
//        
//      String sql = "DELETE FROM "+ table+" WHERE MASP = ?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, item.getMaSP());
//            int isSuccess = ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return isSuccess > 0;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//         return false;
//    }
}
