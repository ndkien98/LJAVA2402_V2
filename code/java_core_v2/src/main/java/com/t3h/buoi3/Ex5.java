package com.t3h.buoi3;

import java.util.Scanner;

/**
 * Bai 5: nhập vào n
 * Nếu người dùng nhập vào số <0 sẽ bắt người dùng nhập lại dữ liệu cho tới khi số đã > 0
 * a) tính tổng các số từ 1 đến n
 * b) tính tổng các số chẵn
 * c) in ra các số nguyên tố từ 1 đến n và tính tổng các số đó

 Bai 6:
 Xác định số lớn nhất trong ba số:
 Viết một chương trình Java để xác định số lớn nhất trong ba số nhập từ bàn phím.



 */
public class Ex5 {

    public static void main(String[] args) {

        /**
         dùng vòng lặp kiểm tra n
         nếu n > 0 => thoát khỏi vòng lặp
         nếu n <=0 => tiếp tục vòng lặp
         */
        int n = 0;
        do {
            System.out.println("Nhập vào n: ");
            n = new Scanner(System.in).nextInt();
        } while (n <= 0);

        // tính tổng các số 1-n
        /**
         giải thuật đặt lính canh
         - đặt một biến tổng
         - chạy vòng lặp for cộng thêm giá trị cho biến đó với mỗi lần lặp
         */
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i; // tong = tong + i
        }
        System.out.println("Tổng các số từ 1 đến " + n + " là:" + tong);
        // tính tổng các số chẵn
        int sum1 = 0;
        int i = 0;
        do {
            sum1 += i;
            i += 2;
        } while (i <= n);
        System.out.printf("Tổng các số chẵn từ 1 đến " + n + " là: " + sum1 + "\n");
        // tính tổng các số nguyên tố và in ra các số nguyên tố
        // số nguyên tố là số chỉ chia hết cho 1 và chính => nếu có chia hết cho 1 số khác => false
        /**
         - duyệt tất cả các số từ 3 -> n gọi là i
         - nếu i chia hết cho một số khác từ 1-i => i không phải số nguyên tố
         */
        int tongSnt = 0;
        for (int j = 1; j < n; j++) {
            if (j == 1)
                continue;
            if (j <= 3) {
                System.out.println("số nguyên tố: " + j);
                tongSnt += j;
            } else {
                if (kiemTraSnt(j)) {
                    System.out.println("Số nguyên tố: " + j);
                    tongSnt += j;
                }
            }
        }
        System.out.println("Tổng các số nguyên tố từ 1 đến " + n + " là: " + tongSnt);
    }

    public static boolean kiemTraSnt(int j) {
        for (int i = 2; i < j; i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
}
