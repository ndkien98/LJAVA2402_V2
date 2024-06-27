package com.t3h.buoi10.demoabstract.demo;

public class Bidv extends NganHang{

    @Override
    public String chuyenTien(int soTien) {
        return super.getTenNganHang() + " chuyển tiền thành công";
    }

    @Override
    public String rutTien(int soTien) {
        return super.getTenNganHang() + " rút tiền thành công";
    }
}
