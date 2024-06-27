package com.t3h.buoi8.baitap.bai1;

import java.util.Scanner;

public class BaoCao extends TaiLieu{
    private String ngayPhatHanh;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày phát hành: ");
        this.ngayPhatHanh = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(this.toString());
        super.hienThiThongTin();
    }

    @Override
    public String toString() {
        return "BaoCao: " +
                "ngayPhatHanh='" + ngayPhatHanh + '\'';
    }
}
