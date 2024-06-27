package com.t3h.buoi10.demoabstract.demo;

public class Main {

    public static void main(String[] args) {

        NganHang bidv = new Bidv();
        bidv.setTenNganHang("BIDV");
        NganHang shb = new Shb();
        shb.setTenNganHang("shb");
        System.out.println(bidv.chuyenTien(1000));
        System.out.println(bidv.rutTien(1000));
        System.out.println(shb.rutTien(100));
        System.out.println(shb.chuyenTien(100));

    }
}
