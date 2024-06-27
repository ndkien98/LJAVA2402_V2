package com.t3h.buoi14.chuabaikiemtramodule2.animal;

import com.t3h.buoi14.chuabaikiemtramodule2.interfaces.TongHopCacChucNang;

import java.util.Scanner;

/**
 + id
 + tên
 + màu lông
 */
public abstract class Animal implements TongHopCacChucNang {

    private Integer id;
    private String ten;
    private String mauLong;

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        this.ten = scanner.nextLine();
        System.out.println("Nhập vào màu lông: ");
        this.mauLong = scanner.nextLine();
    }

    public void hienThiThongTin(){
        System.out.print(this.toString() +", ");
    }
    @Override
    public String toString() {
        return " " +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", mauLong='" + mauLong + '\'';
    }

    @Override
    public void barkable() {
        System.out.println("barkable");
    }

    @Override
    public void runable() {
        System.out.println("runable");
    }

    @Override
    public void flyable() {
        System.out.println("flyable");
    }

    @Override
    public void swimable() {
        System.out.println("swimable");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }
}
