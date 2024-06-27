package com.t3h.buoi4;

import com.t3h.buoi4.objectclass.Person;

import java.util.Scanner;

public class Main {

    /**

     * Class:
        - định nghĩa:
            là một khuôn mẫu để tạo ra các đối tượng
            bằng constructor
        - các thành phần của class
            - tên class
                định dạnh của class
            - các thuộc tính(attribute, field)
                lưu trữ các dữ liệu của đối tượng được tạo ra
            - các method
                + đó vai trò là các hành động mà đối tượng có
                thể thực hiện
                + các method sẽ hoạt động phụ thuộc vào giá trị
                    của thuộc tính
            - constructor
                + khởi tạo ra các đối tượng trong heap memory
            - phạm vi truy cập(access modify)
                + sử dụng để giới hạn phạm vi truy
                cập hoặc sửa đối tới các thành viên
                trong class
                + private:
                    chỉ có thể truy cập hoặc update
                    giá trị của thanh viên đó trong nội
                    bộ class.
                    => để truy cập vào các attribute private
                    sẽ phải sinh ra các method getter, setter,
                    giúp hỗ trợ kiểm soát truy cập hoặc thay đổi
                    giá trị của attribute
                + public
                    có thể truy cập hoặc update giá trị
                    của thành viên đó ở mọi file trong
                    project
        * Đối tượng(Object)
            là một thể hiện được tạo ra từ class, khi tạo ra một đối tượng
            là ta đang tạo ra một phiên bản của lớp đó với các thuộc tính, hành vi
            cụ thể
            => khi đó
                - các thuộc tính của class => thành các trạng thái của đối tượng
                và có giá trị khác nhau với mối đối tượng
                - các method của class sẽ thành các hành vi mà đối tượng có thể thực
                thi, phụ thuộc vào giá trị các trạng thái của đối tượng
     * Mối quan hệ của Class và Object
        - Một class có thể tạo ra rất nhiều object từ class đó.
        - Một object được coi như một thể hiện của class

     Bài tập
     Bài 1
     Một thư viện cần quản lý các Sách
     Mỗi cuốn Sách gồm có các thuộc tính sau:
         Mã sách (Mã tài liệu là duy nhất),
         Tên nhà xuất bản,
         số bản phát hành.
         tên tác giả
         số trang.
         Ngày phát hành.: long
         Số phát hành,
         tháng phát hành.: long
     Yêu cầu 1:
        Xây dựng lớp Sách để quản lý tài liệu cho thư viện một cách hiệu quả.
     Yêu cầu 2:
        Xây dựng chương trình cho phép người dùng nhập vào thông tin hai cuốn sách và hiển thị ra thông tin của các cuốn sách sau khi nhập

     - Tạo class sach
        + các thuộc tính, bắt buộc để private
        + tạo ra hàm nhập thông tin
        + tạo ra hàm hiển thị thông tin
     - Class Main
        - khai báo đối tượng sách
        - gọi tới hàm nhập thông tin
        - gọi tới hàm hiển thị thông tin


     */
    public static void main(String[] args) {

        // Tạo ra đối tượng(object) với tên minh từ class Person
        Person minh = new Person();
//        Person minh =null;
        // gán giá trị cho thuộc tính của object
        minh.name="Minh";
        minh.height="1m8";
        minh.weight="75kg";
        minh.setSalary(0l);
        // gọi tới các method của object
        minh.goBy();

        Person hinh = new Person();
        hinh.name="Hinh";
        hinh.height="1m7";
        hinh.weight="67kg";
        hinh.goBy();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = scanner.nextInt();

        System.out.println(age + name);


    }
}
