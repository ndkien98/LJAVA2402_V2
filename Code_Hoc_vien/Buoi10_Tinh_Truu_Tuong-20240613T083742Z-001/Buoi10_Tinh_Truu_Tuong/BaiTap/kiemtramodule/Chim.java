package com.javaweb.kiemtramodule;

import java.util.Scanner;

public class Chim extends Animal{
    String loaiHat;
    public void hienThiThongTin(){
        System.out.printf(toString());
        flyAble();
    }

    public void nhapThongTin(){
        System.out.printf("Nhập Thông Tin Chim:");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Loại Hạt");
        loaiHat = sc.nextLine();
        super.nhapThongTin();

    }

    @Override
    public String toString() {
        return "Chim{" +
                "loaiHat='" + loaiHat + '\'' +
                ", id='" + id + '\'' +
                ", name='" + ten + '\'' +
                ", mauLong='" + mauLong + '\'' +
                '}';
    }

    @Override
    public void barkAble() {
        System.out.printf("Chim Không Biết Sủa");
    }

    @Override
    public void runAble() {
        System.out.printf("Chim Không Biết Chạy");
    }

    @Override
    public void flyAble() {
        System.out.printf("Chim Biết Bay");
    }

    @Override
    public void swimAble() {
        System.out.printf("Chim Không Biết Bơi");
    }
}
