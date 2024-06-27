package com.javaweb.kiemtramodule;

import java.util.Scanner;

public abstract class Animal implements TongHopThuocTinh{
    String id;
    String ten;
    String mauLong;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Tên:");
        ten = sc.nextLine();
        System.out.printf("Nhập Màu Lông:");
        mauLong = sc.nextLine();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
