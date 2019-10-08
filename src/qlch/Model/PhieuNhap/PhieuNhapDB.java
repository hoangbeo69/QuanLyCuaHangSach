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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;
import qlch.Model.CuaHang.DanhSachHang.SanPhamHTDB;
import qlch.Model.Sach.Sach;
import qlch.Model.SanPham.SanPham;
import qlch.Model.SanPham.SanPhamDB;

/**
 *
 * @author HiHi
 */
public class PhieuNhapDB {
     PreparedStatement statement = null;
    ResultSet result = null;
     Connection conn;

   public  PhieuNhapDB(){
       conn = DBConnect.getConnection();
   }
   public ArrayList<PhieuNhap> getALLPhieuNhap(){
       ArrayList<PhieuNhap> DSPhieuNhap = new ArrayList<>();
       String query  = "Select * from phieunhap";
             try {
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if(result!=null){
                while(result.next()){
                    String mapn = result.getString("MaPN");
                    String manv = result.getString("MaNV");
                    String ngaynhap = result.getString("NgayNhap");
                    String gionhap = result.getString("GioNhap");
                    String tongtien = result.getString("TongTien");
                    DSPhieuNhap.add(new PhieuNhap(mapn, manv, ngaynhap, gionhap, tongtien));
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
        return DSPhieuNhap;
   }
       public String getTenNV(String manv) throws SQLException {
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
        public ArrayList<PhieuNhap> searchTable(String tencot, String qry,String tungay,String denngay) throws SQLException {
                conn = DBConnect.getConnection();
        ArrayList<PhieuNhap> DSPhieuNhap = new ArrayList<>();
        try {
            String query = "Select * from phieunhap";
            if( tungay.equals("") && denngay.equals("") && qry.equals("")){
              query = "Select * from phieunhap";
            }else if( tungay.equals("") && qry.equals("")){
               query = "select * from phieunhap where  NgayNhap >= '"+denngay+"'";
            }else if( denngay.equals("")&&  qry.equals("")){
               query = "select * from phieunhap where  NgayNhap >= '"+tungay+"'"; 
            }else if( tungay.equals("") && denngay.equals("")){
               query = "select * from phieunhap where  " + tencot + " like '%" + qry + "%'";
            }else if (!tungay.equals("")&& !denngay.equals("")&& qry.equals("") ){
               query = "select * from phieunhap where  NgayNhap >= '"+tungay+"'"+
                                            "  and NgayNhap <= '"+denngay+"'"; 
            }else if (tungay.equals("")){
               query = "select * from phieunhap where  " + tencot + " like '%" + qry + "%'"+
                                            "and NgayNhap >= '"+denngay+"'"; 
            }else if (denngay.equals("")){
                query = "select * from phieunhap where  " + tencot + " like '%" + qry + "%'"+
                                            "and NgayNhap <= '"+tungay+"'"; 
            }else{
                query = "select * from phieunhap where  " + tencot + " like '%" + qry + "%'"+
                                            "and NgayNhap >= '"+tungay+"'"+
                                            "and NgayNhap >= '"+tungay+"'"; 
            }
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String mapn = result.getString("MaPN");
                    String manv = result.getString("MaNV");
                    String ngaynhap = result.getString("NgayNhap");
                    String gionhap = result.getString("GioNhap");
                    String tongtien = result.getString("TongTien");
                    DSPhieuNhap.add(new PhieuNhap(mapn, manv, ngaynhap, gionhap, tongtien));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DSPhieuNhap;
    }
    public int MaPN() throws SQLException {
        conn = DBConnect.getConnection();
        int mapn = -1;
        try {
            String query = "select count(MaPN) as moi from phieunhap ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    mapn = Integer.parseInt(result.getString("moi"));
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        return mapn;
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
        public boolean themPhieuNhap( String mapn, String manv, String tongtien) {
                 conn = DBConnect.getConnection();
         try {
             LocalDateTime ngaygio = java.time.LocalDateTime.now();
            String ngay = ngaygio.getYear()+"/"+ngaygio.getMonthValue()+"/"+ngaygio.getDayOfMonth();
            String gio = ngaygio.getHour()+":"+ngaygio.getMinute()+":"+ngaygio.getSecond();
            String query1 = "insert into phieunhap values ('"+mapn+"','"+manv+"','"+ngay+"','"+gio+"','"+tongtien+"')";
            statement = conn.prepareStatement(query1);
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
