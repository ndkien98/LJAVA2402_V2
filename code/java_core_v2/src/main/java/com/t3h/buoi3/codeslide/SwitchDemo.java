package com.t3h.buoi3.codeslide;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args){
        int n=0; // khai báo biến
        System.out.println("Nhập vào thu: ");// Hiển thị thông báo trên console
        Scanner scanner = new Scanner(System.in);// Khai báo đối tượng nhập dữ liệu từ console
        n= scanner.nextInt(); //Thu thập số được nhập vào từ console
        switch (n){
            case 1:
                System.out.println("Chu nhat!");
                break;
            case 2:
                System.out.println("Thu hai!");
                break;
            case 3:
                System.out.println("Thu ba");
                break;
            case 4:
                System.out.println("Thu tu");
            case 5:
                System.out.println("Thu nam");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
            default:
                System.out.println("Thu ban nhap vao khong hop le");
        }


    }
}
