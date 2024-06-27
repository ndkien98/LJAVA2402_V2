package com.t3h.buoi14.chuabaikiemtramodule2.animal;

import java.util.Scanner;

/**
 + màu đuôi
 */
public class Cho extends Animal {

    private String mauDuoi;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập màu đuôi: ");
        this.mauDuoi = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("màu đuôi, " + mauDuoi);

    }

    @Override
    public void barkable() {
        System.out.println(super.getTen() + " đang sủa");
    }

    @Override
    public void runable() {
        System.out.println(super.getTen() + " đang chạy");
    }

    public String getMauDuoi() {
        return mauDuoi;
    }

    public void setMauDuoi(String mauDuoi) {
        this.mauDuoi = mauDuoi;
    }
}
