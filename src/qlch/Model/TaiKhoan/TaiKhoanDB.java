/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.TaiKhoan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import qlch.Dao.DBConnect;

/**
 *
 * @author HiHi
 */
public class TaiKhoanDB {

    PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;

    public TaiKhoanDB() {
        conn = DBConnect.getConnection();
    }

    public ArrayList<TaiKhoan> getAllTaiKhoan() throws SQLException {
        ArrayList<TaiKhoan> dsTaiKhoan = new ArrayList<>();
        try {
            String query = "select nhanvien.MaNV,TenNV,GioiTinh,NgaySinh,DiaChi,SDT,TenTK from nhanvien,taikhoan where nhanvien.MaNV = taikhoan.MaNV";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String manv = result.getString("MaNV");
                    String tennv = result.getString("TenNV");
                    String gioitinh = result.getString("GioiTinh");
                    String ngaysinh = result.getString("NgaySinh");
                    String diachi = result.getString("DiaChi");
                    String sdt = result.getString("SDT");
                    String tentk = result.getString("TenTK");
                    dsTaiKhoan.add(new TaiKhoan(manv, tennv, gioitinh, ngaysinh, diachi, sdt, tentk));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            conn.close();
            statement.close();
        }
        return dsTaiKhoan;
    }

    public boolean xoaTaiKhoan(String s) throws SQLException {
        conn = DBConnect.getConnection();
        try {
            String query = "delete  from  taikhoan where  MaNV  = '" + s + "'";
            String query2 = "delete  from nhanvien where  MaNV  = '" + s + "'";
            statement = conn.prepareStatement(query);
            statement.execute();
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            conn.close();
            statement.close();
        }
        return true;
    }

    public int maNV() throws SQLException {
        conn = DBConnect.getConnection();
        int manv = -1;
        try {
            String query = "select count(MaNV) as moi from taikhoan ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    manv = Integer.parseInt(result.getString("moi"));
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        return manv;
    }

    public boolean checktk(String tk) throws SQLException {
        conn = DBConnect.getConnection();
        String manv = null;
        try {
            String query = "select MaNV as moi from taikhoan where TenTK like '" + tk + "'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    manv = result.getString("moi");
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        if (manv == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean themTaiKhoan(String diachi, String manv, String tennv, String gt, String ngaysinh, String sdt, String taikhoan, String matkhau) {
        conn = DBConnect.getConnection();
        try {
            String query = "insert into taikhoan values ( '" + taikhoan + "','"
                    + matkhau + "','"
                    + manv + "')";

            String query2 = "insert into nhanvien values ( '" + manv + "','"
                    + tennv + "','"
                    + gt + "','"
                    + ngaysinh + "','"
                    + diachi + "','"
                    + sdt + "')";
            statement = conn.prepareStatement(query);
            statement.execute();
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return true;
    }

    public boolean suaTaiKhoan(String diachi, String manv, String tennv, String gt, String ngaysinh, String sdt) {
        try {
            String query2 = "update nhanvien set "
                    + "TenNV = '" + tennv + "',"
                    + "GioiTinh = '" + gt + "',"
                    + "NgaySinh = '" + ngaysinh + "',"
                    + "DiaChi = '" + diachi + "',"
                    + "SDT = '" + sdt + "'"
                    + " where MaNV = '" + manv + "'";
            statement = conn.prepareStatement(query2);
            statement.execute();
        } catch (SQLException ex) {
            System.out.println(ex);

            return false;
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return true;
    }

    public ArrayList<TaiKhoan> search(String tencot, String query) {
        ArrayList<TaiKhoan> dsTaiKhoan = new ArrayList<>();
        try {
            String query1 = "select nhanvien.MaNV,TenNV,GioiTinh,NgaySinh,DiaChi,SDT,TenTK from nhanvien,taikhoan where nhanvien.MaNV = taikhoan.MaNV and " + tencot + " like '%" + query + "%'";
            statement = conn.prepareStatement(query1);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String manv = result.getString("MaNV");
                    String tennv = result.getString("TenNV");
                    String gioitinh = result.getString("GioiTinh");
                    String ngaysinh = result.getString("NgaySinh");
                    String diachi = result.getString("DiaChi");
                    String sdt = result.getString("SDT");
                    String tentk = result.getString("TenTK");
                    dsTaiKhoan.add(new TaiKhoan(manv, tennv, gioitinh, ngaysinh, diachi, sdt, tentk));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return dsTaiKhoan;
    }

    boolean checkMatKhauCu(String matkhauc, String manv) throws SQLException {
       conn = DBConnect.getConnection();
       String kq = null;
        try {
            String query = "select MaNV as moi from taikhoan where MaNV = '" + manv + "' and MatKhau = '"+matkhauc+"'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    kq = result.getString("moi");
                    System.out.println(kq);
                }
            }
        } catch (SQLException ex) {

        } finally {
            conn.close();
            statement.close();
        }
        if (kq == null) {
            return false;
        } else {
            return true;
        }
    }

    boolean doiMatKhau(String matkhaum, String manv) throws SQLException {
               conn = DBConnect.getConnection();
        try {
            String query = "update taikhoan set MatKhau = '"+matkhaum+"' where MaNV = '"+manv+"'";
            statement = conn.prepareStatement(query);
            statement.execute();
        } catch (SQLException ex) {
            return false;
        } finally {
            conn.close();
            statement.close();
        }
        return  true;
    }

}
