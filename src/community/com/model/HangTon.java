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
public class HangTon {
    private String maSP;
    private int soLuongTon;
    private boolean  tinhTrang;

    public HangTon() {
    }

    public HangTon(String maSP, int soLuongTon, boolean tinhTrang) {
        this.maSP = maSP;
        this.soLuongTon = soLuongTon;
        this.tinhTrang = tinhTrang;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "HangTon{" + "maSP=" + maSP + ", soLuongTon=" + soLuongTon + ", tinhTrang=" + tinhTrang + '}';
    }
    
}
