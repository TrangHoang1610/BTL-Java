/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import community.com.model.ChiTieu;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChiTieuDAO extends DataConnection{
    private String table="CHITIEU";
    public ChiTieuDAO(){
        super();
    }
    public ArrayList<ChiTieu> getChiTieus(){
        ArrayList<ChiTieu> items = new ArrayList<>();
        String sql = "select * from " + table;
        PreparedStatement ps;
      
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTieu dd = new ChiTieu();
                dd.setMaCT(rs.getString("MACT"));
                dd.setTenKhoanChi(rs.getString("TENKHOANCHI"));
                dd.setNgay(rs.getString("NGAY"));
                dd.setSoTien(rs.getDouble("SOTIEN"));                                
                items.add(dd);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    public boolean addItem(ChiTieu item){
        String sql="INSERT INTO "+table+" (MACT,TENKHOANCHI,NGAY,SOTIEN) VALUES (?,?,?,?) ";
        
        try {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, item.getMaCT());
        preparedStatement.setString(2, item.getTenKhoanChi());
         preparedStatement.setString(3,item.getNgay());
        preparedStatement.setDouble(4, item.getSoTien());
        
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
    public boolean updateItem(ChiTieu item){
        String sql="UPDATE "+table+" SET TENKHOANCHI=?,NGAY=?,SOTIEN=? WHERE MaCT=?" ;
        
        try {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(4, item.getMaCT());
        preparedStatement.setString(1, item.getTenKhoanChi());
        preparedStatement.setString(2,item.getNgay());
        preparedStatement.setDouble(3, item.getSoTien());
        
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
    public ArrayList<ChiTieu> searchItem(String maCT,String tenCT){
    ArrayList<ChiTieu> items = new ArrayList<>();
        String sql = "select * from " + table+" WHERE MACT =? OR TENKHOANCHI=?";
        PreparedStatement ps;
      
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, maCT);
            ps.setString(2, tenCT);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTieu dd = new ChiTieu();
                dd.setMaCT(rs.getString("MACT"));
                dd.setTenKhoanChi(rs.getString("TENKHOANCHI"));
                dd.setNgay(rs.getString("NGAY"));
                dd.setSoTien(rs.getDouble("SOTIEN"));                                
                items.add(dd);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
}
    public boolean deleteItem(ChiTieu item){
        
      String sql = "DELETE FROM "+ table+" WHERE MACT = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, item.getMaCT());
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
