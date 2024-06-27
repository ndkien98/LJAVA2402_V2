package com.t3h.buoi4.objectclass;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenNxb;
    private long soBanPhatHanh;
    private String tenTacGia;
    private long soTrang;
    private String ngayPhatHanh;
    private int soPhatHanh;
    private String thangPhatHanh;

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
        this.maSach = scanner.nextLine();
        System.out.println("Nhập vào tên nhà xuất bản: ");
        this.tenNxb = scanner.nextLine();
        System.out.println("Nhập vào số phát hành: ");
        this.soPhatHanh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào tên tác giả: ");
        this.tenTacGia = scanner.nextLine();
        System.out.println("Nhập vào số trang: ");
        this.soTrang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào ngày phát hành: ");
        this.ngayPhatHanh = scanner.nextLine();
        System.out.println("Số phát hành: ");
        this.soPhatHanh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tháng phát hành: ");
        this.thangPhatHanh = scanner.nextLine();
    }

    public void hienThiThongTin(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenNxb='" + tenNxb + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", ngayPhatHanh='" + ngayPhatHanh + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                '}';
    }
}
