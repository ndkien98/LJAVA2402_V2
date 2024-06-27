package com.t3h.buoi10.baitap;

import java.util.Scanner;

public abstract class MachineAbstract implements TongHopChucNang{
    private String id;
    private String ngaySanXuat;
    private String hang;
    private String ten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public MachineAbstract(String id,String ngaySanXuat, String hang, String ten){
        this.id = id;
        this.ngaySanXuat = ngaySanXuat;
        this.hang = hang;
        this.ten = ten;
    }


    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nập id: ");
        this.id = id;

        System.out.println("Nhập ngày sản xuất: ");
        this.ngaySanXuat = ngaySanXuat;
        System.out.println("Nhập hãng sản xuất: ");
        this.hang = hang;
        System.out.println("Nhập tên:");
        this.ten = ten;
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
