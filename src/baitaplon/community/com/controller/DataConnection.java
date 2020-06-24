/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Trang
 */
public class DataConnection {

    public Connection conn;
    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLShowroom;";
    private final String username = "sa";
    private final  String password = "123";
     public DataConnection() 
    {
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = (Connection) DriverManager.getConnection(URL,username,password);
        } catch (Exception ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    
}
