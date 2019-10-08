/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.View;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import qlch.Model.CuaHang.DanhSachHang.SanPhamHT;
import qlch.Model.CuaHang.DanhSachHang.SanPhamHTDB;
import qlch.Model.PhieuNhap.ChiTietPN;
import qlch.Model.PhieuNhap.ChiTietPNDB;
import qlch.Model.PhieuNhap.PhieuNhapDB;
import qlch.Model.Sach.SachDB;

/**
 *
 * @author HiHi
 */
public class KhoPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhoPanel
     */
    public KhoPanel() {
        initComponents();
        setSize(1075,690);
        lbMaNhanVien.setText(MainControl.getManv());
        lbTenNhanVien.setText(MainControl.getTennv());
        //Table Hiển Thị Sách
        CreateColumsTable1();
        Populate1();
        sort1();
            setDate();
        TableHTSach.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        //     
        
        
        CreateColumsTable2();
        Populate2();
        sort2();
        TableChiTiet.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
    }   
    
    
    public void setDate(){
        ActionListener atc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime myDate = java.time.LocalDateTime.now();
               lbGio.setText(myDate.getHour()+":"+myDate.getMinute()+":"+myDate.getSecond());
               lbNgay.setText(myDate.getDayOfMonth()+"/"+myDate.getMonthValue()+"/"+myDate.getYear());
            }
        };
        new javax.swing.Timer(1000,atc).start();
    }
    
    int row1  = -1;
    DefaultTableModel table1;
    //****************Table Sach********************//
    // Xử Lý trong table hiển thị danh sách sách
    //////////////////////////////////
    private void CreateColumsTable1(){
        table1  = (DefaultTableModel) TableHTSach.getModel();
        table1.addColumn("Mã Sách");
        table1.addColumn("Đơn Giá");
        table1.addColumn("Số Lượng");
        
    }
    //Đổ Data cho bảng 
    private void Populate1() {   
        SanPhamHTDB db = new SanPhamHTDB();
        PhieuNhapDB db1 = new PhieuNhapDB();
        ChiTietPNDB db2 = new ChiTietPNDB();
        try {
            setDataToTable1(db.getAllHTSach(), table1);
            lbMaPhieuNhap.setText("PN"+(db1.MaPN()+1));
            lbTongphieunhap.setText(db2.tongTien(lbMaPhieuNhap.getText()+"")+"");
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Đổ data từ arraylist vào row data
    private void setDataToTable1(ArrayList<SanPhamHT> data,DefaultTableModel table){
        table.setRowCount(0);
        for(SanPhamHT s :data){
            table.addRow(new String[]{
             s.getMasach(),s.getDongia(),s.getSoluong()
            });
        }
    }
    //Sắp xếp theo cột
    private  void sort1(){
        TableRowSorter<DefaultTableModel> sorter    = new TableRowSorter<DefaultTableModel>(table1);
        TableHTSach.setRowSorter(sorter);
    }
    ///////////////////////////////////
    
    
        int row2  = -1;
    DefaultTableModel table2;
    
    
    
        // Xử Lý trong table hiển thị danh sách chitiet hoadon
    //////////////////////////////////
    private void CreateColumsTable2(){
        table2  = (DefaultTableModel) TableChiTiet.getModel();
        table2.addColumn("Mã Phiếu Nhập");
        table2.addColumn("Mã Sách");
        table2.addColumn("Số Lượng");
        table2.addColumn("Đơn Giá");
    }
    //Đổ Data cho bảng 
    private void Populate2() {   
        ChiTietPNDB db  =new ChiTietPNDB();
            setDataToTable2(db.getALLPhieuNhap(lbMaPhieuNhap.getText()), table2);
    }
    //Đổ data từ arraylist vào row data
    private void setDataToTable2(ArrayList<ChiTietPN> data,DefaultTableModel table){
        table.setRowCount(0);
        for(ChiTietPN s :data){
            table.addRow(new String[]{
             s.getMapn(),s.getMasach(),s.getSoluong(),s.getDongia()+"VNĐ"
            });
        }
    }
    //Sắp xếp theo cột
    private  void sort2(){
        TableRowSorter<DefaultTableModel> sorter    = new TableRowSorter<DefaultTableModel>(table2);
        TableChiTiet.setRowSorter(sorter);
    }
    ///////////////////////////////////
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbAnh = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        tfSoluong = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jlbDongia = new javax.swing.JLabel();
        lbTongtien = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jlbDongia8 = new javax.swing.JLabel();
        lbMasach = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jlbDongia9 = new javax.swing.JLabel();
        lbDongia = new javax.swing.JLabel();
        TableSanPham = new javax.swing.JScrollPane();
        TableHTSach = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jlbDongia10 = new javax.swing.JLabel();
        lbGio = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jlbDongia11 = new javax.swing.JLabel();
        lbMaPhieuNhap = new javax.swing.JLabel();
        jpannel1 = new javax.swing.JPanel();
        jlbDongia12 = new javax.swing.JLabel();
        lbMaNhanVien = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jlbDongia13 = new javax.swing.JLabel();
        lbNgay = new javax.swing.JLabel();
        jlabel9 = new javax.swing.JPanel();
        jlbDongia14 = new javax.swing.JLabel();
        lbTenNhanVien = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableChiTiet = new javax.swing.JTable();
        jbtThemsach1 = new javax.swing.JButton();
        JbtnXoa = new javax.swing.JButton();
        jbtThanhtoan = new javax.swing.JButton();
        lbTongphieunhap = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1075, 690));

        jlbAnh.setBackground(new java.awt.Color(204, 153, 0));
        jlbAnh.setForeground(new java.awt.Color(153, 0, 102));
        jlbAnh.setBorder(new javax.swing.border.MatteBorder(null));
        jlbAnh.setPreferredSize(new java.awt.Dimension(277, 277));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số Lượng Cần Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        tfSoluong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoluongActionPerformed(evt);
            }
        });
        tfSoluong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSoluongKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfSoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn Giá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbTongtien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbMasach.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMasach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMasach, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn Giá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel21.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbDongia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDongia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDongia, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        TableSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        TableHTSach.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableHTSach.setForeground(new java.awt.Color(0, 0, 0));
        TableHTSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableHTSach.setGridColor(new java.awt.Color(255, 255, 255));
        TableHTSach.setRowHeight(35);
        TableHTSach.setSelectionBackground(new java.awt.Color(102, 102, 102));
        TableHTSach.setSelectionForeground(new java.awt.Color(204, 204, 204));
        TableHTSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHTSachMouseClicked(evt);
            }
        });
        TableSanPham.setViewportView(TableHTSach);

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giờ Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel22.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbGio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGio, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbGio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia10)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Phiếu Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel23.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbMaPhieuNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMaPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMaPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia11)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jpannel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jpannel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbMaNhanVien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpannel1Layout = new javax.swing.GroupLayout(jpannel1);
        jpannel1.setLayout(jpannel1Layout);
        jpannel1Layout.setHorizontalGroup(
            jpannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpannel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        jpannel1Layout.setVerticalGroup(
            jpannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jpannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpannel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia12)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel25.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbNgay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia13)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jlabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jlabel9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jlbDongia14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lbTenNhanVien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jlabel9Layout = new javax.swing.GroupLayout(jlabel9);
        jlabel9.setLayout(jlabel9Layout);
        jlabel9Layout.setHorizontalGroup(
            jlabel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlabel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jlabel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jlabel9Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jlbDongia14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
        jlabel9Layout.setVerticalGroup(
            jlabel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addGroup(jlabel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jlabel9Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jlbDongia14)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        TableChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableChiTiet.setForeground(new java.awt.Color(0, 0, 0));
        TableChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableChiTiet.setGridColor(new java.awt.Color(255, 255, 255));
        TableChiTiet.setRowHeight(35);
        TableChiTiet.setSelectionBackground(new java.awt.Color(102, 102, 102));
        TableChiTiet.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TableChiTiet);

        jbtThemsach1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtThemsach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/add_30px.png"))); // NOI18N
        jbtThemsach1.setText("Thêm Vào Danh Sách Nhập");
        jbtThemsach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemsach1ActionPerformed(evt);
            }
        });

        JbtnXoa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JbtnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/delete_forever_30px.png"))); // NOI18N
        JbtnXoa.setText("Xóa");
        JbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnXoaActionPerformed(evt);
            }
        });

        jbtThanhtoan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtThanhtoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/ok_30px.png"))); // NOI18N
        jbtThanhtoan.setText("Thanh Toán");
        jbtThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThanhtoanActionPerformed(evt);
            }
        });

        lbTongphieunhap.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TableSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jlabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtThemsach1)
                                .addGap(60, 60, 60)
                                .addComponent(JbtnXoa)
                                .addGap(60, 60, 60)
                                .addComponent(jbtThanhtoan)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbTongphieunhap)
                                        .addGap(114, 114, 114))))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JbtnXoa, jbtThanhtoan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TableSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtThemsach1)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbTongphieunhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtThanhtoan)
                            .addComponent(JbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoluongActionPerformed

    private void tfSoluongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSoluongKeyReleased
        // TODO add your handling code here:
        String query = tfSoluong.getText().toLowerCase();
        if(!query.equals(""))
        {try{
            float sl = Float.parseFloat(query);
            lbTongtien.setText(Float.parseFloat(lbDongia.getText())*sl+"");
        }catch (Exception e){
            tfSoluong.setText("1");
            lbTongtien.setText(lbDongia.getText());
        }
        }
    }//GEN-LAST:event_tfSoluongKeyReleased

    private void TableHTSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHTSachMouseClicked
        // TODO add your handling code here:
        row1  = TableHTSach.getSelectedRow();
        displaytoTextField1(row1);  //trả data về textfield
        showImage(row1);
    }//GEN-LAST:event_TableHTSachMouseClicked

    
    
       //****************Table Sach********************//                                   
    //lấy tên file ảnh từ database xuất lên màn hình 
    private void showImage(int row){
       try {
           SachDB db =new SachDB();
           String s = TableHTSach.getModel().getValueAt(row,0)+""; //lấy mã sách
           s =  db.showImage(s); //lấy tên của file ảnh
            jlbAnh.setSize(277,277);
        // show hình ảnh
        int w   = jlbAnh.getWidth();
        int h = jlbAnh.getHeight();      
        ImageIcon img = new ImageIcon(getClass().getResource("/qlch/Image/Sach/"+s));
        Image imgScaled = img.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT);
        jlbAnh.setIcon(new ImageIcon(imgScaled));
        } catch (Exception e) {
        }
    }
    private void jbtThemsach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemsach1ActionPerformed
        // TODO add your handling code here: 
       if(tfSoluong.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Bạn không được bỏ trống số lượng");
       }else{
        String mapn = lbMaPhieuNhap.getText();
        String masach = lbMasach.getText();
        String soluong =tfSoluong.getText();
        String soluong2 = " + "+soluong;
        String dongia = lbDongia.getText();
        PhieuNhapDB db = new PhieuNhapDB();
        ChiTietPNDB db1 = new ChiTietPNDB();
        if(db1.themSanPham(mapn,masach,soluong,dongia) && db.capNhatSoLuong(masach,soluong2)){
            Populate2();
            sort2();
            try {
                lbTongphieunhap.setText(db1.tongTien(lbMaPhieuNhap.getText()+"")+"");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Thêm Không Thành Công \n"
                    + "Sản Phẩm Đã Tồn Tại Trong Hóa Đơn");
        }
        }
    }//GEN-LAST:event_jbtThemsach1ActionPerformed

    private void JbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnXoaActionPerformed
        // TODO add your handling code here:
        if(row2!=-1){
            ChiTietPNDB db = new ChiTietPNDB();
            PhieuNhapDB db1 = new PhieuNhapDB();
            String s = TableChiTiet.getModel().getValueAt(row2,0)+"";
            String s1 = TableChiTiet.getModel().getValueAt(row2,1)+"";
            String s2 = " - "+TableChiTiet.getModel().getValueAt(row2,2)+"";
            if(db.xoaChitietphieunhap(s,s1)&& db1.capNhatSoLuong(s1, s2)){
                Populate2();
                sort2();
            }else{
                JOptionPane.showMessageDialog(null,"Xóa Không Thành Công");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Bạn cần chọn sản phẩm muốn xóa");
        }
    }//GEN-LAST:event_JbtnXoaActionPerformed

    private void jbtThanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThanhtoanActionPerformed
        // TODO add your handling code here:
            String manv= lbMaNhanVien.getText();
            int tongtien = (int)Float.parseFloat(lbTongtien.getText());
            String tongtien1 = tongtien+"";
            String mapn = lbMaPhieuNhap.getText();
            PhieuNhapDB db = new PhieuNhapDB();
            if(db.themPhieuNhap(mapn,manv,tongtien1)){
                Populate1();
                sort1();
                Populate2();
                sort2();
            }else{
                JOptionPane.showMessageDialog(null,"Nhập Dữ Liệu Không Thành Công");
            }
        
    }//GEN-LAST:event_jbtThanhtoanActionPerformed
    
    //****************Table Sach********************//
    //Hiển thị thông tin vào các ô trống của 
    private void displaytoTextField1(int row){
        lbMasach.setText(TableHTSach.getModel().getValueAt(row,0)+"");
        float dongia = Float.parseFloat(TableHTSach.getModel().getValueAt(row,1)+"");
        lbDongia.setText(dongia+"");
        float soluong  = 1;
        tfSoluong.setText("1");
        float tongtien = dongia*soluong;
        lbTongtien.setText(tongtien+"");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnXoa;
    private javax.swing.JTable TableChiTiet;
    private javax.swing.JTable TableHTSach;
    private javax.swing.JScrollPane TableSanPham;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtThanhtoan;
    private javax.swing.JButton jbtThemsach1;
    private javax.swing.JPanel jlabel9;
    private javax.swing.JLabel jlbAnh;
    private javax.swing.JLabel jlbDongia;
    private javax.swing.JLabel jlbDongia10;
    private javax.swing.JLabel jlbDongia11;
    private javax.swing.JLabel jlbDongia12;
    private javax.swing.JLabel jlbDongia13;
    private javax.swing.JLabel jlbDongia14;
    private javax.swing.JLabel jlbDongia8;
    private javax.swing.JLabel jlbDongia9;
    private javax.swing.JPanel jpannel1;
    private javax.swing.JLabel lbDongia;
    private javax.swing.JLabel lbGio;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbMaPhieuNhap;
    private javax.swing.JLabel lbMasach;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbTenNhanVien;
    private javax.swing.JLabel lbTongphieunhap;
    private javax.swing.JLabel lbTongtien;
    private javax.swing.JTextField tfSoluong;
    // End of variables declaration//GEN-END:variables
}
