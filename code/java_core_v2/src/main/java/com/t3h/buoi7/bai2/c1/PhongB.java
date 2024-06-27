package com.t3h.buoi7.bai2.c1;

public class PhongB extends Phong{
    public PhongB() {
        super(2);
    }

    @Override
    public String toString() {
        return "Phong{" +
                "soNgayThue=" + super.getSoNgayThue() +
                ", soLuongNguoiDangO=" + super.getSoLuongNguoiDangO() +
                ", giaPhong=" + getGiaPhong() +
                ", maPhong='" + super.getMaPhong() + '\'' +
                '}';
    }
    @Override
    public float getGiaPhong() {
        return 300;
    }
}
