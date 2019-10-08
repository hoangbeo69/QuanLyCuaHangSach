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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;

/**
 *
 * @author HiHi
 */
public class HoaDonHTDB {
         PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;

    public HoaDonHTDB() {
        conn  =DBConnect.getConnection();
    }
    public ArrayList<HoaDonHT> getAllHoaDonHT(String hd) throws SQLException {
        conn = conn = DBConnect.getConnection();
        ArrayList<HoaDonHT> DShoadonht = new ArrayList<>();
        try {
            String query = "select * from chitiethoadon where MaHD  = '"+hd+"'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String mahd = result.getString("MaHD");
                    String masach = result.getString("MaSach");
                    String soluong = result.getString("SoLuong");
                    String dongia = result.getString("DonGia");
                    DShoadonht.add(new HoaDonHT(mahd, masach, soluong, dongia));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DShoadonht;
    }

    public boolean xoaHoaDon(String mahd) {
        conn = DBConnect.getConnection();
        try {
            String query = "delete  from chitiethoadon where MaHD = '" +mahd+ "'";
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
        public boolean themSanPham(String mahd, String masach, String soluong, String dongia) {
         conn = DBConnect.getConnection();
         try {
            String query = "insert into chitiethoadon values ('"+mahd+"','"+masach+"','"+soluong+"','"+dongia+"'"+")";
            statement = conn.prepareStatement(query);
            statement.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
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

    public boolean themHoaDon(String makh, String tenkh, String diachi, String sdt, String gt, String mahd, String manv, String tongtien) {
                 conn = DBConnect.getConnection();
         try {
             LocalDateTime ngaygio = java.time.LocalDateTime.now();
            String ngay = ngaygio.getYear()+"/"+ngaygio.getMonthValue()+"/"+ngaygio.getDayOfMonth();
            String gio = ngaygio.getHour()+":"+ngaygio.getMinute()+":"+ngaygio.getSecond();
            String query1 = "insert into hoadon values ('"+mahd+"','"+manv+"','"+makh+"','"+ngay+"','"+gio+"','"+tongtien+"')";
            String query2 = "insert into khachhang values ('"+makh+"','"+tenkh+"','"+diachi+"','"+sdt+"','"+gt+"')";
            statement = conn.prepareStatement(query1);
            statement.execute();
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
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
    
}
