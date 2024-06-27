package com.t3h.buoi2.codesilde.baitap;

public class Ex2 {
    /**

     Viết chương trình Java để kiểm tra một số nguyên có phải là số chẵn hay không.
     n là một số được nhập vào từ console
     Sử dụng toán tử % để kiểm tra phần dư.
     */

    public static void main(String[] args) {
        // Khai báo và khởi tạo biến
        int soNguyen = 7;

        // Kiểm tra số chẵn
        boolean laSoChan = (soNguyen % 2 == 0);

        // Hiển thị kết quả
        if (laSoChan) {
            System.out.println(soNguyen + " là số chẵn.");
        } else {
            System.out.println(soNguyen + " không phải là số chẵn.");
        }
    }
}
