package com.t3h.buoi1;

import java.util.Scanner;
public class Main {
    // comment
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int tong = 0;
        System.out.println("Nhập vào số A: ");
        int soA = new Scanner(System.in).nextInt(); // câu lệnh lấy dữ liệu người dùng nhập vào tại màn hình console
        System.out.println("Nhập vào số B: ");
        int soB = new Scanner(System.in).nextInt(); // câu lệnh lấy dữ liệu người dùng nhập vào tại màn hình console
        tong = tinhTong(soA,soB);
        System.out.println("tong: " + tong);
        sayHello();
    }
    public static int tinhTong(int soA,int soB){
        return soA + soB;
    }
    public static void sayHello(){
        System.out.println("hello world");
    }
}
