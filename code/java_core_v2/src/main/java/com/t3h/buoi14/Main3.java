package com.t3h.buoi14;

import java.util.Scanner;
import java.util.Stack;

/**

 Bài tập:
    cho người dùng nhập vào một chuỗi ký tự, đảo ngược chuỗi ký tự đó
 */
public class Main3 {

    public static void main(String[] args) {

        // Cho người dùng nhập vào chuỗi ký tự
        System.out.println("Nhập vào chuối ký tự: ");
        String data = new Scanner(System.in).nextLine();
        System.out.println("Chuỗi đã nhập là: " + data);
        // Khai báo Stack
        Stack<String> stringStack = new Stack<>();
        // lấy ra tổng số ký tự trong chuỗi
        int tongSoKyTu = data.length();
        // duyệt chuỗi ký tự
        for (int i = 0; i < tongSoKyTu; i++) {
            char kyTu = data.charAt(i); // lấy ra từ ký tự chuỗi chuỗi
            // ép kiểu char -> String
            String dataFinal = String.valueOf(kyTu);
            // thêm từng ký tự của chuỗi vào Stack
            stringStack.push(dataFinal);
        }
        // duyệt lại stack
        while (!stringStack.isEmpty()){
            String dataStack = stringStack.pop(); // lấy ra phâần tử đầu tin của stack
            System.out.print(dataStack + " ");
        }


    }

}
