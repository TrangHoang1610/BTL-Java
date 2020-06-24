/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package community.com.model;

import java.sql.Date;

/**
 *
 * @author hoang
 */
public class ThongKe {
    private String maHD;
    private String tenSP;
    private String tenNV;
    private String tenKH;
    private Date ngayLap;
    private int soLuong;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public ThongKe() {
    }

    public ThongKe(String maHD, String tenSP, String tenNV, String tenKH, Date ngayLap, int soLuong) {
        this.maHD = maHD;
        this.tenSP = tenSP;
        this.tenNV = tenNV;
        this.tenKH = tenKH;
        this.ngayLap = ngayLap;
        this.soLuong = soLuong;
    }
    
    
   
}
