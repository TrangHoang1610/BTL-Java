/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplon.community.com.views;

import baitaplon.community.com.controller.DataConnection;
import community.com.model.KhachHangObject;
import baitaplon.community.com.controller.KhachHangTable;
import baitaplon.community.com.controller.KhachHangController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.regex.Pattern;
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
        jdateNgaySinh = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

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

        ntn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_male_user.png"))); // NOI18N
        ntn_TimKiem.setText("Tìm kiếm");
        ntn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntn_TimKiemActionPerformed(evt);
            }
        });

        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_male_user.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove_male_user.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/accept_male_user.png"))); // NOI18N
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
                .addGap(79, 79, 79)
                .addComponent(btn_Them)
                .addGap(41, 41, 41)
                .addComponent(btn_sua)
                .addGap(52, 52, 52)
                .addComponent(btn_xoa)
                .addGap(51, 51, 51)
                .addComponent(ntn_TimKiem)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(jdateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoThich, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txt_ThoiQuen))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jdateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoThich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ThoiQuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Them)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_sua)
                        .addComponent(btn_xoa)
                        .addComponent(ntn_TimKiem)))
                .addContainerGap())
        );

        btn_Them.getAccessibleContext().setAccessibleName("btn_Them");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
         if (txt_MaKH.getText().equals("") || txt_TenKH.getText().equals("") || txt_SDT.getText().equals("")
                 || txt_ThoiQuen.getText().equals("") || txtSoThich.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return;
        }
        
        String tenKH = txt_TenKH.getText();
        String SDT = txt_SDT.getText();
        Date ngaySinh =  new  java.sql.Date (jdateNgaySinh.getDate().getTime());
        String thoiQuen = txt_ThoiQuen.getText();
        String soThich = txtSoThich.getText();
        String maKH = txt_MaKH.getText();
        
         String SDT_PATTERN =  "[0-9]{3,3}-?[0-9]{3,3}-?[0-9]{3,4}";
        if(Pattern.matches(SDT_PATTERN,SDT)==false){
            System.out.println(SDT_PATTERN.matches(SDT ));
            JOptionPane.showMessageDialog(this,"SDT sai dinh dang");
            return;
        }
        
        KhachHangObject kh = new KhachHangObject(maKH, tenKH, SDT, ngaySinh, thoiQuen, soThich);
        if(controll.suaKhachHang(kh)== true){
          
            showTable(controll.getKH());
            System.out.println("size of array:" + controll.getKH().size());
        }else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy mã");
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
       jdateNgaySinh.setDate( (java.sql.Date) source.getModel().getValueAt(row, 3));   
       txt_ThoiQuen.setText(source.getModel().getValueAt(row, 4).toString());
       txtSoThich.setText(source.getModel().getValueAt(row, 5).toString());
       txt_MaKH.setEnabled(false);
    }//GEN-LAST:event_KhachHangTableMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
         if (txt_MaKH.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã khách hàng");
            return;
        }
        
       
        String maKH = txt_MaKH.getText();
        KhachHangObject kh = new KhachHangObject();
        kh.setMaKH(maKH);
        if(controll.xoaKhachHang(kh)==true){
            showTable(controll.getKH());
            txt_MaKH.setText("");
            txt_TenKH.setText("");
            txt_SDT.setText("");
            txt_ThoiQuen.setText("");
            txtSoThich.setText("");
        }
        
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void ntn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntn_TimKiemActionPerformed
        // TODO add your handling code here:
        new TimKiemKhachHang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ntn_TimKiemActionPerformed

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
    private org.jdesktop.swingx.JXDatePicker jdateNgaySinh;
    private javax.swing.JButton ntn_TimKiem;
    private javax.swing.JTextField txtSoThich;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_ThoiQuen;
    // End of variables declaration//GEN-END:variables
}
