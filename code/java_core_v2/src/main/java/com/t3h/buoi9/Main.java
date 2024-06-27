package com.t3h.buoi9;

import java.util.Scanner;

/**

    Đóng gòi:
        - đóng gói các thuộc tính có cùng bản chất vào cùng
        một class(đơn vị) giúp rễ ràng triển khai.
        - Sử dụng các phạm vi truy cập (private) để giới hạn
        phạm vi truy cập thay đổi giá trị của thuộc tính trong
        class, giúp cho bảo toàn tính toàn vẹn của dữ liệu
            + nếu không private các thuộc tính, sau này khi viết các class
            thư viện dùng chung rất rễ gây ra lỗi vì có user có thể truy
            cập và sửa đối giá trị thuộc tính gây ra sai khi thực thi
            các method của class đó.
        - vậy để truy cập các thuộc tính private phải tạo ra các
        getter, setter để giới giạn phạm vi truy cập

    ----------------------
    - Biến hằng
        + Biến hằng là biến đặc biệt trong Java. Sẽ chỉ được gán giá trị đúng một lần
        duy nhất. Và không thể thay đổi giá trị của hằng.
    - Final
        + Biến final
            - không thể thay đổi giá trị của biến final, chỉ được gán giá trị một lần
            duy nhất
        + Thuộc tính final
            - bắt buộc phải khởi tạo của thuộc tính trong constructor
            của class.
            - phải khởi tạo giá trị trong constructor vì khi khởi tạo
            đối tượng thì construcotr được chạy đầu tiên
        + Phương thức final
            - không thể override các phương thức final
        + Lớp final
            - không thể cho kế thừa class final
    - Static
        - là một từ khóa được sử dụng để quản lý bộ nhớ trong Java.
        - khi khai báo static cho biến hoặc method hoặc khối lệnh
        trong Java. Thi các thành phần đó sẽ được khởi tạo giá trị trong
        ô nhớ ngay khi chương trình được biên dịch(compile time) ngay
        trong ram

        - biến static
            + biến statis sẽ chỉ được truy cập thông qua Class,
            không thể truy vập thông qua đối tượng
            => biến static không thuộc về đối tượng
            mà thuộc về lớp quản lý
            - là biến dùng chung cho tất cả các object
            được tạo ra từ class đó
            => nếu thay đổi giá trị của biến static
            => thì giá trị đó cũng sẽ thay đổi với mọi
            đối tượng

        - phương thức static
            + Thuộc về lớp chữ không thuộc về đối tượng
            + Có thể được gọi tới thông qua class mà khồn cần khởi tạo object
            + Chỉ có thể truy cập phương thức static,
                không thể truy cập phương thức non-static
            + không thể sử dụng từ khóa this, supper
            + không thể ghi đè phương thức static
                vì: ghi đè phương thức được sảy ra trong môi trường runtime
                nhưng phương thức static được khởi tạo ngay tại quá trình
                compile time => tại compile time không thể xác định thật sự
                object đó là object nào => không thể ghi đè phương thức
                static

        - khối statis
            + được sử dụng để khởi tạo giá trị cho các biến static
            + được thực thi trước hàm main
            + một class có thể có nhiều khối static
 */
public class Main {

    static {
        System.out.println("Đây là khối static");
    }

    public static void main(String[] args) {

        Employee.tenCongTy="T3h";
        Employee nhanVien1 = new Employee();
        nhanVien1.setHoTen("Tuấn");
        Employee nhanVien2 = new Employee();
        nhanVien2.setHoTen("Huy");
        Employee nhanVien3 = new Employee();
        nhanVien3.setHoTen("Thắng");

        nhanVien1.hienThiTenCongTy();
        nhanVien2.hienThiTenCongTy();
        nhanVien3.hienThiTenCongTy();
        Employee.tenCongTy="FPT Software";
        nhanVien1.hienThiTenCongTy();
        nhanVien2.hienThiTenCongTy();
        nhanVien3.hienThiTenCongTy();


        // Bài toán tính diện tích hình chữ nhật
        float chieuDai = new Scanner(System.in).nextFloat();
        float chieuRong = new Scanner(System.in).nextFloat();
        float dienTich = chieuDai*chieuRong;
        System.out.println(dienTich);

//        float chieuDai = new Scanner(System.in).nextFloat();
//        float chieuRong = new Scanner(System.in).nextFloat();
//        float dienTich = chieuDai*chieuRong;
//        System.out.println(dienTich);
//
//        float chieuDai = new Scanner(System.in).nextFloat();
//        float chieuRong = new Scanner(System.in).nextFloat();
//        float dienTich = chieuDai*chieuRong;
//        System.out.println(dienTich);
        HinhChuNhat[] danhSach = new HinhChuNhat[10];

        final float PI= 3.14F; // Khai báo hằng
//        PI = 10;

    }
}
