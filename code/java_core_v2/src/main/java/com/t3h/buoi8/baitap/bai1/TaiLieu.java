package com.t3h.buoi8.baitap.bai1;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
//        System.out.printf("Nhập vào mã tài liệu");
        System.out.println("Nhập tên nhà xuất bản: ");
        this.tenNhaXuatBan = sc.nextLine();
        System.out.println("Nhập số bản phát hành: ");
        this.soBanPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin(){
        System.out.println(this.toStringTaiLieu());
    }
    // alt + insert => popup auto gencode
    public String toStringTaiLieu() {
        return "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soPhatHanh=" + soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }
}
