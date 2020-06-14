/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.controller;

import baitaplon.DataConnection;
import community.com.model.KhachHangObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author hoang
 */
public class ThongKeController {

    Connection connect = new DataConnection().getConnection();

    public void baoCao_DoanThuController(JLabel jlsldon, JLabel jlslkhach, JLabel jltongtien, String txtThang, String txtNam) {
        String sql = "select count(*)as soluongdon,count(*) as tongsokhach,SUM(dongia*soluong) as tongtien		\n"
                + "from Khachhang inner join hoadon on khachhang.makh = hoadon.makh \n"
                + "where  mahd in(select mahd from HOADON where MONTH(NGAYLAP) = ?) and \n"
                + "mahd in (select mahd from HOADON where YEAR(NGAYLAP) = ?) ";

        try {
            PreparedStatement ppst = connect.prepareStatement(sql);
            ppst.setString(1, txtThang);
            ppst.setString(2, txtNam);
            ResultSet data = ppst.executeQuery();

            while (data.next()) {
                
                jlsldon.setText(data.getString("soluongdon"));
                jlslkhach.setText(data.getString("tongsokhach"));
                jltongtien.setText(data.getString("tongtien"));
            }
            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
