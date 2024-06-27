package com.t3h.buoi3;

import java.util.Scanner;

/**
 Bai 6:
 Xác định số lớn nhất trong ba số:
 Viết một chương trình Java để xác định số lớn nhất trong ba số nhập từ bàn phím.
 */
public class Ex6 {

    public static void main(String[] args) {
        System.out.println("Nhập vào số thứ nhất: ");
        int n1 = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số thứ hai: " );
        int n2 = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        int n3 = new Scanner(System.in).nextInt();
        int max = n1;
        if (n2 > max){
            max = n2;
        }
        if (n3 > max){
            max = n3;
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}
