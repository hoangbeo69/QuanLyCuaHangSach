/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.PhieuNhap;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import qlch.Model.Sach.Sach;
import qlch.Model.Sach.SachDB;

/**
 *
 * @author HiHi
 */
public class ChiTietPhieuNhap extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietPhieuNhap
     */
        DefaultTableModel table;
    public ChiTietPhieuNhap(String pn) throws SQLException {
        initComponents();
         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Chi Tiết Phiếu Nhập");
                 CreateColumsTable();
         Populate(pn);
         sort();  
    }
    
     // Tạo tên cho cột
    private void CreateColumsTable(){
        table  = (DefaultTableModel) TableChiTietPN.getModel();
        table.addColumn("Mã Phiếu Nhập");
        table.addColumn("Mã Sách");
        table.addColumn("Số Lượng");
        table.addColumn("Đơn Giá");
    }
    //Đổ Data cho bảng 
    private void Populate(String pn) throws SQLException{   
        ChiTietPNDB db = new ChiTietPNDB();
          setDataToTable(db.getALLPhieuNhap(pn),table);
    }
    //Đổ data từ arraylist vào row data
    private void setDataToTable(ArrayList<ChiTietPN> data,DefaultTableModel table){
        table.setRowCount(0);
        for(ChiTietPN s :data){
            table.addRow(new String[]{
             s.getMapn(),s.getMasach(),s.getSoluong(),s.getDongia()                  
            });
        }
    }
    //Sắp xếp theo cột
    private  void sort(){
        TableRowSorter<DefaultTableModel> sorter    = new TableRowSorter<DefaultTableModel>(table);
        TableChiTietPN.setRowSorter(sorter);
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
        TableChiTietPN = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableChiTietPN.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TableChiTietPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableChiTietPN.setRowHeight(30);
        jScrollPane1.setViewportView(TableChiTietPN);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/news.png"))); // NOI18N
        jLabel1.setText("Chi Tiết Phiếu Nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableChiTietPN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
