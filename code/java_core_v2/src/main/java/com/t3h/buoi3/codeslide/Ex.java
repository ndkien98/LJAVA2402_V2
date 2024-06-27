package com.t3h.buoi3.codeslide;

import java.util.Scanner;

/*
Bai 1:
    Cho người dùng nhập vào 3 số thực.
    Kiêm tra 3 số đó có phải là 3 cạnh của 1 tam giác không
Bai 2: Nhập vào một tháng trong năm. Hiển thị mùa cuâ tháng đó
    từ tháng 1,2,12 => mùa đông
            3 đến 5: mùa xuân
            6 đến 8 mùa hè
            9 đến 10 mùa thu
            sử dụng switch case
 */
public class Ex {

    public static void main(String[] args) {

        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a");
        a= scanner.nextInt();
        System.out.println("Nhập vào cạnh b");
        b= scanner.nextInt();
        System.out.println("Nhập vào cạnh c");
        c= scanner.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Là 3 cạnh của tam giác");
        }else {
            System.out.println("Không phải 3 cạnh của tam giác");
        }


    }
}
