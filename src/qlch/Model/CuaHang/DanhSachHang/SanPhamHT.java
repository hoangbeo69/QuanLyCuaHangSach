/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.CuaHang.DanhSachHang;

/**
 *
 * @author HiHi
 */
public class SanPhamHT {
    private String masach;
    private String dongia;
    private String soluong;

    public SanPhamHT(String masach, String dongia, String soluong) {
        this.masach = masach;
        this.dongia = dongia;
        this.soluong = soluong;
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
}
