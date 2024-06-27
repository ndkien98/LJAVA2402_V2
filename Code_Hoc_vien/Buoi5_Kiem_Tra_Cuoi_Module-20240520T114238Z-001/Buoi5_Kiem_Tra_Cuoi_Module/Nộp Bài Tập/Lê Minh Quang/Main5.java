package org.example.buoi5;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        QuanLyHocSinh quanLySach = new QuanLyHocSinh();
       Array array = new Array();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("nhập 1 = bài 1");
            System.out.println("nhập 2 = bài 2");
            System.out.println("nhập 3 = thoát");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                   array.testLap();
                    break;
                case 2:
                    quanLySach.NhapSach();
                    break;
                case 3:
                    System.out.println("Thoát");
                default:
                    System.out.println("Không có Chức năng");
            }

        }while (a!=3);
    }
}