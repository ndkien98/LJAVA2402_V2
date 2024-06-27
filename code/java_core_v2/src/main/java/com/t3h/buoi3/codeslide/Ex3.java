package com.t3h.buoi3.codeslide;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào n");
        n = scanner.nextInt();

        int tong = 0;
        for (int i = 1; i <=n ; i++) {
            tong = tong + i;
        }
        System.out.println("Tổng từ 1 -n là: " + tong);

        // tính tổng các số chẵn
        int tongSoChan = 0;
        int init = 2;
        while (init <= n){
            tongSoChan = init + tongSoChan;
            init +=2;
        }
        System.out.println("Tổng các số chẵn từ 1-n là: " + tongSoChan);

        System.out.println("Các số nguyên tố từ 1-n là");
        /**
         * Chỉ chia hết cho 1 và chính nó
         => trong khoảng từ 1 -> chính nó nếu tồn tại một số chia lấy dư == 0
                => đó không phải số nguyên tố
         */
        for (int i = 2; i < n; i++) {
            boolean laSoNguyenTo = true;
            if (i > 2){
                // Kiểm tra từ 1 đến chính nó
                for (int j = 2; j <i; j++) {
                    // Nếu chia lấy dư cho bất số nào từ 1-> chính nó == 0 => laSoNguyenTo = false
                   if (i % j == 0){
                       laSoNguyenTo = false;
                       break;
                   }
                }
            }
            if (laSoNguyenTo){
                System.out.println(i + " là số nguyên tố!");
            }
        }
    }
}
