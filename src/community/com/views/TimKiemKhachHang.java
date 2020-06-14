/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package community.com.views;

import baitaplon.KhachHangTable;
import baitaplon.community.com.controller.KhachHangController;
import javax.swing.table.DefaultTableModel;
import community.com.model.KhachHangObject;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hoang
 */
public class TimKiemKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form TimKiemKhachHang
     */
    KhachHangController controlKH = new KhachHangController();

    public TimKiemKhachHang() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_TimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TimKiemTable = new javax.swing.JTable();
        rd_Ma = new javax.swing.JRadioButton();
        rd_Ten = new javax.swing.JRadioButton();
        rd_SDT = new javax.swing.JRadioButton();
        txt_TimMa = new javax.swing.JTextField();
        txt_TimTen = new javax.swing.JTextField();
        txt_TimSDT = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tìm Kiếm Khách Hàng");

        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        TimKiemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "SĐT", "Ngày sinh", "Thói Quen", "Sở Thích"
            }
        ));
        jScrollPane2.setViewportView(TimKiemTable);

        buttonGroup1.add(rd_Ma);
        rd_Ma.setText("Tìm theo mã :");
        rd_Ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_MaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_Ten);
        rd_Ten.setText("Tìm theo tên:");
        rd_Ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_TenActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_SDT);
        rd_SDT.setText("Tìm theo sđt:");
        rd_SDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_SDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_Ma)
                                .addGap(18, 18, 18)
                                .addComponent(txt_TimMa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_Ten)
                                .addGap(18, 18, 18)
                                .addComponent(txt_TimTen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addComponent(btn_TimKiem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_SDT)
                                .addGap(18, 18, 18)
                                .addComponent(txt_TimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_Ma)
                    .addComponent(txt_TimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_Ten)
                    .addComponent(btn_TimKiem)
                    .addComponent(txt_TimTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TimSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void hienThi(String name, JTextField txt ) {
        DefaultTableModel table = (DefaultTableModel) TimKiemTable.getModel();
        table.setRowCount(0);
        Object[] row = new Object[6];

        for (KhachHangObject kh : controlKH.timKiemKhachHang(name, txt.getText())) {
            row[0] = kh.getMaKH();
            row[1] = kh.getTenKH();
            row[2] = kh.getSoDT();
            row[3] = kh.getNgaySinh();
            row[4] = kh.getThoiQuen();
            row[5] = kh.getSoThich();

            table.addRow(row);
        }
    }
    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
         
        
        if (rd_Ma.isSelected()) {        
            if(txt_TimMa.getText().equals("")){
                JOptionPane.showMessageDialog(this, "chua nhap ma");
                return;
            }
            hienThi("MaKH",txt_TimMa);
        }
        if (rd_Ten.isSelected()) {
            if(txt_TimTen.getText().equals("")){
                JOptionPane.showMessageDialog(this, "chua nhap ma");
                return;
            }
            hienThi("TenKH",txt_TimTen);
        }
        if (rd_SDT.isSelected()) {
            if(txt_TimSDT.getText().equals("")){
                JOptionPane.showMessageDialog(this, "chua nhap ma");
                return;
            }
            hienThi("SoDT",txt_TimSDT);
        }
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void rd_MaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_MaActionPerformed
        // TODO add your handling code here:
        txt_TimSDT.setEnabled(false);
        txt_TimTen.setEnabled(false);
        txt_TimMa.setEnabled(true);
    }//GEN-LAST:event_rd_MaActionPerformed

    private void rd_TenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_TenActionPerformed
       txt_TimSDT.setEnabled(false);
        txt_TimMa.setEnabled(false);
        txt_TimTen.setEnabled(true);
    }//GEN-LAST:event_rd_TenActionPerformed

    private void rd_SDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_SDTActionPerformed
        txt_TimMa.setEnabled(false);
        txt_TimTen.setEnabled(false);
        txt_TimSDT.setEnabled(true);
    }//GEN-LAST:event_rd_SDTActionPerformed

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
            java.util.logging.Logger.getLogger(TimKiemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiemKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TimKiemTable;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rd_Ma;
    private javax.swing.JRadioButton rd_SDT;
    private javax.swing.JRadioButton rd_Ten;
    private javax.swing.JTextField txt_TimMa;
    private javax.swing.JTextField txt_TimSDT;
    private javax.swing.JTextField txt_TimTen;
    // End of variables declaration//GEN-END:variables
}
