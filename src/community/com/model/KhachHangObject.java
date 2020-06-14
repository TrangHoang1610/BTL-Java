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
public class KhachHangObject {
    private String MaKH ;
    private String TenKH;
    private String SoDT;
    private Date NgaySinh;
    private String ThoiQuen;
    private String SoThich;

    public KhachHangObject() {
    }

    public KhachHangObject(String MaKH, String TenKH, String SoDT, Date NgaySinh, String ThoiQuen, String SoThich) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SoDT = SoDT;
        this.NgaySinh = NgaySinh;
        this.ThoiQuen = ThoiQuen;
        this.SoThich = SoThich;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getThoiQuen() {
        return ThoiQuen;
    }

    public void setThoiQuen(String ThoiQuen) {
        this.ThoiQuen = ThoiQuen;
    }

    public String getSoThich() {
        return SoThich;
    }

    public void setSoThich(String SoThich) {
        this.SoThich = SoThich;
    }

   
}
