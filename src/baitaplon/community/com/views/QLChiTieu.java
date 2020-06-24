/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.views;

import Util.Format1;
import baitaplon.community.com.controller.ChiTieuDAO;
import community.com.model.ChiTieu;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hoang Trang
 */
public class QLChiTieu extends javax.swing.JFrame {

    private final String[] header = {"STT", "Mã Chi Tiêu", "Tên khoản chi", "Ngày", "Số tiền"};
    private ArrayList<ChiTieu> items = new ArrayList<>();
    private int selectedIndex;
    private DefaultTableModel model;

    public QLChiTieu() {
        initComponents();
        model = (DefaultTableModel) tableChiTieu.getModel();
        model.setColumnIdentifiers(header);
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void clearText() {
        txt_MaHang.setText("");
        txt_TenKhoanChi.setText("");
        txtSoTien.setText("");
        DateChooser.setDateFormatString("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChiTieu = new javax.swing.JTable();
        MaHang = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_MaHang = new javax.swing.JTextField();
        txt_TenKhoanChi = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý chi tiêu");
        setLocation(new java.awt.Point(0, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quản lý chi tiêu cho cửa hàng");

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        tableChiTieu.setModel(new javax.swing.table.DefaultTableModel(
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
        tableChiTieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChiTieuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableChiTieu);

        MaHang.setText("Mã khoản chi:");

        jLabel6.setText("Số tiền:");

        jLabel3.setText("Tên Khoản Chi:");

        jLabel4.setText("Ngày:");

        txtSoTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTienActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_them)
                            .addGap(18, 18, 18)
                            .addComponent(btn_sua)
                            .addGap(18, 18, 18)
                            .addComponent(btn_xoa)
                            .addGap(30, 30, 30)
                            .addComponent(btn_TimKiem)
                            .addGap(30, 30, 30)
                            .addComponent(btnThoat)
                            .addGap(17, 17, 17))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaHang)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_MaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(txt_TenKhoanChi)
                                    .addComponent(txtSoTien)
                                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaHang)
                    .addComponent(txt_MaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_TenKhoanChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(btn_TimKiem)
                    .addComponent(btnThoat))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if("".equals(txt_MaHang.getText())) JOptionPane.showMessageDialog(this, "không để trống mã khoản chi");
        else if("".equals(txt_TenKhoanChi.getText())) JOptionPane.showMessageDialog(this, "không để trống tên khoản chi");
        else if("".equals(txtSoTien.getText())) JOptionPane.showMessageDialog(this, "không để trống số tiền");
        else{
        boolean isSuccess = true;
        String maHD = txt_MaHang.getText();
        String tenKhoanChi = txt_TenKhoanChi.getText();
        Double soTien = Double.parseDouble(txtSoTien.getText());
        String ngay = ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText();

        if (isSuccess) {
            ChiTieu item = new ChiTieu(maHD, tenKhoanChi, ngay, soTien);
            if (new ChiTieuDAO().addItem(item)) {
                this.showTable();
                JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
                clearText();
            } else {
                JOptionPane.showMessageDialog(this, "Hóa đơn đã tồn tại!");
            }
        }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void txtSoTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTienActionPerformed

    private void tableChiTieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChiTieuMouseClicked
        int row = tableChiTieu.getSelectedRow();
        txt_MaHang.setText(model.getValueAt(row, 1).toString());
        txt_TenKhoanChi.setText(model.getValueAt(row, 2).toString());
        ((JTextField) DateChooser.getDateEditor().getUiComponent()).setText(model.getValueAt(row, 3).toString());
        txtSoTien.setText(model.getValueAt(row, 4).toString());

    }//GEN-LAST:event_tableChiTieuMouseClicked

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
 //       Date ngay = java.sql.Date.valueOf(Format1.DATE_FORMAT_SQL.format(DateChooser.getDate()));
        ChiTieu item = new ChiTieu(txt_MaHang.getText(), txt_TenKhoanChi.getText(), ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText(), Double.parseDouble(txtSoTien.getText()));
        if (new ChiTieuDAO().updateItem(item)) {
            this.showTable();
            JOptionPane.showMessageDialog(this, "Sửa mới thành công!");
            clearText();
        } else {
            JOptionPane.showMessageDialog(this, "Không sửa được");
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
 //       Date ngay = java.sql.Date.valueOf(Format1.DATE_FORMAT_SQL.format(DateChooser.getDate()));
        ChiTieu item = new ChiTieu(txt_MaHang.getText(), txt_TenKhoanChi.getText(), ((JTextField) DateChooser.getDateEditor().getUiComponent()).getText(), Double.parseDouble(txtSoTien.getText()));
        int click=JOptionPane.showConfirmDialog(null, "Bạn có chắc chán xóa không");
        if(click==JOptionPane.YES_OPTION)
        {
        if (new ChiTieuDAO().deleteItem(item)) {
            this.showTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            clearText();
        } else {
            JOptionPane.showMessageDialog(this, "Không sửa được");
        }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String maSP = txt_MaHang.getText().trim();
        String tenKC=txt_TenKhoanChi.getText().trim();
        items = new ChiTieuDAO().searchItem(maSP,tenKC);
        model.setRowCount(0);
        for (ChiTieu item : items) {
            model.addRow(new Object[]{
                model.getRowCount() + 1, item.getMaCT(), item.getTenKhoanChi(), item.getNgay(), item.getSoTien()
            });
        }
        clearText();
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        new ScreenMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(QLChiTieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLChiTieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLChiTieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLChiTieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLChiTieu().setVisible(true);
            }
        });
    }

    public void showTable() {
        items = new ChiTieuDAO().getChiTieus();
        model.setRowCount(0);
        for (ChiTieu item : items) {
            model.addRow(new Object[]{
                model.getRowCount() + 1, item.getMaCT(), item.getTenKhoanChi(), item.getNgay(), item.getSoTien()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel MaHang;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableChiTieu;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txt_MaHang;
    private javax.swing.JTextField txt_TenKhoanChi;
    // End of variables declaration//GEN-END:variables
}