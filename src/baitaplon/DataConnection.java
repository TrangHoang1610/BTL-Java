/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Trang
 */
public class DataConnection {

    Statement stm = null;
    ResultSet rs = null;
    Connection cnn = null;

    public Connection getConnection() {
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLShowroom2";
        String username = "sa";
        String password = "123";
        //Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("connect fail");
        }
        return cnn;
    }
        public boolean UpdateData(String query) {
        getConnection();
        int row = 0;
        try {
            stm = (Statement) cnn.createStatement();
            row = stm.executeUpdate(query);
            if (row > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } finally {
            CloseConnect();
        }
        return false;
    }
        public void CloseConnect() {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

}
