/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HiHi
 */
public class DBConnect {
    public static  Connection getConnection(){
        Connection cons = null;
        String namedatabase ="quanlycuahangsach";
        String taikhoan  = "root";
        String matkhau = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+namedatabase+"?useUnicode=true&characterEncoding=UTF-8", ""+taikhoan+"",""+matkhau+"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cons;
    }
      public static void main(String[] args) {
        System.out.println(getConnection());
    }
      
    
}
