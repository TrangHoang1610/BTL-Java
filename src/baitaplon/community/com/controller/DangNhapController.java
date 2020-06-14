/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import baitaplon.DataConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Hoang Trang
 */
public class DangNhapController {
    
    Connection connect = new DataConnection().getConnection();
    
    public boolean dangNhap(String username){
        int result = 0 ;
        try {
            String sql = "select username = ? ";
            PreparedStatement ppst = connect.prepareStatement(sql);
            ppst.setString(0, username);
            result = ppst.executeUpdate();
        } catch (Exception e) {
        }
        
        return result > 0;
    }
    
    
}
