/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.PhieuNhap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;
import qlch.Model.CuaHang.DanhSachHang.SanPhamHTDB;

/**
 *
 * @author HiHi
 */
public class ChiTietPNDB {
     PreparedStatement statement = null;
    ResultSet result = null;
     Connection conn;

    public ChiTietPNDB() {
        conn = DBConnect.getConnection();
    }
    public ArrayList<ChiTietPN> getALLPhieuNhap(String MaPN){
       ArrayList<ChiTietPN> DSChiTiet = new ArrayList<>();
       String query  = "Select * from chitietphieunhap where MaPN = '"+MaPN+"'";
             try {
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if(result!=null){
                while(result.next()){
                    String mapn = result.getString("MaPN");
                    String masach = result.getString("MaSach");
                    String soluong = result.getString("SoLuong");
                    String dongia = result.getString("DonGia");
                    DSChiTiet.add(new ChiTietPN(mapn, masach, soluong, dongia));
                }
            }
        } catch (SQLException ex) {
                 System.out.println(ex);
        } finally{
            try {
                conn.close();
                 statement.close();
            } catch (SQLException ex) {
                    System.out.println(ex);
            }
        }       
        return DSChiTiet;
   }
    
    public Float tongTien(String hd) throws SQLException {
        conn = DBConnect.getConnection();
        float tongtien = 0;
        try {
            String query = "select Sum(DonGia) as moi from chitietphieunhap where  MaPN  = '"+hd+"'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                  String tongtien1 =  result.getString("moi"); 
                  if(tongtien1==null){   
                      return tongtien = 0;
                  }else{
                    tongtien = Float.parseFloat(tongtien1);
                  }
               }
            }
        } catch (SQLException ex) {
        } finally {
            conn.close();
            statement.close();
        }
        return tongtien;
    }
    
    public boolean themSanPham(String mapn, String masach, String soluong, String dongia) {
         conn = DBConnect.getConnection();
         try {
            String query = "insert into chitietphieunhap values ('"+mapn+"','"+masach+"','"+soluong+"','"+dongia+"'"+")";
            statement = conn.prepareStatement(query);
            statement.execute();
        } catch (SQLException ex) {
             System.out.println(ex);
            return  false;
        } finally {
             try {
                 conn.close();
                  statement.close();
             } catch (SQLException ex) {
             }
        }
         return true;
    }    
        public boolean xoaChitietphieunhap(String mapn, String masach) {
       conn = DBConnect.getConnection();
        try {
            String query = "delete  from chitietphieunhap where  MaSach  = '"+masach+"'"+"and  MaPN = '" +mapn+ "'";
            statement = conn.prepareStatement(query);
            statement.execute();
        } catch (SQLException ex) {
            return false;
        } finally {
           try {
               conn.close();
                 statement.close();
           } catch (SQLException ex) {
               Logger.getLogger(SanPhamHTDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return true;
    }
}
