package com.javaweb.kiemtramodule;

import java.util.Scanner;

public class Dog extends Animal{
    String mauDuoi;

    public void hienThiThongTin(){
        System.out.printf(toString());
        barkAble();
        runAble();
    }
    public void nhapThongTin(){
        System.out.printf("Nhập Thông Tin Chó:%n");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Màu Đuôi:");
        mauDuoi = sc.nextLine();
        super.nhapThongTin();

    }

    @Override
    public String toString() {
        return "Dog{" +
                "mauDuoi='" + mauDuoi + '\'' +
                ", id='" + id + '\'' +
                ", name='" + ten + '\'' +
                ", mauLong='" + mauLong + '\'' +
                '}';
    }

    @Override
    public void barkAble() {
        System.out.printf("Chó Có Thể Sủa");
    }

    @Override
    public void runAble() {
        System.out.printf("Chó Có Thể Chạy");
    }

    @Override
    public void flyAble() {
        System.out.printf("Chó Không Biết Bay");
    }

    @Override
    public void swimAble() {
        System.out.printf("Có Loài Bơi Được,Có Loài Không Bơi Được");
    }
}
