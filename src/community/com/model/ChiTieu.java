
package community.com.model;

import java.util.Date;


public class ChiTieu {
    private String maCT;
    private String tenKhoanChi;
    private Date ngay;
    private double soTien;

    public ChiTieu(String maCT, String tenKhoanChi, Date ngay, double soTien) {
        this.maCT = maCT;
        this.tenKhoanChi = tenKhoanChi;
        this.ngay = ngay;
        this.soTien = soTien;
    }

    public ChiTieu() {
    }

    public String getMaCT() {
        return maCT;
    }

    public void setMaCT(String maCT) {
        this.maCT = maCT;
    }

    public String getTenKhoanChi() {
        return tenKhoanChi;
    }

    public void setTenKhoanChi(String tenKhoanChi) {
        this.tenKhoanChi = tenKhoanChi;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return "ChiTieu{" + "maCT=" + maCT + ", tenKhoanChi=" + tenKhoanChi + ", ngay=" + ngay + ", soTien=" + soTien + '}';
    }
    
    
    
}
