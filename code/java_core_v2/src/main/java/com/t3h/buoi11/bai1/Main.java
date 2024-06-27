package com.t3h.buoi11.bai1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Main.nhapThongTinTamGiac();
        }catch (InvalidTriangleException e){
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
    public static void nhapThongTinTamGiac() throws InvalidTriangleException {
        Scanner scanner = new Scanner(System.in);
        int maxValue = 100;
        try {
            System.out.println("Nhập vào cạnh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhập vào cạnh b: ");
            int b = scanner.nextInt();
            System.out.println("Nhập vào cạnh c: ");
            int c = scanner.nextInt();

            if (a <0 || b <0 || c <0){
                throw new InvalidTriangleException("Lỗi các số đang nhỏ hơn 0");
            }
            if (a > maxValue || b > maxValue || c > maxValue){
                throw new InvalidTriangleException("Lỗi các số đang lớn hơn " + maxValue);
            }
            System.out.println("Khởi tạo ba cạnh của tam giác thành công: ");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }catch (InputMismatchException e){
            throw new InvalidTriangleException("Data nhập vào không phải định dạng số");
        }
    }
}
