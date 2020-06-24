
package community.com.model;

import java.util.Date;

public class HoaDon {
    private String maHD;
    private String maNV;
    private String maSP;
    private String maKH;
    private Date ngayLap;
    private int soLuong;
    private double donGia;

    public HoaDon(String maHD, String maNV, String maSP, String maKH, int soLuong, double donGia) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maSP = maSP;
        this.maKH = maKH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDon() {
    }

    public HoaDon(String maHD, String maNV, String maSP, String maKH, Date ngayLap, int soLuong, double donGia) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maSP = maSP;
        this.maKH = maKH;
        this.ngayLap = ngayLap;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDon(String maHD, String maNV, String maSP, String maKH, String ngayLap, int soLuong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public HoaDon(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", maNV=" + maNV + ", maSP=" + maSP + ", maKH=" + maKH + ", ngayLap=" + ngayLap + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    public Object getTongTien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
         
}
