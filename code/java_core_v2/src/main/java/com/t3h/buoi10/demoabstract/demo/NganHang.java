package com.t3h.buoi10.demoabstract.demo;

/**
 bt:
 Tạo class Abstract NganHang với các thuộc tính:
 tên ngân hàng, địa chỉ
 - method abstract:
 + String chuyenTien(int soTien)
 + String rutTien(int soTien)
 Tạo ra hai class Bidv, Shb kế thừa từ NganHang
 yêu cầu:
 - override lại các method
 - tạo ra hai đối tượng bidv và shb
 - gọi tới các hàm chuyenTien, rutTien và tự định nghĩa ra các
 thông điệp khi gọi hàm
 */
public abstract class NganHang {
    private String tenNganHang;
    private String diaChi;
    public abstract String chuyenTien(int soTien);
    public abstract String rutTien(int soTien);

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getTenNganHang() {
        return tenNganHang;
    }
}
