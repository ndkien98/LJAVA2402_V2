package com.t3h.buoi2.codesilde.toantu;

public class ToanTuTangGiam {
    public static void main(String[] args) {
        int x = 5;
        // Toán tử tăng ++
        x++; // Tăng giá trị của x lên 1 => chạy hết dòng này giá trị x=6
        System.out.println("Giá trị của x sau toán tử tăng là: " + x);
        // Toán tử giảm --
        x--; // Giảm giá trị của x đi 1 => chạy hết dòng này giá trị x=5
        System.out.println("Giá trị của x sau toán tử giảm là: " + x);
        // Toán tử tăng và giảm có thể sử dụng trực tiếp trong biểu thức
        // Khi toán tử nằm phía trước sẽ tăng giá trị trực tiếp tại dòng lệnh đó trước
        int y = ++x; // Tăng giá trị của x lên 1 và gán vào y => x có giá trị =6 trước rồi gán cho y
        System.out.println("Giá trị của x: " + x); // x = 6
        System.out.println("Giá trị của y: " + y); // y = 6
        int z = x--; // Gán giá trị của x vào z và giảm giá trị của x đi 1
        System.out.println("Giá trị của x: " + x); // x = 5
        System.out.println("Giá trị của z: " + z); // z = 6
    }
}
