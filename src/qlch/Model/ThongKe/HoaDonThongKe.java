/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.ThongKe;

/**
 *
 * @author HiHi
 */
public class HoaDonThongKe {
    private int sohoadon;
    private String thang;

    public HoaDonThongKe(int sohoadon, String thang) {
        this.sohoadon = sohoadon;
        this.thang = thang;
    }
    public HoaDonThongKe(){
        
    }
    public int getSohoadon() {
        return sohoadon;
    }

    public void setSohoadon(int sohoadon) {
        this.sohoadon = sohoadon;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }
}
