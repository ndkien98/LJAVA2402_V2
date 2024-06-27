package com.t3h.buoi8.baitap.bai1;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private int thangPhatHanh;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phát hành: ");
        this.soPhatHanh = scanner.nextLine();
        System.out.println("Nhập tháng phát hành: ");
        this.thangPhatHanh = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(this.toString());
        super.hienThiThongTin();
    }

    @Override
    public String toString() {
        return "TapChi: " +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh ;
    }
}
