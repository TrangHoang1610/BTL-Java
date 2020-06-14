/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package community.com.views;

import baitaplon.DataConnection;
import community.com.model.KhachHangObject;
import baitaplon.KhachHangTable;
import baitaplon.community.com.controller.KhachHangController;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Hoang Trang
 */
public final class QLKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form QLKhachHang
     */
    
    KhachHangController controll = new KhachHangController();
    
    int rowSelected = -1;
    DataConnection cn = new DataConnection();
    ArrayList<KhachHangObject> dsKH = new ArrayList<>();
    
    public void showTable(ArrayList<KhachHangObject> dsKH){
        rowSelected = -1;
        KhachHangTable.setModel(new KhachHangTable(dsKH));
    }
    
    public QLKhachHang() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showTable(controll.getKH());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KhachHangTable = new javax.swing.JTable();
        ntn_TimKiem = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        txt_TenKH = new javax.swing.JTextField();
        txt_NgaySinh = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        txt_ThoiQuen = new javax.swing.JTextField();
        txtSoThich = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_MaKH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quản lý khách hàng");

        KhachHangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên", "SĐT", "Ngày sinh", "Thói quen", "Sở thích"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KhachHangTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhachHangTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KhachHangTable);
        if (KhachHangTable.getColumnModel().getColumnCount() > 0) {
            KhachHangTable.getColumnModel().getColumn(0).setResizable(false);
            KhachHangTable.getColumnModel().getColumn(1).setResizable(false);
            KhachHangTable.getColumnModel().getColumn(2).setResizable(false);
            KhachHangTable.getColumnModel().getColumn(4).setResizable(false);
            KhachHangTable.getColumnModel().getColumn(5).setResizable(false);
        }

        ntn_TimKiem.setText("Tìm kiếm");

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

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên KH:");

        jLabel3.setText("SĐT:");

        jLabel4.setText("Ngày Sinh:");

        jLabel5.setText("Sở thích:");

        jLabel6.setText("Thói quen:");

        jLabel7.setText("MaKH:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btn_Them)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sua)
                        .addGap(27, 27, 27)
                        .addComponent(btn_xoa)
                        .addGap(18, 18, 18)
                        .addComponent(ntn_TimKiem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoThich, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txt_ThoiQuen))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sua)
                            .addComponent(btn_xoa)
                            .addComponent(ntn_TimKiem)
                            .addComponent(btn_Them)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoThich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ThoiQuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );

        btn_Them.getAccessibleContext().setAccessibleName("btn_Them");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
         if (txt_MaKH.getText().equals("") || txt_TenKH.getText().equals("") || txt_SDT.getText().equals("")
                || txt_NgaySinh.getText().equals("") || txt_ThoiQuen.getText().equals("") || txtSoThich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return;
        }
        
        String tenKH = txt_TenKH.getText();
        String SDT = txt_SDT.getText();
        Date ngaySinh = Date.valueOf(txt_NgaySinh.getText());
        String thoiQuen = txt_ThoiQuen.getText();
        String soThich = txtSoThich.getText();
        String maKH = txt_MaKH.getText();
        
        KhachHangObject kh = new KhachHangObject(maKH, tenKH, SDT, ngaySinh, thoiQuen, soThich);
        if(controll.suaKhachHang(kh)== true){
          
            showTable(controll.getKH());
            System.out.println("size of array:" + controll.getKH().size());
        }else{
            JOptionPane.showMessageDialog(this, "faile");
        }
        
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        
        new KhachHang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void KhachHangTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhachHangTableMouseClicked
         JTable source=(JTable) evt.getSource();
       int row=source.rowAtPoint(evt.getPoint());
       txt_MaKH.setText(source.getModel().getValueAt(row,0).toString());
       txt_TenKH.setText(source.getModel().getValueAt(row,1).toString());
       txt_SDT.setText(source.getModel().getValueAt(row,2 ).toString());
       txt_NgaySinh.setText(source.getModel().getValueAt(row, 3).toString());
       txt_ThoiQuen.setText(source.getModel().getValueAt(row, 4).toString());
       txtSoThich.setText(source.getModel().getValueAt(row, 5).toString());
    }//GEN-LAST:event_KhachHangTableMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
         if (txt_MaKH.getText().equals("") || txt_TenKH.getText().equals("") || txt_SDT.getText().equals("")
                || txt_NgaySinh.getText().equals("") || txt_ThoiQuen.getText().equals("") || txtSoThich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return;
        }
        
        String tenKH = txt_TenKH.getText();
        String SDT = txt_SDT.getText();
        Date ngaySinh = Date.valueOf(txt_NgaySinh.getText());
        String thoiQuen = txt_ThoiQuen.getText();
        String soThich = txtSoThich.getText();
        String maKH = txt_MaKH.getText();
        KhachHangObject kh = new KhachHangObject(maKH, tenKH, SDT, ngaySinh, thoiQuen, soThich);
        if(controll.xoaKhachHang(kh)==true){
            showTable(controll.getKH());
            txt_MaKH.setText("");
            txt_TenKH.setText("");
            txt_SDT.setText("");
            txt_NgaySinh.setText("");
            txt_ThoiQuen.setText("");
            txtSoThich.setText("");
        }
        
    }//GEN-LAST:event_btn_xoaActionPerformed

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
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable KhachHangTable;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ntn_TimKiem;
    private javax.swing.JTextField txtSoThich;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_NgaySinh;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_ThoiQuen;
    // End of variables declaration//GEN-END:variables
}
