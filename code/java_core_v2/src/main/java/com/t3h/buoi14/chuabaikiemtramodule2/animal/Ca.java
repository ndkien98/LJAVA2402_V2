package com.t3h.buoi14.chuabaikiemtramodule2.animal;

import java.util.Scanner;

/**
 vùng biển
 */
public class Ca extends Animal {

    private String vungBien;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập vùng biển: ");
        this.vungBien = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("Vùng biển, " + vungBien);

    }

    @Override
    public void swimable() {
        System.out.println(super.getTen() + " đang bơi");
    }

    public String getVungBien() {
        return vungBien;
    }

    public void setVungBien(String vungBien) {
        this.vungBien = vungBien;
    }
}
