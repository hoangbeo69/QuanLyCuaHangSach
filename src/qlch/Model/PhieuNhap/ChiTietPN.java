/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.PhieuNhap;

/**
 *
 * @author HiHi
 */
public class ChiTietPN {
    private String mapn;
    private String masach;
    private String soluong;
    private String dongia;

    public ChiTietPN(String mapn, String masach, String soluong, String dongia) {
        this.mapn = mapn;
        this.masach = masach;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public ChiTietPN(){
        
    }
    public String getMapn() {
        return mapn;
    }

    public void setMapn(String mapn) {
        this.mapn = mapn;
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
