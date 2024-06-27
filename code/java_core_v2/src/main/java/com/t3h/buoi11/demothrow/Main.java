package com.t3h.buoi11.demothrow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         cho người dùng nhập vào 1 số bất kỳ, nếu số đây <= 0 => ném ra lỗi NumberFormatException
         */
        try {
            int n = Main.getDataConsole();
        }catch (NumberFormatException e){
            // xử lý lỗi được bắn ra và hiển thị message của hàm getDataConsole
            System.out.println("lỗi: " + e.getMessage());
        }finally {
            System.out.println("Chương trình đã chạy thành công");
        }
    }
    public static int getDataConsole(){
        System.out.println("Nhập vào số n: ");
        int n = new Scanner(System.in).nextInt();
        if (n <=0){
            // chủ động bắn ra 1 exception trong tình huống n <= 0
            throw new NumberFormatException("Số nhập vào không hợp lệ ");
        }else {
            System.out.println("Số đã nhập là: " + n);
            return n;
        }
    }
}
