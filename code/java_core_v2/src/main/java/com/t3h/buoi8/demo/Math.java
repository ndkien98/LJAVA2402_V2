package com.t3h.buoi8.demo;

import java.util.Scanner;

public class Math {

    public int congHaiSo(){
        System.out.println("Nhập vào số thứ 1: ");
        int soThuNhat = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số thứ 2: ");
        int soThuHai = new Scanner(System.in).nextInt();

        return soThuNhat + soThuHai;
    }

    public int congHaiSo(int soThuNhat,int soThuHai){
        return soThuNhat + soThuHai;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.congHaiSo();
        math.congHaiSo(1,2);
    }
}
