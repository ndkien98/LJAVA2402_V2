package com.t3h.buoi7.bai2.c1;

import java.util.Arrays;
import java.util.Scanner;

public class Phong {

    private int soNgayThue;
    private Nguoi[] danhSachNguoiThue;
    private int soLuongNguoiDangO;
    private float giaPhong;
    private String maPhong;

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã phòng: ");
        this.maPhong = scanner.nextLine();
        System.out.println("Nhập số ngày thuê phòng: ");
        this.soNgayThue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập số lượng người muốn thêm vào phòng: ");
        int soLuongNguoi =0;
        boolean soLuongNguoiSai = true;
        do {
            soLuongNguoi = scanner.nextInt();
            if (soLuongNguoi > danhSachNguoiThue.length){
                System.out.println("Số lượng người lớn nhất có thể ở là: " + danhSachNguoiThue.length);
            }else {
                System.out.println("Bạn nhập vào số lượng người hợp lệ: ");
                soLuongNguoiSai = false;
            }
        }while (soLuongNguoiSai);
        Nguoi nguoi = null;
        for (int i = 0; i < soLuongNguoi; i++) {
                nguoi = new Nguoi();
                nguoi.nhapThongTinNguoi();
                nguoi.hienThiThongTin();
                this.danhSachNguoiThue[this.soLuongNguoiDangO] = nguoi;
                this.soLuongNguoiDangO++;
        }
    }
    public void hienThiThongTinPhong(){
        System.out.println("Thông tin phòng: ");
        System.out.println(this.toString());
        this.hienThiThongTinDanhSachNguoi();
    }
    public void hienThiThongTinDanhSachNguoi(){
        for (Nguoi n: this.danhSachNguoiThue) {
            if (n != null){
                n.hienThiThongTin();
            }
        }
    }
    @Override
    public String toString() {
        return "Phong{" +
                "soNgayThue=" + soNgayThue +
                ", soLuongNguoiDangO=" + soLuongNguoiDangO +
                ", giaPhong=" + giaPhong +
                ", maPhong='" + maPhong + '\'' +
                '}';
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Phong(int tongSoLuongNguoiO) {
        this.danhSachNguoiThue = new Nguoi[tongSoLuongNguoiO];
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public Nguoi[] getDanhSachNguoiThue() {
        return danhSachNguoiThue;
    }

    public void setDanhSachNguoiThue(Nguoi[] danhSachNguoiThue) {
        this.danhSachNguoiThue = danhSachNguoiThue;
    }

    public int getSoLuongNguoiDangO() {
        return soLuongNguoiDangO;
    }

    public void setSoLuongNguoiDangO(int soLuongNguoiDangO) {
        this.soLuongNguoiDangO = soLuongNguoiDangO;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }
}
