/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.HoaDon;

/**
 *
 * @author HiHi
 */
public class ChiTietHoaDon {
    private String mahd;
    private String masach;
    private String soluong;
    private String dongia;

    public ChiTietHoaDon(String mahd, String masach, String soluong, String dongia) {
        this.mahd = mahd;
        this.masach = masach;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public ChiTietHoaDon(){
        
    }
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }
}
