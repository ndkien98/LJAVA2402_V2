package com.t3h.buoi7.bai2.c1;

public class PhongC extends Phong{
    public PhongC() {
        super(1);
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
        return 100;
    }
}
