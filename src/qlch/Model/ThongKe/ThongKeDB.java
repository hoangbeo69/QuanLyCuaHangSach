/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.ThongKe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import qlch.Dao.DBConnect;
import qlch.Model.HoaDon.HoaDon;

/**
 *
 * @author HiHi
 */
public class ThongKeDB {
    PreparedStatement statement = null;
    ResultSet result = null;
    Connection conn;

    public ThongKeDB() {
        conn = DBConnect.getConnection();
    }
    
    public ArrayList<HoaDonThongKe> thongKeHoaDon() throws SQLException {
        ArrayList<HoaDonThongKe> DShoadonthongke= new ArrayList<>();
        LocalDate ngayLap = java.time.LocalDate.now();
        int thang = ngayLap.getMonthValue();
        try {
            String query = "select count(MaHD) as sohoadon ,Month(NgayLap) as thanglap from hoadon where "
                    + "Month(NgayLap) < '"+thang+"' and Month(NgayLap) >= '"+(thang -6 )
                    +"' group by Month(NgayLap)";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    int sohoadon = Integer.parseInt(result.getString("sohoadon"));
                    String thang1 = result.getString("thanglap");
                    DShoadonthongke.add(new HoaDonThongKe(sohoadon, thang1));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DShoadonthongke;
    }
    
    public ArrayList<DoanhThuThongKe> thongKeDoanhThu() throws SQLException {
        ArrayList<DoanhThuThongKe> DSdoanhthu= new ArrayList<>();
        LocalDate ngayLap = java.time.LocalDate.now();
        int thang = ngayLap.getMonthValue();
        System.out.println(thang);
        try {
            String query = "select  SUM(TongTien) as tongtien ,Month(NgayLap) as thanglap from hoadon where "
                    + "Month(NgayLap) < '"+thang+"' and Month(NgayLap) >= '"+(thang -6 )
                    +"' group by Month(NgayLap)";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            if (result != null) {
                while (result.next()) {
                    float tongtien = Float.parseFloat(result.getString("tongtien"));
                   String  thang1 = result.getString("thanglap");
                    DSdoanhthu.add(new DoanhThuThongKe(tongtien,thang1));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            conn.close();
            statement.close();
        }
        return DSdoanhthu;
    }
    
    
}
