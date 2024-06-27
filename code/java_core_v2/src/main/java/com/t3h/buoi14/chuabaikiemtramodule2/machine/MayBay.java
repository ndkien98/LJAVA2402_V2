package com.t3h.buoi14.chuabaikiemtramodule2.machine;

import java.util.Scanner;

public class MayBay extends Machine {
    private String sanBay;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhập vào sân bay: ");
        this.sanBay = new Scanner(System.in).nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("sân bay: " + sanBay);

    }
    public String getSanBay() {
        return sanBay;
    }

    public void setSanBay(String sanBay) {
        this.sanBay = sanBay;
    }
}
