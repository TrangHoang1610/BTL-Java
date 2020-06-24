/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package community.com.model;

/**
 *
 * @author quang
 */
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String chucVu;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public NhanVien(String maNV, String tenNV, String chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", chucVu=" + chucVu + '}';
    }

    public NhanVien() {
    }
}
