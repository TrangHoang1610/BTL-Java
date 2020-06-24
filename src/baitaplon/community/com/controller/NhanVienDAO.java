/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import community.com.model.HoaDon;
import community.com.model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class NhanVienDAO  extends DataConnection {
    private String table="NHANVIEN";
    public NhanVienDAO(){
        super();
    }
    public ArrayList<NhanVien> getNhanViens(){
        ArrayList<NhanVien> items = new ArrayList<>();
        String sql = "select * from "+table;
        PreparedStatement ps;
        
        try {
            
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien dd = new NhanVien();
                dd.setMaNV(rs.getString("MANV"));               
                dd.setTenNV(rs.getString("TENNV"));
                dd.setChucVu(rs.getString("CHUCVU"));              
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
}
