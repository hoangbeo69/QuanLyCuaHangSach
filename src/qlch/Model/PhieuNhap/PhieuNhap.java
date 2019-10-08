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
public class PhieuNhap {
    private String mapn;
    private String manv;
    private String ngaynhap;
    private String gionhap;
    private String tongtien;

    public PhieuNhap(String mapn, String manv, String ngaynhap, String gionhap, String tongtien) {
        this.mapn = mapn;
        this.manv = manv;
        this.ngaynhap = ngaynhap;
        this.gionhap = gionhap;
        this.tongtien = tongtien;
    }
    public PhieuNhap(){
        
    }
    public String getMapn() {
        return mapn;
    }

    public void setMapn(String mapn) {
        this.mapn = mapn;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getGionhap() {
        return gionhap;
    }

    public void setGionhap(String gionhap) {
        this.gionhap = gionhap;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }
    
}
