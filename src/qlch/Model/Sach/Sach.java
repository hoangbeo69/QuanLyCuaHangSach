/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.Model.Sach;

/**
 *
 * @author HiHi
 */
public class Sach {
    private String masach;
    private String tensach;
    private String tacgia;
    private String nhaxb;
    private String kichthuoc;
    private String sotrang;
    public Sach(){
        
    }
    public Sach(String masach, String tensach, String tacgia, String nhaxb, String kichthuoc, String sotrang) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nhaxb = nhaxb;
        this.kichthuoc = kichthuoc;
        this.sotrang = sotrang;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public String getSotrang() {
        return sotrang;
    }

    public void setSotrang(String sotrang) {
        this.sotrang = sotrang;
    }
}
