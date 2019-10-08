/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlch.Dao.DBConnect;

/**
 *
 * @author HiHi
 */
public class SanPhamDB {
          PreparedStatement statement = null;
    ResultSet result = null;
     Connection conn;

    public SanPhamDB() {
        conn =  DBConnect.getConnection();
    }
    public ArrayList<SanPham> getAllSanPham(){
        ArrayList<SanPham> DSSanPham = new ArrayList<>();
        String query  = "Select * from sanpham";
        try {
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if(result!=null){
                while(result.next()){
                    String masach = result.getString("MaSach");
                    String dongia = result.getString("DonGia");
                    String soluong = result.getString("SoLuong");
                    String hinhanh = result.getString("HinhAnh");
                    DSSanPham.add(new SanPham(masach,dongia,soluong,hinhanh));
                }
            }
        } catch (SQLException ex) {
             Logger.getLogger(SanPhamDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
                 statement.close();
            } catch (SQLException ex) {
                    System.out.println(ex);
            }
        }       
        return DSSanPham;
    }
    public ArrayList<SanPham> search(String tencot,String qry){
        conn = DBConnect.getConnection();
        ArrayList<SanPham> DSSanPham = new ArrayList<>();
        String query = "select * from sach where  "+tencot+" like '%"+qry+"%'";
        try {
            statement = conn.prepareStatement(query);
            result  = statement.executeQuery();
            if(result!= null){
                while(result.next()){
                    String masach = result.getString("MaSach");
                    String dongia = result.getString("DonGia");
                    String soluong = result.getString("SoLuong");
                    String hinhanh = result.getString("HinhAnh");
                    DSSanPham.add(new SanPham(masach,dongia,soluong,hinhanh));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        finally{
            try {
                conn.close();
                 statement.close();
            } catch (SQLException ex) {
                    System.out.println(ex);
            }
        }
        return DSSanPham;
    }

     
}
