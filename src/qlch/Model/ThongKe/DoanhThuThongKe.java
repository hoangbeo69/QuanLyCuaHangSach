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
public class DoanhThuThongKe {
    private float doanhthu;
    private String thang;

    public DoanhThuThongKe(float doanhthu, String thang) {
        this.doanhthu = doanhthu;
        this.thang = thang;
    }
    public DoanhThuThongKe(){
        
    }
    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }
}
