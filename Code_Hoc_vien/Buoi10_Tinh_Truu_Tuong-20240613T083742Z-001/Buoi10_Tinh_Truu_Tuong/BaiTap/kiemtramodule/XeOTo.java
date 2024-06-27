package com.javaweb.kiemtramodule;

import java.util.Scanner;

public class XeOTo extends Machine{
    int ngayHetDangKiem;

    public void hienThiThongTin(){
        System.out.printf(toString());
        runAble();
    }
    public void nhapThongTin(){
        System.out.printf("Nhập Thông Tin Xe Oto:");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Ngày Hết Đăng Kiểm:");
        ngayHetDangKiem = sc.nextInt();
        super.nhapThongTin();
    }

    @Override
    public String toString() {
        return "XeOTo{" +
                "ngayHetDangKiem=" + ngayHetDangKiem +
                ", id='" + id + '\'' +
                ", ngaySanXuat=" + ngaySanXuat +
                ", hang='" + hang + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }

    @Override
    public void barkAble() {
        System.out.printf("Xe Oto Không Biết Sủa");
    }

    @Override
    public void runAble() {
        System.out.printf("Xe Oto Có Thể Chạy");
    }

    @Override
    public void flyAble() {
        System.out.printf("Xe Oto Không Biết Bay");
    }

    @Override
    public void swimAble() {
        System.out.printf("Xe Oto Không Biết Bơi");
    }
}
