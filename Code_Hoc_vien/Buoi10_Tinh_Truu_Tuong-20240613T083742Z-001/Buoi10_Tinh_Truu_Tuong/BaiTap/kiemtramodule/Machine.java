package com.javaweb.kiemtramodule;

import java.util.Scanner;

public abstract class Machine implements TongHopThuocTinh{
    String id;
    int ngaySanXuat;
    String hang;
    String ten;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Ngày Sản Xuất:");
        ngaySanXuat = sc.nextInt();
        System.out.printf("Nhập Hãng:");
        sc.nextLine();
        hang = sc.nextLine();
        System.out.printf("Nhập Tên:");
        ten = sc.nextLine();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
