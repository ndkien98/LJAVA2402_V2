package com.t3h.buoi10.baitap;

import java.util.Scanner;

public abstract class AnimalAbstract implements TongHopChucNang{
    private String id;
    private String ten;
    private String mauLong;



    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public AnimalAbstract(String id,String ten,String mauLong){
        this.id = id;
        this.mauLong = mauLong;
        this.ten = ten;
    }
    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id = id;
        System.out.println("Nhập tên: ");
        this.ten = ten;
        System.out.println("Nhập màu lông: ");
        this.mauLong = mauLong;
    }

    @Override
    public void hienThiThongTin() {

    }

    @Override
    public void barkable() {

    }

    @Override
    public void runable() {

    }

    @Override
    public void flyable() {

    }

    @Override
    public void swimable() {

    }
}
