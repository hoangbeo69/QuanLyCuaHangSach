/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.Sach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;

/**
 *
 * @author HiHi
 */
public class SachDB {

    PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;

    public SachDB() {
        conn = DBConnect.getConnection();
    }
    //Lấy Dữ Liệu Từ Database

    public ArrayList<Sach> getAllSach() throws SQLException {
        ArrayList<Sach> DSsach = new ArrayList<>();
        try {
            String query = "select * from sach";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String masach = result.getString("MaSach");
                    String tensach = result.getString("TenSach");
                    String tacgia = result.getString("TacGia");
                    String nhaxb = result.getString("NhaXB");
                    String kichthuoc = result.getString("KichThuoc");
                    String sotrang = result.getString("SoTrang");
                    DSsach.add(new Sach(masach, tensach, tacgia, nhaxb, kichthuoc, sotrang));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            conn.close();
            statement.close();
        }
        return DSsach;
    }

    public String showImage(String s) throws SQLException {
        String x = null;
        conn = DBConnect.getConnection();
        try {

            String query = "select HinhAnh from quanlycuahangsach.sanpham where MaSach like '%" + s + "%'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    x = result.getString("HinhAnh");
                }
            }
        } catch (SQLException e) {
            System.out.println("Hé");
        } finally {
            conn.close();
            statement.close();
        }
        return x;
    }

    public ArrayList<Sach> search(String tencot, String qry) throws SQLException {
        conn = DBConnect.getConnection();
        ArrayList<Sach> DSsach = new ArrayList<>();
        try {
            String query = "select * from sach where  " + tencot + " like '%" + qry + "%'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String masach = result.getString("MaSach");
                    String tensach = result.getString("TenSach");
                    String tacgia = result.getString("TacGia");
                    String nhaxb = result.getString("NhaXB");
                    String kichthuoc = result.getString("KichThuoc");
                    String sotrang = result.getString("SoTrang");
                    DSsach.add(new Sach(masach, tensach, tacgia, nhaxb, kichthuoc, sotrang));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            conn.close();
            statement.close();
        }
        return DSsach;
    }

    public void xoa(String s) throws SQLException {
        conn = DBConnect.getConnection();
        try {
            String query = "delete  from sach where  MaSach  = '" + s + "'";
            String query2 = "delete  from sanpham where  MaSach  = '" + s + "'";
            statement = conn.prepareStatement(query);
            statement.execute();
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            conn.close();
            statement.close();
        }
    }

    public void themSach(String url, String kichthuoc, String masach, String sotrang, String nhaxb, String tacgia, String tensach) throws SQLException {
        conn = DBConnect.getConnection();
        try {
            String query = "insert into sach values ( '" + masach + "','"
                    + tensach + "','"
                    + tacgia + "','"
                    + nhaxb + "','"
                    + kichthuoc + "','"
                    + sotrang + "')";

            String query2 = "insert into sanpham values ( '" + masach + "','"
                    + 0 + "','"
                    + 0 + "','"
                    + url + "')";
            statement = conn.prepareStatement(query);
            statement.execute();
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            conn.close();
            statement.close();
        }
    }

    public void suaSach(String url, String kichthuoc, String masach, String nhaxb, String sotrang, String tacgia, String tensach) throws SQLException {

        conn = DBConnect.getConnection();
        try {
            String query = "update  sach set "
                    + " TenSach = '" + tensach + "',"
                    + " TacGia = '" + tacgia + "',"
                    + " NhaXB = '" + nhaxb + "',"
                    + " KichThuoc = '" + kichthuoc + "',"
                    + " SoTrang = '" + sotrang + "'"
                    + " where MaSach = '" + masach + "'";

            String query2 = "update  sanpham set "
                    + " HinhAnh = '" + url + "'"
                    + " where MaSach = '" + masach + "'";
            statement = conn.prepareStatement(query);
            statement.execute();
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            conn.close();
            statement.close();
        }
        JOptionPane.showMessageDialog(null, "Sửa Thành Công");
    }

    public int maSP()  {
        conn = DBConnect.getConnection();
        int masach = -1;
        try {
            String query = "select count(MaSach) as moi from Sach ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    masach = Integer.parseInt(result.getString("moi"));
                }
            }
        } catch (SQLException ex) {

        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException ex) {
             
            }
        }
        return masach;
    }
}
