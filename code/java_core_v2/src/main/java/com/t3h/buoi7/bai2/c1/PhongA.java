package com.t3h.buoi7.bai2.c1;

public class PhongA extends Phong{


    @Override
    public float getGiaPhong() {
        return 500;
    }

    @Override
    public void hienThiThongTinPhong() {
        System.out.printf(this.toString());
        this.hienThiThongTinDanhSachNguoi();
    }

    @Override
    public void hienThiThongTinDanhSachNguoi() {
        super.hienThiThongTinDanhSachNguoi();
    }

    @Override
    public String toString() {
        return "Phong{" +
                "soNgayThue=" + super.getSoNgayThue() +
                ", soLuongNguoiDangO=" + super.getSoLuongNguoiDangO() +
                ", giaPhong=" + getGiaPhong() +
                ", maPhong='" + getMaPhong() + '\'' +
                '}';
    }

    public PhongA() {
        super(3);
    }
}
