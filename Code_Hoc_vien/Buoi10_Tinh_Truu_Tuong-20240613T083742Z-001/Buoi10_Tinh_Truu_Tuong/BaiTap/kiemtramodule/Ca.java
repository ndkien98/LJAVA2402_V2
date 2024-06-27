package com.javaweb.kiemtramodule;

import java.util.Scanner;

public class Ca extends Animal{
    String vungBien;

    public void hienThiThongTin(){
        System.out.printf(toString());
        swimAble();
    }

    public void nhapThongTin(){
        System.out.printf("Nhập Thông Tin Chim:");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Vùng Biển");
        vungBien = sc.nextLine();
        super.nhapThongTin();
    }

    @Override
    public String toString() {
        return "Ca{" +
                "vungBien='" + vungBien + '\'' +
                ", id='" + id + '\'' +
                ", name='" + ten + '\'' +
                ", mauLong='" + mauLong + '\'' +
                '}';
    }
    @Override
    public void barkAble() {
        System.out.printf("Cá Không Biết Sủa");
    }

    @Override
    public void runAble() {
        System.out.printf("Cá Không Biết Chạy");
    }

    @Override
    public void flyAble() {
        System.out.printf("Cá Không Biết Bay");
    }

    @Override
    public void swimAble() {
        System.out.printf("Cá Biết Bơi");
    }
}
