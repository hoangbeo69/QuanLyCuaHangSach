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
public class HoaDon {
    private String mahd;
    private String manv;
    private String makh;
    private String ngaylap;
    private String giolap;
    private String tongtien;
    public  HoaDon(){
        
    }
    public String getMahd() {
        return mahd;
    }

    public HoaDon(String mahd, String manv, String makh, String ngaylap, String giolap, String tongtien) {
        this.mahd = mahd;
        this.manv = manv;
        this.makh = makh;
        this.ngaylap = ngaylap;
        this.giolap = giolap;
        this.tongtien = tongtien;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getGiolap() {
        return giolap;
    }

    public void setGiolap(String giolap) {
        this.giolap = giolap;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }
            
}
