/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.SQLException;
import qlch.Bean.DanhMucBean;
import qlch.Controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import qlch.FormDangNhap.FormDangNhap;
import qlch.Model.Sach.SachDB;
/**
 *
 * @author HiHi
 */
public class MainControl extends javax.swing.JFrame {

    public static void changeTitle(String s) {
        jlTitle2.setText(s);
    }
    public static String getManv(){
        return jlbManv.getText();
    }
    public static String getTennv(){
        return jlbTennv.getText();
    }
    /**
     * Creates new form MainControl
     */
    
    
    
    public MainControl(String tennv,String manv) {
        ///
        this.enable();
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         ////
        this.setUndecorated(true);
        initComponents();
        setSize(1315, 760);
        setResizable(false);
        setTitle("Quản Lý Cửa Hàng Sách");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        ChuyenManHinhController controller = new ChuyenManHinhController(jpView);
        controller.setView(jpTrangChu, jlTrangChu);
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("CuaHang",jpCuaHang,jlCuaHang));
        listItem.add(new DanhMucBean("HoaDon",jpHoadon,jlHoaDon));
        listItem.add(new DanhMucBean("Kho",jpKho,jlKho));
        listItem.add(new DanhMucBean("SanPham",jpSanPham,jlSanPham));
        listItem.add(new DanhMucBean("ThongKe",jpThongKe,jlThongKe));
        listItem.add(new DanhMucBean("TrangChu",jpTrangChu,jlTrangChu));
        listItem.add(new DanhMucBean("TaiKhoan",jpTaiKhoan,jlTaikhoan));
        listItem.add(new DanhMucBean("PhieuNhap",jpPhieunhap,jlPhieunhap));
        controller.setEvent(listItem);
        jlbManv.setText(manv);
        jlbTennv.setText(tennv);
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jpTitle2 = new javax.swing.JPanel();
        jlTitle2 = new javax.swing.JLabel();
        jlbTennv = new javax.swing.JLabel();
        jlbManv = new javax.swing.JLabel();
        jlbQuit = new javax.swing.JLabel();
        jlbMinimize = new javax.swing.JLabel();
        jlbLogout = new javax.swing.JLabel();
        jpTrangChu = new javax.swing.JPanel();
        jlTrangChu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpCuaHang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlCuaHang = new javax.swing.JLabel();
        jpKho = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlKho = new javax.swing.JLabel();
        jpThongKe = new javax.swing.JPanel();
        jlThongKe = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jpHoadon = new javax.swing.JPanel();
        jlHoaDon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpSanPham = new javax.swing.JPanel();
        jlSanPham = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpView = new javax.swing.JPanel();
        jpTaiKhoan = new javax.swing.JPanel();
        jlTaikhoan = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpPhieunhap = new javax.swing.JPanel();
        jlPhieunhap = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setPreferredSize(new java.awt.Dimension(1300, 761));

        jpTitle2.setBackground(new java.awt.Color(40, 40, 40));

        jlTitle2.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jlTitle2.setForeground(new java.awt.Color(255, 255, 255));
        jlTitle2.setText("Trang Chủ");

        jlbTennv.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jlbTennv.setForeground(new java.awt.Color(204, 204, 204));

        jlbManv.setForeground(new java.awt.Color(40, 40, 40));
        jlbManv.setText("lbmanv");

        jlbQuit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/multiply_40px.png"))); // NOI18N
        jlbQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQuitMouseClicked(evt);
            }
        });

        jlbMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/minus_math_40px.png"))); // NOI18N
        jlbMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbMinimizeMouseClicked(evt);
            }
        });

        jlbLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/logout_rounded_left_40px.png"))); // NOI18N
        jlbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpTitle2Layout = new javax.swing.GroupLayout(jpTitle2);
        jpTitle2.setLayout(jpTitle2Layout);
        jpTitle2Layout.setHorizontalGroup(
            jpTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitle2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlbTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbManv)
                .addGap(73, 73, 73)
                .addComponent(jlTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(jlbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpTitle2Layout.setVerticalGroup(
            jpTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitle2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbManv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpTitle2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpTitle2Layout.createSequentialGroup()
                        .addGroup(jpTitle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpTrangChu.setBackground(new java.awt.Color(30, 30, 30));
        jpTrangChu.setPreferredSize(new java.awt.Dimension(225, 88));

        jlTrangChu.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlTrangChu.setForeground(new java.awt.Color(153, 153, 153));
        jlTrangChu.setText("Trang Chủ");
        jlTrangChu.setPreferredSize(new java.awt.Dimension(160, 24));

        jLabel3.setBackground(new java.awt.Color(30, 30, 30));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/monitor_42px.png"))); // NOI18N

        javax.swing.GroupLayout jpTrangChuLayout = new javax.swing.GroupLayout(jpTrangChu);
        jpTrangChu.setLayout(jpTrangChuLayout);
        jpTrangChuLayout.setHorizontalGroup(
            jpTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrangChuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
        );
        jpTrangChuLayout.setVerticalGroup(
            jpTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTrangChuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jlTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpCuaHang.setBackground(new java.awt.Color(30, 30, 30));
        jpCuaHang.setPreferredSize(new java.awt.Dimension(225, 88));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/shop_42px.png"))); // NOI18N

        jlCuaHang.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlCuaHang.setForeground(new java.awt.Color(153, 153, 153));
        jlCuaHang.setText("Cửa Hàng");
        jlCuaHang.setPreferredSize(new java.awt.Dimension(100, 24));

        javax.swing.GroupLayout jpCuaHangLayout = new javax.swing.GroupLayout(jpCuaHang);
        jpCuaHang.setLayout(jpCuaHangLayout);
        jpCuaHangLayout.setHorizontalGroup(
            jpCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCuaHangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCuaHangLayout.setVerticalGroup(
            jpCuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCuaHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpCuaHangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpKho.setBackground(new java.awt.Color(30, 30, 30));
        jpKho.setPreferredSize(new java.awt.Dimension(225, 88));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/truck_42px.png"))); // NOI18N

        jlKho.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlKho.setForeground(new java.awt.Color(153, 153, 153));
        jlKho.setText("Kho");

        javax.swing.GroupLayout jpKhoLayout = new javax.swing.GroupLayout(jpKho);
        jpKho.setLayout(jpKhoLayout);
        jpKhoLayout.setHorizontalGroup(
            jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpKhoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpKhoLayout.setVerticalGroup(
            jpKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpKhoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpThongKe.setBackground(new java.awt.Color(30, 30, 30));
        jpThongKe.setPreferredSize(new java.awt.Dimension(225, 88));

        jlThongKe.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlThongKe.setForeground(new java.awt.Color(153, 153, 153));
        jlThongKe.setText("Thống Kê");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/combo_chart_42px.png"))); // NOI18N

        javax.swing.GroupLayout jpThongKeLayout = new javax.swing.GroupLayout(jpThongKe);
        jpThongKe.setLayout(jpThongKeLayout);
        jpThongKeLayout.setHorizontalGroup(
            jpThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpThongKeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpThongKeLayout.setVerticalGroup(
            jpThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpThongKeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jpHoadon.setBackground(new java.awt.Color(30, 30, 30));
        jpHoadon.setPreferredSize(new java.awt.Dimension(225, 88));

        jlHoaDon.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlHoaDon.setForeground(new java.awt.Color(153, 153, 153));
        jlHoaDon.setText("Hóa Đơn");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/save_as_42px.png"))); // NOI18N

        javax.swing.GroupLayout jpHoadonLayout = new javax.swing.GroupLayout(jpHoadon);
        jpHoadon.setLayout(jpHoadonLayout);
        jpHoadonLayout.setHorizontalGroup(
            jpHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHoadonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpHoadonLayout.setVerticalGroup(
            jpHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHoadonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jlHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpSanPham.setBackground(new java.awt.Color(30, 30, 30));
        jpSanPham.setPreferredSize(new java.awt.Dimension(225, 88));
        jpSanPham.setRequestFocusEnabled(false);

        jlSanPham.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlSanPham.setForeground(new java.awt.Color(153, 153, 153));
        jlSanPham.setText("Sản Phẩm");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/book_shelf_42px.png"))); // NOI18N

        javax.swing.GroupLayout jpSanPhamLayout = new javax.swing.GroupLayout(jpSanPham);
        jpSanPham.setLayout(jpSanPhamLayout);
        jpSanPhamLayout.setHorizontalGroup(
            jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSanPhamLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpSanPhamLayout.setVerticalGroup(
            jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpSanPhamLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jpView.setPreferredSize(new java.awt.Dimension(1075, 690));

        javax.swing.GroupLayout jpViewLayout = new javax.swing.GroupLayout(jpView);
        jpView.setLayout(jpViewLayout);
        jpViewLayout.setHorizontalGroup(
            jpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        jpViewLayout.setVerticalGroup(
            jpViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jpTaiKhoan.setBackground(new java.awt.Color(30, 30, 30));
        jpTaiKhoan.setPreferredSize(new java.awt.Dimension(225, 88));

        jlTaikhoan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlTaikhoan.setForeground(new java.awt.Color(153, 153, 153));
        jlTaikhoan.setText("Tài Khoản");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/user_account_skin_type_7_42px.png"))); // NOI18N

        javax.swing.GroupLayout jpTaiKhoanLayout = new javax.swing.GroupLayout(jpTaiKhoan);
        jpTaiKhoan.setLayout(jpTaiKhoanLayout);
        jpTaiKhoanLayout.setHorizontalGroup(
            jpTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTaiKhoanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTaiKhoanLayout.setVerticalGroup(
            jpTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTaikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpTaiKhoanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jpPhieunhap.setBackground(new java.awt.Color(30, 30, 30));
        jpPhieunhap.setPreferredSize(new java.awt.Dimension(225, 88));

        jlPhieunhap.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlPhieunhap.setForeground(new java.awt.Color(153, 153, 153));
        jlPhieunhap.setText("Nhập Hàng");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/paper.png"))); // NOI18N

        javax.swing.GroupLayout jpPhieunhapLayout = new javax.swing.GroupLayout(jpPhieunhap);
        jpPhieunhap.setLayout(jpPhieunhapLayout);
        jpPhieunhapLayout.setHorizontalGroup(
            jpPhieunhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPhieunhapLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPhieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPhieunhapLayout.setVerticalGroup(
            jpPhieunhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlPhieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpPhieunhapLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 88));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpCuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpKho, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jpPhieunhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jpView, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jpTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jpCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jpKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jpPhieunhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQuitMouseClicked
        // TODO add your handling code here: 
        //
         ImageIcon icon = new ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/book_shelf_42px.png"));
	int input = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thoát Chương Trình?","Xác Nhận...",
	JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,icon);
           if (input==0){
               System.out.println("hi");
                        this.dispose();
                        this.disable();
            }
    }//GEN-LAST:event_jlbQuitMouseClicked

    private void jlbMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jlbMinimizeMouseClicked

    private void jlbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLogoutMouseClicked
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/book_shelf_42px.png"));
	int input = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Đăng Xuất?","Xác Nhận...",
	JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,icon);
                    if (input == 0){
                       this.dispose();
                        FormDangNhap dn = new FormDangNhap();
                        dn.setVisible(true);
                        this.disable();
            }
    }//GEN-LAST:event_jlbLogoutMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainControl().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlCuaHang;
    private javax.swing.JLabel jlHoaDon;
    private javax.swing.JLabel jlKho;
    private javax.swing.JLabel jlPhieunhap;
    private javax.swing.JLabel jlSanPham;
    private javax.swing.JLabel jlTaikhoan;
    private javax.swing.JLabel jlThongKe;
    private static javax.swing.JLabel jlTitle2;
    private javax.swing.JLabel jlTrangChu;
    private javax.swing.JLabel jlbLogout;
    private static javax.swing.JLabel jlbManv;
    private javax.swing.JLabel jlbMinimize;
    private javax.swing.JLabel jlbQuit;
    private static javax.swing.JLabel jlbTennv;
    private javax.swing.JPanel jpCuaHang;
    private javax.swing.JPanel jpHoadon;
    private javax.swing.JPanel jpKho;
    private javax.swing.JPanel jpPhieunhap;
    private javax.swing.JPanel jpSanPham;
    private javax.swing.JPanel jpTaiKhoan;
    private javax.swing.JPanel jpThongKe;
    public javax.swing.JPanel jpTitle2;
    private javax.swing.JPanel jpTrangChu;
    private javax.swing.JPanel jpView;
    // End of variables declaration//GEN-END:variables
}