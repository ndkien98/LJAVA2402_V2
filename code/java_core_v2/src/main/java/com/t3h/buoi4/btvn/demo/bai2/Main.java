package com.t3h.buoi4.btvn.demo.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tổng số lượng sách của thư viện");
        int n = scanner.nextInt();
        QuanLySach quanLySach = new QuanLySach(n);
        // Tạo ra sách mặc định
        for (int i = 0; i < 3; i++) {
            Sach sach = new Sach(i+ "P",
                    "Nhà xuất bản " + i,
                    i + "soBanPhatHanh",
                    "Tên tác giả " + i,
                    i,
                    i + 1,
                    i + 1,
                    i + 1);
            quanLySach.themSach(sach);
        }
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    quanLySach.hienThiDanhSach();
                    break;
                case 2:
                    System.out.println("Nhập vào thông tin sách");
                    Sach sach = new Sach();
                    sach.nhapThongTin();
                    quanLySach.themSach(sach);
                    break;
                case 3:
                    quanLySach.xoaSach();
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }

    }
}
