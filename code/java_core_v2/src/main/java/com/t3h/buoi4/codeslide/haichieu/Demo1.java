package com.t3h.buoi4.codeslide.haichieu;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // Khai báo mảng hai chiều có kích thước [2][2]
        int[][] matrix = new int[2][2];
        // Sử dụng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // Nhập dữ liệu vào mảng
        System.out.println("Nhập dữ liệu cho mảng hai chiều:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Nhập phần tử ở hàng " + i + ", cột " + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        // In ra dữ liệu đã nhập
        System.out.println("Dữ liệu trong mảng hai chiều:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
