/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.HoaDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;
import qlch.Model.PhieuNhap.PhieuNhap;
import qlch.Model.Sach.Sach;

/**
 *
 * @author HiHi
 */
public class HoaDonDB {
      PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;

    public HoaDonDB() {
        conn = DBConnect.getConnection();
    }
     public ArrayList<HoaDon> getAllHoaDon() throws SQLException {
        ArrayList<HoaDon> DShoadon = new ArrayList<>();
        try {
            String query = "select * from hoadon";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String mahd = result.getString("MaHD");
                    String manv = result.getString("MaNV");
                    String makh = result.getString("MaKH");
                    String ngaylap = result.getString("NgayLap");
                    String giolap = result.getString("GioLap");
                    String tongtien = result.getString("TongTien");
                    DShoadon.add(new HoaDon(mahd, manv, makh, ngaylap, giolap, tongtien));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DShoadon;
    }
         public String getTenNhanVien(String manv) throws SQLException {
        conn = DBConnect.getConnection();
        String tennv = null;
        try {
            String query = "select TenNV as moi from nhanvien where MaNV = '" +manv+ "'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    tennv = result.getString("moi");
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        return tennv;
    }
       public String getTenKhachHang(String makh) throws SQLException {
        conn = DBConnect.getConnection();
        String tenkh = null;
        try {
            String query = "select TenKH as moi from khachhang where MaKH = '" +makh+ "'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    tenkh = result.getString("moi");
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        return tenkh;
    }

    public ArrayList<HoaDon> searchTable(String tencot, String qry, String tungay, String denngay) throws SQLException {
         conn = DBConnect.getConnection();
        ArrayList<HoaDon> DSHoaDon = new ArrayList<>();
        try {
            String query = "Select * from hoadon" ;
            if( tungay.equals("") && denngay.equals("") && qry.equals("")){
              query = "Select * from hoadon";
            }else if( tungay.equals("") && qry.equals("")){
               query = "select * from hoadon where  NgayNhap >= '"+denngay+"'";
            }else if( denngay.equals("")&&  qry.equals("")){
               query = "select * from hoadon where  NgayNhap >= '"+tungay+"'"; 
            }else if( tungay.equals("") && denngay.equals("")){
               query = "select * from hoadon where  " + tencot + " like '%" + qry + "%'";
            }else if (!tungay.equals("")&& !denngay.equals("")&& qry.equals("") ){
               query = "select * from hoadon where  NgayNhap >= '"+tungay+"'"+
                                            "  and NgayNhap <= '"+denngay+"'"; 
            }else if (tungay.equals("")){
               query = "select * from hoadon where  " + tencot + " like '%" + qry + "%'"+
                                            "and NgayNhap >= '"+denngay+"'"; 
            }else if (denngay.equals("")){
                query = "select * from hoadon where  " + tencot + " like '%" + qry + "%'"+
                                            "and NgayNhap <= '"+tungay+"'"; 
            }else{
                query = "select * from hoandon where  " + tencot + " like '%" + qry + "%'"+
                                            "and NgayNhap >= '"+tungay+"'"+
                                            "and NgayNhap >= '"+tungay+"'"; 
            }
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String mahd = result.getString("MaHD");
                    String manv = result.getString("MaNV");
                    String makh = result.getString("MaKH");
                    String ngaylap = result.getString("NgayLap");
                    String giolap = result.getString("GioLap");
                    String tongtien = result.getString("TongTien");
                    DSHoaDon.add(new HoaDon(mahd, manv, makh, ngaylap, giolap, tongtien));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DSHoaDon;
    }
    
}
