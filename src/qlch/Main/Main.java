/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlch.Dao.DBConnect;
import qlch.Model.TaiKhoan.TaiKhoanDB;
import qlch.View.MainControl;

/**
 *
 * @author HiHi
 */
public class Main {
   
        public static void main(String[] args) {
            Connection conn =DBConnect.getConnection();
            System.out.println(conn);
            String s = "34343";
            String s1 = "fdfdsfdsf";
            MainControl main = new MainControl(s, s1);
            main.setVisible(true);
        }
    
}
