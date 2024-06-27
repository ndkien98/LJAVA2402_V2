package com.t3h.buoi7.bai2.c1;

import java.util.Scanner;

public class Nguoi {

    private String tenNguoi;
    private int tuoi;
    private String cmnd;

    // alt + insert => auto gencode

    public void nhapThongTinNguoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên người ở: ");
        this.tenNguoi = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập chứng minh nhân dân");
        this.cmnd = scanner.nextLine();
    }

    public void hienThiThongTin(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Nguoi{" +
                "tenNguoi='" + tenNguoi + '\'' +
                ", tuoi=" + tuoi +
                ", cmnd='" + cmnd + '\'' +
                '}';
    }

    public String getTenNguoi() {
        return tenNguoi;
    }

    public void setTenNguoi(String tenNguoi) {
        this.tenNguoi = tenNguoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}
