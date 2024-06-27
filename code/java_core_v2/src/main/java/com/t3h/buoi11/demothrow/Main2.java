package com.t3h.buoi11.demothrow;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        /**
         cho người dùng nhập vào 1 số bất kỳ, nếu số đây <= 0 => ném ra lỗi NumberFormatException
         */
        try {
            int n = Main2.getDataConsole();
        } catch (CustomExceptionT3h e) {
            System.out.println("xử lý lỗi: " + e.getMessage());
        }
    }
    // throws IOException: khai báo trước rằng hàm getDataConsole có thể sảy ra lỗi, bắt buộc phải try catch khi xử dụng
    public static int getDataConsole() throws CustomExceptionT3h{
        System.out.println("Nhập vào số n: ");
        int n = new Scanner(System.in).nextInt();
        if (n <=0){
            // chủ động bắn ra 1 exception trong tình huống n <= 0
            throw new CustomExceptionT3h();
        }else {
            System.out.println("Số đã nhập là: " + n);
            return n;
        }
    }
}
