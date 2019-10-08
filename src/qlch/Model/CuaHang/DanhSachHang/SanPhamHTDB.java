/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.CuaHang.DanhSachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;
import qlch.Model.HoaDon.ChiTietHoaDon;

/**
 *
 * @author HiHi
 */
public class SanPhamHTDB {
     PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;
    public SanPhamHTDB(){
        conn = DBConnect.getConnection();
    }
    public ArrayList<SanPhamHT> getAllHTSach() throws SQLException {
        ArrayList<SanPhamHT> DSsanpham = new ArrayList<>();
        try {
            String query = "select * from sanpham ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String masach = result.getString("MaSach");
                    String dongia = result.getString("DonGia");
                    String soluong = result.getString("SoLuong");
                    DSsanpham.add(new SanPhamHT(masach, dongia, soluong));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DSsanpham;
    }

    public boolean themSanPham(String mahd, String masach, String soluong, String dongia) {
         conn = DBConnect.getConnection();
         try {
            String query = "insert into chitiethoadon values ('"+mahd+"','"+masach+"','"+soluong+"','"+dongia+"'"+")";
            statement = conn.prepareStatement(query);
            statement.execute();
        } catch (SQLException ex) {
            return  false;
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
    
    public int MaHD() throws SQLException {
        conn = DBConnect.getConnection();
        int mahd = -1;
        try {
            String query = "select count(MaHD) as moi from hoadon ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    mahd = Integer.parseInt(result.getString("moi"));
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        return mahd;
    }
        public int MaKH() throws SQLException {
        conn = DBConnect.getConnection();
        int makh = -1;
        try {
            String query = "select count(MaKH) as moi from khachhang ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    makh = Integer.parseInt(result.getString("moi"));
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        return makh;
    }
    public Float tongTien(String hd) throws SQLException {
        conn = DBConnect.getConnection();
        float tongtien = 0;
        try {
            String query = "select Sum(DonGia) as moi from chitiethoadon where  MaHD  = '"+hd+"'";
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

    public boolean xoaChitiethoadon(String mahd, String masach) {
       conn = DBConnect.getConnection();
        try {
            String query = "delete  from chitiethoadon where  MaSach  = '"+masach+"'"+"and  MaHD = '" +mahd+ "'";
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

    public boolean capNhatSoLuong(String masach, String soluong) {
              conn = DBConnect.getConnection();
           
        try {
            String query = "update sanpham set SoLuong = SoLuong "+soluong+" where MaSach = '"+masach+"'";
            statement = conn.prepareStatement(query);
            statement.execute();
        } catch (SQLException ex) {
             System.out.println(ex);
            return false;
        } finally {
           try {
               conn.close();
                 statement.close();
           } catch (SQLException ex) {
           }
        }
        return true;
    }
}
