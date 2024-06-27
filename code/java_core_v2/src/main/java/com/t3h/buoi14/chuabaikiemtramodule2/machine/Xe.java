package com.t3h.buoi14.chuabaikiemtramodule2.machine;

import java.util.Scanner;

public class Xe extends Machine {

    public String ngayHetHan;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập vào ngày hết hạn: ");
        this.ngayHetHan = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("ngày hết hạn, " + ngayHetHan);

    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}
