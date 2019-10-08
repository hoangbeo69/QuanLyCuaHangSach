/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.FormDangNhap;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlch.Dao.DBConnect;
import qlch.View.MainControl;

/**
 *
 * @author HiHi
 */
public class FormDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn ;
    public FormDangNhap() {
        this.enable();
        this.setUndecorated(true);
        initComponents();
        this.setSize(850, 540);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfMatkhau = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        tfTaikhoan = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lbExit = new javax.swing.JLabel();
        lbMinimize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbThongbao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfMatkhau.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfMatkhau.setForeground(new java.awt.Color(94, 92, 91));
        tfMatkhau.setText("jPasswordField1");
        tfMatkhau.setBorder(null);
        tfMatkhau.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfMatkhau.setDoubleBuffered(true);
        tfMatkhau.setOpaque(false);
        tfMatkhau.setSelectionColor(new java.awt.Color(102, 102, 102));
        tfMatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatkhauActionPerformed(evt);
            }
        });
        jPanel1.add(tfMatkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 300, 40));

        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 208, 300, 40));

        tfTaikhoan.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfTaikhoan.setForeground(new java.awt.Color(94, 92, 91));
        tfTaikhoan.setText("Tài Khoản");
        tfTaikhoan.setBorder(null);
        tfTaikhoan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfTaikhoan.setDoubleBuffered(true);
        tfTaikhoan.setOpaque(false);
        tfTaikhoan.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        tfTaikhoan.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPanel1.add(tfTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 300, 40));
        tfTaikhoan.setBackground(new java.awt.Color(0,0,0,0));

        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 300, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 53, 47));
        jLabel1.setText("Mật Khẩu");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 320, 30));

        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\HiHi\\Documents\\NetBeansProjects\\QuanLyCuaHang\\src\\qlch\\Image\\GiaoDien\\multiply_30px.png")); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        jPanel1.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 40, 40));

        lbMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimize.setIcon(new javax.swing.ImageIcon("C:\\Users\\HiHi\\Documents\\NetBeansProjects\\QuanLyCuaHang\\src\\qlch\\Image\\GiaoDien\\minus_math_30px.png")); // NOI18N
        lbMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(lbMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 53, 47));
        jLabel3.setText("Tài Khoản");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 320, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/71403500_449022995702351_6447127579269791744_n.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 190, 60));

        jlbThongbao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlbThongbao.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jlbThongbao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 300, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HiHi\\Documents\\NetBeansProjects\\QuanLyCuaHang\\src\\qlch\\Image\\GiaoDien\\2608782.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 6, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 850, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizeMouseClicked
        // TODO add your handling code here:
          this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lbMinimizeMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        this.disable();
    }//GEN-LAST:event_lbExitMouseClicked

    private void tfMatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMatkhauActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        String taikhoan = tfTaikhoan.getText();
        String matkhau = tfMatkhau.getText();
        if(matkhau.equals("")||taikhoan.equals("")){
            jlbThongbao.setText("Sai Tên Tài Khoản Hoặc Mật Khẩu");     
        }else{
                String manv = checkTaiKhoan(taikhoan, matkhau);
               if(!manv.equals("")){
                   System.out.println("Đăng Nhập Thành Công");
                   String ten = layTenNhanVien(manv);
                          MainControl main = new MainControl(ten,manv);
                           main.setVisible(true);
                           this.dispose();
                           this.disable();
                }else{
                jlbThongbao.setText("Sai Tên Tài Khoản Hoặc Mật Khẩu");
                tfMatkhau.setText("");
                }
            }
    }//GEN-LAST:event_jLabel6MouseClicked
    private String checkTaiKhoan(String taikhoan,String matkhau){
    conn = DBConnect.getConnection();
    String manv = "";
    try {
            String query = "select MaNV as moi from taikhoan where TenTK ='" + taikhoan + "' and MatKhau = '"+matkhau+"'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    manv = result.getString("moi");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }finally {
        try {
            conn.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        }
        return manv;
    }
    
    private String layTenNhanVien(String manv){
    conn = DBConnect.getConnection();
    String tennv = "";
    try {
            String query = "select TenNV as moi from nhanvien where MaNV ='" + manv + "'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    tennv = result.getString("moi");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }finally {
        try {
            conn.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        }
        return tennv;
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbThongbao;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbMinimize;
    private javax.swing.JPasswordField tfMatkhau;
    private javax.swing.JTextField tfTaikhoan;
    // End of variables declaration//GEN-END:variables
}
