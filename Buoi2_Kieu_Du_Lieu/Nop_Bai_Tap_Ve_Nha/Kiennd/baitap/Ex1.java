package com.t3h.buoi2.codesilde.baitap;

public class Ex1 {

    /**
     Viết một chương trình Java để tính diện tích và chu vi của hình chữ nhật.
     chiều dài và rộng nhập vào từ console
     Sử dụng các biến để lưu chiều dài và chiều rộng.
     * */
    public static void main(String[] args) {

        // Khai báo và khởi tạo biến
        double chieuDai = 5.5;
        double chieuRong = 3.0;

        // Tính diện tích và chu vi
        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);

        // Hiển thị kết quả
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);

    }
}
