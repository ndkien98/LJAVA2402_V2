package com.t3h.buoi2.codesilde.epkieu;

public class Demo {

    public static void main(String[] args) {
        // Ép kiểu ngầm định
        int soNguyen = 10;
        double soThuc = soNguyen; // Ép kiểu ngầm định từ int sang double

        System.out.println("Số nguyên: " + soNguyen);
        System.out.println("Số thực (sau khi ép kiểu ngầm định): " + soThuc);

        // Ép kiểu tường minh
        double soThuc2 = 15.75;
        int soNguyen2 = (int) soThuc2; // Ép kiểu tường minh từ double sang int

        System.out.println("Số thực 2: " + soThuc2);
        System.out.println("Số nguyên (sau khi ép kiểu tường minh): " + soNguyen2);
    }

}
