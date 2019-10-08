/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.SanPham;

/**
 *
 * @author HiHi
 */
public class SanPham {
    private String masach;
    private String dongia;
    private String soluong;
    private String hinhanh;
    public SanPham(){ 
    }
    public SanPham(String masach, String dongia, String soluong, String hinhanh) {
        this.masach = masach;
        this.dongia = dongia;
        this.soluong = soluong;
        this.hinhanh = hinhanh;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
