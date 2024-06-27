package com.t3h.buoi8.baitap.bai1;

import java.util.Scanner;

public class Sach extends TaiLieu{

    private String tenTacGia;
    private int soTrang;

    @Override
    public void nhapThongTin() {
        // gọi tới hàm nhập thông tin của supper class(TaiLieu)
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.tenTacGia = sc.nextLine();
        System.out.println("Nhập vào số trang: ");
        this.soTrang = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(this.toString());
        super.hienThiThongTin();
    }

    @Override
    public String toString() {
        return "Sach: " +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang ;
    }
}
