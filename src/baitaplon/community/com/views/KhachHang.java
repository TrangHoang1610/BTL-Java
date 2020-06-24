/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.views;

import baitaplon.community.com.controller.KhachHangTable;
import baitaplon.community.com.controller.KhachHangController;
import community.com.model.KhachHangObject;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Trang
 */
public class KhachHang extends javax.swing.JFrame {

    /**
     * Creates new form KhachHang
     */
    KhachHangController controlKH = new KhachHangController();

    public KhachHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_MaKH = new javax.swing.JTextField();
        txt_Ten = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        txt_ThoiQuen = new javax.swing.JTextField();
        txt_SoThich = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_HuyBo = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jdateNgaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Mã khách hàng:");

        jLabel3.setText("Tên:");

        jLabel4.setText("SĐT:");

        jLabel5.setText("Thói quen:");

        jLabel6.setText("Sở thích:");

        txt_SoThich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoThichActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Thêm khách hàng");

        btn_add.setText("Thêm");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_HuyBo.setText("Đóng");
        btn_HuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyBoActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày sinh:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ThoiQuen)
                                    .addComponent(txt_SoThich)
                                    .addComponent(jdateNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(93, 93, 93))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Ten)
                                    .addComponent(txt_SDT))))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btn_add)
                        .addGap(38, 38, 38)
                        .addComponent(btn_HuyBo)
                        .addGap(39, 39, 39)
                        .addComponent(btn_reset)
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jdateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ThoiQuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SoThich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_HuyBo)
                    .addComponent(btn_reset))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_SoThich.setText("");
        txt_MaKH.setText("");
        txt_SDT.setText("");
        txt_ThoiQuen.setText("");
        txt_Ten.setText("");

    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed


        if (txt_MaKH.getText().equals("") || txt_Ten.getText().equals("") || txt_SDT.getText().equals("")
                || txt_ThoiQuen.getText().equals("") || txt_SoThich.getText().equals("")|| jdateNgaySinh.getDate()==null) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return;
        }
        
        String maKH = txt_MaKH.getText();
        String ten = txt_Ten.getText();
        String SDT = txt_SDT.getText();
        Date ngaySinh = new java.sql.Date (jdateNgaySinh.getDate().getTime()); // bắt lỗi chỗ này bắt lỗi ngày sinh 
        String ghiChu = txt_SoThich.getText();
        String sinhNhat = txt_ThoiQuen.getText();

          
        String MA_PATTERN = "^([KH]+)[0-9]{1,5}";
        if(Pattern.matches(MA_PATTERN, maKH)==false){
            JOptionPane.showMessageDialog(this, "MaKH co dinh dang KH[0-9]");
            return;
        }

        
        String SDT_PATTERN =  "[0-9]{3,3}-?[0-9]{3,3}-?[0-9]{3,4}";
        if(Pattern.matches(SDT_PATTERN,SDT)==false){
            System.out.println(SDT_PATTERN.matches(SDT ));
            JOptionPane.showMessageDialog(this,"SDT sai dinh dang");
            return;
        }
       
        KhachHangObject kh = new KhachHangObject(maKH, ten, SDT, ngaySinh, sinhNhat, ghiChu);
        //System.out.println("kh is exsit:" + controlKH.getKH().contains(kh));
//        if (controlKH.getKH().contains(kh) == true) {
//            JOptionPane.showMessageDialog(this, "MAKH DA TON TAI TRONG CSDL");
//            return;
//        }
        if(controlKH.checkTon(kh)==false){
            JOptionPane.showMessageDialog(this, "MAKH DA TON TAI TRONG CSDL");
            return;
            //controlKH.getKH().contains(kh)
        }
        if (controlKH.themKhachHang(kh) == false) {
            JOptionPane.showMessageDialog(this, "them khong thanh cong ");
        } else {

            QLKhachHang quanLyKhachHang = new QLKhachHang();
            quanLyKhachHang.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_SoThichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoThichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoThichActionPerformed

    private void btn_HuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyBoActionPerformed
       new ScreenMenu().setVisible(true); 
       this.dispose();

    }//GEN-LAST:event_btn_HuyBoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_HuyBo;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser jdateNgaySinh;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_SoThich;
    private javax.swing.JTextField txt_Ten;
    private javax.swing.JTextField txt_ThoiQuen;
    // End of variables declaration//GEN-END:variables
}