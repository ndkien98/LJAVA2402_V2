package com.t3h.buoi9;

import java.util.Scanner;

public class HinhChuNhat extends Hinh {

    private Float chieuDai;
    private Float chieuRong;
    private Float chuVi;

    public void hello(){

    }
    public void nhapThongTin(){
        System.out.println("Nhập chiều dài: ");
        this.chieuDai = new Scanner(System.in).nextFloat();

        System.out.println("Nhập chiều rộng: ");
        this.chieuRong = new Scanner(System.in).nextFloat();
    }

    public final float tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }

    public Float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(Float chieuDai) {
        this.chieuDai = chieuDai;
    }
}
