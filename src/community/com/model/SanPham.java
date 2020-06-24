
package community.com.model;


public class SanPham {
    private String maSP;
    private String tenSP;
    private Double gia;
    private String kieuDang;
    private String mauSac;
    private String xuatXu;
    private String moTa;

    public SanPham() {
    }

    public SanPham(String maSP) {
        this.maSP = maSP;
    }

    public SanPham(String maSP, String tenSP, Double gia, String kieuDang, String mauSac, String xuatXu, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.kieuDang = kieuDang;
        this.mauSac = mauSac;
        this.xuatXu = xuatXu;
        this.moTa = moTa;
    }

    public SanPham(String maSP, String tenSP, Double gia, String kieuDang, String mauSac, String xuatXu, int soLuong, String moTa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + ", kieuDang=" + kieuDang + ", mauSac=" + mauSac + ", xuatXu=" + xuatXu + ", moTa=" + moTa + '}';
    }

    public Object getSoLuong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
