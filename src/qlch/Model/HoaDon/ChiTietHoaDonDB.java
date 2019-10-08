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
import qlch.Dao.DBConnect;

/**
 *
 * @author HiHi
 */
public class ChiTietHoaDonDB {
     PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;
    public ChiTietHoaDonDB(){
        conn = DBConnect.getConnection();
    }
    public ArrayList<ChiTietHoaDon> getAllHoaDon(String mahdd) throws SQLException {
        ArrayList<ChiTietHoaDon> DSChiTiet = new ArrayList<>();
        try {
            String query = "select * from chitiethoadon where MaHD = '"+mahdd+"'";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    String mahd = result.getString("MaHD");
                    String masach = result.getString("MaSach");
                    String soluong = result.getString("SoLuong");
                    String dongia = result.getString("DonGia");
                    DSChiTiet.add(new ChiTietHoaDon(mahd, masach, soluong, dongia));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DSChiTiet;
    }
}
