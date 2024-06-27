package com.linh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tổng số lượng học sinh");
        int n = scanner.nextInt();
        studentcount studentCount = new studentCount(n);
        // Tạo ra sách mặc định
        for (int i = 0; i < 3; i++) {
            students student = new students(i+ "P",
                    "id " + i,
                    i + "name",
                    "age" + i,
                    i + "hometown",
                    "bithyear"+i,
                    i+ "phonenumber",
                    i + 1,
                    i + 1,
                    i + 1);
            studentCount .themhocsinh(student);
        }
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm hoc sinh  ");
            System.out.println("3. Xóa hoc sinh");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    studentCount.hienThiDanhSach();
                    break;
                case 2:
                    System.out.println("Nhập vào thông tin học sinh");
                    students students = new students(studentCount);
                    students.nhapThongTin();
                    break;
                case 3:
                    studentCount.xoastudent();
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