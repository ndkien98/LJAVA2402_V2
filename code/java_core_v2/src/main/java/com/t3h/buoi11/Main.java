package com.t3h.buoi11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        try {
            System.out.println(a/0);
        }catch (Exception e){
            System.out.println("Đã xaảy ra lỗi chia cho 0");
        }

        Object person = null;
        Main.demoNullPointer(person);

//        try {
//            System.out.println("Nhập vào một số nguyên n: ");
//            String n = new Scanner(System.in).nextLine();
//            System.out.println("số vừa nhập là: " + Integer.parseInt(n));
//        }catch (NumberFormatException e){
//            System.out.println("sai format số");
//        }

        try {
            // đoạn code có thể xảy ra lỗi
            int[] arrN = new int[3];
            arrN[10] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            // code xử lỹ khi xảy ra lỗi
            System.out.println("Xảy ra lỗi trong quá trình gán phần tử cho mảng: " + e.getMessage());
        }finally {
            // code trong khối lệnh finally
            System.out.println("Chương trình có lỗi hoặc không sẽ đều chạy vào khối lệnh finally");
        }
        System.out.println("Chương trình kết thúc");






    }

    public static void demoNullPointer(Object person){
        try {
            person.toString();
        }catch (Exception e){
            System.out.println("Object bị null");
        }
    }
}
