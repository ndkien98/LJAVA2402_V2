package com.t3h.buoi14.chuabaikiemtramodule2.animal;

import java.util.Scanner;

/*
loaiHat
 */
public class Chim extends Animal {

    private String loaiHat;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập loại hạt: ");
        this.loaiHat = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("loại hạt, " + loaiHat);
    }

    @Override
    public void flyable() {
        System.out.println(super.getTen() + " đang bay");
    }

    public String getLoaiHat() {
        return loaiHat;
    }

    public void setLoaiHat(String loaiHat) {
        this.loaiHat = loaiHat;
    }
}
