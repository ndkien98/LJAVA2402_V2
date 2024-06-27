package com.t3h.buoi14.chuabaikiemtramodule2.machine;

import com.t3h.buoi14.chuabaikiemtramodule2.interfaces.TongHopCacChucNang;

import java.util.Scanner;

/**
 + id
 + ngày sản xuất
 + hãng
 + tên
 */
public abstract class Machine implements TongHopCacChucNang {

    private Integer id;
    private String ngaySanXuat;
    private String hang;
    private String ten;

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ngày sản xuất: ");
        this.ngaySanXuat = scanner.nextLine();
        System.out.println("Nhập vào màu hãng: ");
        this.hang = scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        this.ten = scanner.nextLine();
    }

    public void hienThiThongTin(){
        System.out.print(this.toString() +", ");
    }

    @Override
    public String toString() {
        return " " +
                "id=" + id +
                ", ngaySanXuat='" + ngaySanXuat + '\'' +
                ", hang='" + hang + '\'' +
                ", ten='" + ten + '\'';
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
}
