package com.javaweb.kiemtramodule;

import java.util.Scanner;

public class MayBay extends Machine{
    String sanBay;

    public void hienThiThongTin(){
        System.out.printf(toString());
        flyAble();
    }
    public void nhapThongTin(){
        System.out.printf("Nhập Thông Tin Máy Bay:%n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Sân Bay:");
        sanBay = sc.nextLine();
        super.nhapThongTin();
    }

    @Override
    public String toString() {
        return "MayBay{" +
                "sanBay='" + sanBay + '\'' +
                ", id='" + id + '\'' +
                ", ngaySanXuat=" + ngaySanXuat +
                ", hang='" + hang + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }

    @Override
    public void barkAble() {
        System.out.printf("Máy Bay Không Biết Sủa");
    }

    @Override
    public void runAble() {
        System.out.printf("Máy Bay Không Thể Chạy");
    }

    @Override
    public void flyAble() {
        System.out.printf("Máy Bay Có THể Bay");
    }

    @Override
    public void swimAble() {
        System.out.printf("Máy Bay Không Biết Bơi");
    }
}
