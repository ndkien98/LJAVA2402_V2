package com.t3h.buoi8.baitap.bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean tiepTuc=true;
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu(50);
        while (tiepTuc){
            System.out.println("Chọn chức năng: ");
            System.out.println("1: Thêm mới tài liệu");
            System.out.println("2: Hiển thị danh sách tài liệu");
            System.out.println("3: Xóa tài liệu");
            System.out.println("4: Tìm tài liệu theo loại");
            System.out.println("5: Thoát");
            int action = new Scanner(System.in).nextInt();
            switch (action) {
                case 1:
                    quanLyTaiLieu.themTaiLieu();
                    break;
                case 2:
                    quanLyTaiLieu.hienThiTaiLieu();
                    break;
                case 3:
                    quanLyTaiLieu.xoaTaiLieu();
                    break;
                case 4:
                    quanLyTaiLieu.timKiemTheoLoai();
                    break;
                case 5:
                    tiepTuc=false;
            }
        }

    }
}
