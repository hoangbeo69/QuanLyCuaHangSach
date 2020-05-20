/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.View;

import java.awt.Font;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import qlch.Model.HoaDon.ChiTietHD;
import qlch.Model.HoaDon.HoaDon;
import qlch.Model.HoaDon.HoaDonDB;
import qlch.Model.PhieuNhap.PhieuNhapDB;
import qlch.Model.Sach.Sach;
import qlch.Model.Sach.SachDB;

/**
 *
 * @author HiHi
 */
public class HoaDonPanel extends javax.swing.JPanel {

    /**
     * Creates new form HoaDonPanel
     */
    int row  = -1;
    HoaDonDB db = new HoaDonDB();
    DefaultTableModel table;
    String tencot= "MaHD";
    String query = "";
    String tungay = "";
    String denngay = "";
    public HoaDonPanel() {
        initComponents();
        CreateColumsTable();
        TableHoaDon.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        try {
            Populate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        sort();
        
    }
    
     // Tạo tên cho cột
    private void CreateColumsTable(){
        table  = (DefaultTableModel) TableHoaDon.getModel();
        table.addColumn("Mã Hóa Đơn");
        table.addColumn("Mã Nhân Viên");
        table.addColumn("Mã Khách Hàng");
        table.addColumn("Ngày Lập");
        table.addColumn("Giờ Lập");
        table.addColumn("Tổng Tiền");
    }
    //Đổ Data cho bảng 
    private void Populate() throws SQLException{   
          setDataToTable(db.getAllHoaDon(),table);
    }
    //Đổ data từ arraylist vào row data
    private void setDataToTable(ArrayList<HoaDon> data,DefaultTableModel table){
        table.setRowCount(0);
        for(HoaDon s :data){
            table.addRow(new String[]{
             s.getMahd(),s.getManv(),s.getMakh(),s.getNgaylap(),s.getGiolap(),s.getTongtien()+" VNĐ"
            });
        }
    }
    //Sắp xếp theo cột
    private  void sort(){
        TableRowSorter<DefaultTableModel> sorter    = new TableRowSorter<DefaultTableModel>(table);
        TableHoaDon.setRowSorter(sorter);
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
        TableHoaDon = new javax.swing.JTable();
        jpTimkiem6 = new javax.swing.JPanel();
        lbNgaynhap = new javax.swing.JLabel();
        jpTimkiem7 = new javax.swing.JPanel();
        lbGionhap = new javax.swing.JLabel();
        jpTimkiem3 = new javax.swing.JPanel();
        lbMahoadon = new javax.swing.JLabel();
        jpTimkiem4 = new javax.swing.JPanel();
        lbTennhanvien = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jcTimkiem = new javax.swing.JComboBox<>();
        jpTimkiem = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jpTimkiem1 = new javax.swing.JPanel();
        jxTungay = new org.jdesktop.swingx.JXDatePicker();
        jpTimkiem2 = new javax.swing.JPanel();
        jxDenngay = new org.jdesktop.swingx.JXDatePicker();
        btnRefresh = new javax.swing.JButton();
        btnXemchitiet = new javax.swing.JButton();
        jpTimkiem5 = new javax.swing.JPanel();
        lbTenkhachhang = new javax.swing.JLabel();

        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TableHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableHoaDon.setForeground(new java.awt.Color(0, 0, 0));
        TableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableHoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        TableHoaDon.setRowHeight(40);
        TableHoaDon.setSelectionBackground(new java.awt.Color(51, 51, 51));
        TableHoaDon.setSelectionForeground(new java.awt.Color(204, 204, 204));
        TableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableHoaDon);

        jpTimkiem6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem6.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem6.setToolTipText("");
        jpTimkiem6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        lbNgaynhap.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lbNgaynhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem6Layout = new javax.swing.GroupLayout(jpTimkiem6);
        jpTimkiem6.setLayout(jpTimkiem6Layout);
        jpTimkiem6Layout.setHorizontalGroup(
            jpTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNgaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiem6Layout.setVerticalGroup(
            jpTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem6Layout.createSequentialGroup()
                .addComponent(lbNgaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTimkiem7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giờ Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem7.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem7.setToolTipText("");
        jpTimkiem7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        lbGionhap.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbGionhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem7Layout = new javax.swing.GroupLayout(jpTimkiem7);
        jpTimkiem7.setLayout(jpTimkiem7Layout);
        jpTimkiem7Layout.setHorizontalGroup(
            jpTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGionhap, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiem7Layout.setVerticalGroup(
            jpTimkiem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem7Layout.createSequentialGroup()
                .addComponent(lbGionhap, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTimkiem3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem3.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem3.setToolTipText("");
        jpTimkiem3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        lbMahoadon.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lbMahoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem3Layout = new javax.swing.GroupLayout(jpTimkiem3);
        jpTimkiem3.setLayout(jpTimkiem3Layout);
        jpTimkiem3Layout.setHorizontalGroup(
            jpTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTimkiem3Layout.setVerticalGroup(
            jpTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem3Layout.createSequentialGroup()
                .addComponent(lbMahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTimkiem4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem4.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem4.setToolTipText("");
        jpTimkiem4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        lbTennhanvien.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lbTennhanvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem4Layout = new javax.swing.GroupLayout(jpTimkiem4);
        jpTimkiem4.setLayout(jpTimkiem4Layout);
        jpTimkiem4Layout.setHorizontalGroup(
            jpTimkiem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTennhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiem4Layout.setVerticalGroup(
            jpTimkiem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem4Layout.createSequentialGroup()
                .addComponent(lbTennhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1075, 99));

        jcTimkiem.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jcTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        jcTimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Mã Hóa Đơn", "Mã Nhân Viên", "Mã Khách Hàng" }));
        jcTimkiem.setPreferredSize(new java.awt.Dimension(154, 29));
        jcTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTimkiemActionPerformed(evt);
            }
        });

        jpTimkiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tất Cả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem.setToolTipText("");
        jpTimkiem.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setPreferredSize(new java.awt.Dimension(245, 32));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpTimkiemLayout = new javax.swing.GroupLayout(jpTimkiem);
        jpTimkiem.setLayout(jpTimkiemLayout);
        jpTimkiemLayout.setHorizontalGroup(
            jpTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiemLayout.setVerticalGroup(
            jpTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTimkiem1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Từ Ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem1.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem1.setToolTipText("");
        jpTimkiem1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jxTungay.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jxTungay.setPreferredSize(new java.awt.Dimension(136, 33));
        jxTungay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxTungayActionPerformed(evt);
            }
        });
        jxTungay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jxTungayKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpTimkiem1Layout = new javax.swing.GroupLayout(jpTimkiem1);
        jpTimkiem1.setLayout(jpTimkiem1Layout);
        jpTimkiem1Layout.setHorizontalGroup(
            jpTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTimkiem1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jxTungay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTimkiem1Layout.setVerticalGroup(
            jpTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jxTungay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTimkiem2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đến Ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem2.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem2.setToolTipText("");
        jpTimkiem2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jxDenngay.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jxDenngay.setPreferredSize(new java.awt.Dimension(136, 33));
        jxDenngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxDenngayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTimkiem2Layout = new javax.swing.GroupLayout(jpTimkiem2);
        jpTimkiem2.setLayout(jpTimkiem2Layout);
        jpTimkiem2Layout.setHorizontalGroup(
            jpTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTimkiem2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jxDenngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTimkiem2Layout.setVerticalGroup(
            jpTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jxDenngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRefresh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/recurring_appointment_32px.png"))); // NOI18N
        btnRefresh.setText("Làm Mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnXemchitiet.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnXemchitiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/kho.png"))); // NOI18N
        btnXemchitiet.setText("Xem Chi Tiết");
        btnXemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemchitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXemchitiet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpTimkiem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTimkiem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jcTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTimkiem5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem5.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem5.setToolTipText("");
        jpTimkiem5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        lbTenkhachhang.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lbTenkhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem5Layout = new javax.swing.GroupLayout(jpTimkiem5);
        jpTimkiem5.setLayout(jpTimkiem5Layout);
        jpTimkiem5Layout.setHorizontalGroup(
            jpTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTenkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiem5Layout.setVerticalGroup(
            jpTimkiem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem5Layout.createSequentialGroup()
                .addComponent(lbTenkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jpTimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTimkiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTimkiem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTimkiem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTimkiem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTimkiem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpTimkiem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpTimkiem5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpTimkiem6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpTimkiem7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents
    //sự kiện click vào table trả về row
    private void TableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHoaDonMouseClicked
        // TODO add your handling code here:
        row = TableHoaDon.getSelectedRow();
        setTextToField(row);
    }//GEN-LAST:event_TableHoaDonMouseClicked
    private void setTextToField(int row){
        lbMahoadon.setText(TableHoaDon.getModel().getValueAt(row,0)+"");
        String manv = TableHoaDon.getModel().getValueAt(row,1)+"";
        String makh = TableHoaDon.getModel().getValueAt(row,2)+"";
        try {
            lbTennhanvien.setText(db.getTenNhanVien(manv));
             lbTenkhachhang.setText(db.getTenKhachHang(makh));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        lbNgaynhap.setText(TableHoaDon.getModel().getValueAt(row,3)+"");
        lbGionhap.setText(TableHoaDon.getModel().getValueAt(row,4)+"");
             
    }
    //event trong combobox
    private void jcTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTimkiemActionPerformed
        // TODO add your handling code here:
        int x = jcTimkiem.getSelectedIndex();
        switch(x){
            case 0:
            jpTimkiem.setBorder(BorderFactory.createTitledBorder("Tất Cả"));
            break;
            case 1 :
            jpTimkiem.setBorder(BorderFactory.createTitledBorder("Mã Hóa Đơn"));
            break;
            case 2 :
            jpTimkiem.setBorder(BorderFactory.createTitledBorder("Mã Nhân Viên"));
            break;
            case 3 :
            jpTimkiem.setBorder(BorderFactory.createTitledBorder("Mã Khách Hàng"));
            break;
        }
    }//GEN-LAST:event_jcTimkiemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        // lấy giờ ngayluc này
        //LocalDate ngayLap = java.time.LocalDate.now();
        // TODO add your handling code here:
        //Lấy Dữ Liệu Từ JdatePicker
        query = jTextField1.getText().toLowerCase();
        try {
            setDataToTable(db.searchTable(tencot,query,tungay,denngay),table);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        sort();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jxTungayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxTungayActionPerformed
        // TODO add your handling code here:
        Date tn = jxTungay.getDate();
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(tn !=null){
            tungay = oDateFormat.format(tn);
        }
        try {
            setDataToTable(db.searchTable(tencot,query,tungay,denngay),table);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        sort();

    }//GEN-LAST:event_jxTungayActionPerformed

    private void jxTungayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jxTungayKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jxTungayKeyReleased

    private void jxDenngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxDenngayActionPerformed
        // TODO add your handling code here:
        Date dn = jxDenngay.getDate();
        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(dn !=null){
            denngay = oDateFormat.format(dn);
        }
        try {
            setDataToTable(db.searchTable(tencot,query,tungay,denngay),table);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        sort();
    }//GEN-LAST:event_jxDenngayActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
            db  = new HoaDonDB();
        try {
            setDataToTable(db.getAllHoaDon(),table);
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            sort();

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnXemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemchitietActionPerformed
        // TODO add your handling code here:
        if(row ==-1){
            JOptionPane.showMessageDialog(null,"Bạn cần chọn phiếu nhập để xem chi tiết");
        }else{
            
            String MaHD =  TableHoaDon.getModel().getValueAt(row,0)+"";
            try{
            ChiTietHD pn = new ChiTietHD(MaHD);
            pn.setVisible(true);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnXemchitietActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableHoaDon;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnXemchitiet;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcTimkiem;
    private javax.swing.JPanel jpTimkiem;
    private javax.swing.JPanel jpTimkiem1;
    private javax.swing.JPanel jpTimkiem2;
    private javax.swing.JPanel jpTimkiem3;
    private javax.swing.JPanel jpTimkiem4;
    private javax.swing.JPanel jpTimkiem5;
    private javax.swing.JPanel jpTimkiem6;
    private javax.swing.JPanel jpTimkiem7;
    private org.jdesktop.swingx.JXDatePicker jxDenngay;
    private org.jdesktop.swingx.JXDatePicker jxTungay;
    private javax.swing.JLabel lbGionhap;
    private javax.swing.JLabel lbMahoadon;
    private javax.swing.JLabel lbNgaynhap;
    private javax.swing.JLabel lbTenkhachhang;
    private javax.swing.JLabel lbTennhanvien;
    // End of variables declaration//GEN-END:variables
}