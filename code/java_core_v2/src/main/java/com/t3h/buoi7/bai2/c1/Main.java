package com.t3h.buoi7.bai2.c1;

/**
 C1:
 Class: Nguoi
     filed:
         Họ tên String
         tuoi int
         cmnd String
 Supper Class: Phong ( một phòng có nhiều người thuê)
     filed:
         Số ngày thuê : int
         thông tin cá nhân của những người thuê phòng : Nguoi []
         giá : float
 Sub class: PhongA, PhongB,PhongC kế thừa Phong
     override lại làm giá phòng
         với PhongA => giá = 500
         PhongB => giá = 300
         PhongC => giá = 100
 Class: KhachSan
     filed:
     Phong[] danhSachCacPhong;
     int tongSoCacPhong
     int soLuongPhongDaDungHienTai
 */
public class Main {
    public static void main(String[] args) {
        KhachSan khachSan = new KhachSan();
        khachSan.themPhong();
//        khachSan.hienThiDanhSachCacPhong();
    }
}
