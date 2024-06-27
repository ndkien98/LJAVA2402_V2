package com.t3h.buoi3.codeslide;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // kiểm tra số trẵn lẻ được nhập vào từ người dùng
//        int n=0; // khai báo biến
//        System.out.println("Nhập vào n: ");// Hiển thị thông báo trên console
//        Scanner scanner = new Scanner(System.in);// Khai báo đối tượng nhập dữ liệu từ console
//        n= scanner.nextInt(); //Thu thập số được nhập vào từ console
//        // kiem tra so chan le thong qua bieu thuc n % 2 == 0
//        if(n % 2 == 0){
//            // neu bieu thuc n % 2 == 0 => true => thuc thi doan ma nay
//            System.out.println("So " + n + " la so chan!");
//        }else {
//            // neu bieu thuc n % 2 == 0 => false => thuc thi doan ma nay
//            System.out.println("So " + n + " la so le!");
//        }

        float diem = 6.5f;
//        if (diem <4){
//            System.out.println("Truot mon!");
//        }else if(diem >=4 && diem <6){
//            System.out.println("Diem D!");
//        }else if (diem >= 6 && diem < 7.5){
//            System.out.println("Diem C");
//        }else if (diem >= 7.5 && diem <8){
//            System.out.println("Diem B");
//        }else if (diem >=8 && diem <10){
//            System.out.println("Diem A");
//        }else {
//            System.out.println("Diem khong hop le");
//        }

        if (diem <4){
            System.out.println("Truot mon!");
        }
        if(diem >=4 && diem <6){
            System.out.println("Diem D!");
        }
        if (diem >= 6 && diem < 7.5){
            System.out.println("Diem C");
        }
        if (diem >= 7.5 && diem <8){
            System.out.println("Diem B");
        }
        if (diem >=8 && diem <10){
            System.out.println("Diem A");
        }else {
            System.out.println("Diem khong hop le");
        }


    }


}
