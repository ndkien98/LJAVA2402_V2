package com.t3h.buoi3.codeslide;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        int thangTrongNam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh tháng trong năm");
        thangTrongNam= scanner.nextInt();

        switch (thangTrongNam){
            case 12:
            case 1:
            case 2:
                System.out.println("Mùa đông ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mùa xuân");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mùa hè");
                break;
            case 9:
            case 10:
                System.out.println("Mùa thu");
                break;
            default:
                System.out.println("Tháng nhập vào không đúng!");
        }


    }
}
