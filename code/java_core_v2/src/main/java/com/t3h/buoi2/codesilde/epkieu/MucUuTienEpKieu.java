package com.t3h.buoi2.codesilde.epkieu;

public class MucUuTienEpKieu {
    public static void main(String[] args) {
        // Ví dụ về mức ưu tiên ép kiểu
        int soNguyen = 5;
        double soThuc = 10.5;
        long soNguyenLon = 100;

        double ketQua1 = soNguyen + soThuc; // int -> double
        long ketQua2 = soNguyen + soNguyenLon; // int -> long

        // Hiển thị kết quả
        System.out.println("Kết quả 1: " + ketQua1);
        System.out.println("Kết quả 2: " + ketQua2);
    }
}
