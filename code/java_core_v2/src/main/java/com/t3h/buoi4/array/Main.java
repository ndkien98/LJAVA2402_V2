package com.t3h.buoi4.array;


import com.t3h.buoi4.objectclass.Sach;

import java.util.Scanner;

/**
    Array
    - định nghĩa
        + mảng là một cấu trúc lưu trữ dữ liệu
        + các dữ liệu trong mảng có cùng kiểu dữ liệu với nhau
        + các phần tử trong mảng được sắp xếp liền kề nhau
    - cách khai báo mảng
        + kiểu_dữ_liệu [] tên_mảng = new kiểu_dữ_liệu [kích_thước_mảng];

    - các đặc điểm
        + tất cả các phần tử của mảng phải có cùng một kiểu dữ liệu
        + số lượng ô nhớ được khai báo trong mảng(kích thước mảng) là cố định không thể thay đổi
        + chỉ truy cập được các phần tử của mảng thông qua index
        + index: thứ tự các ô nhớ của mảng, index được bắt đầu từ 0 -> lenght -1
            vd: int[] arrayN = new int[10];
                -> index bắt đầu từ 0 -> 9
    - các hàm, thuộc tính được cung cấp
        + thuộc tính lenght: cung cấp số lượng phần tử của mảng
        + hàm clone: sao chép mảng sang một mảng mới
    - cách truy cập vào phần tử của mảng
    - cách duyệt mảng
        + sử dụng các cấu trúc lặp để duyệt mảng
            for, forEch, while...
    - bài tập
         Bài 1: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên
         1)	Hiển trị giá trị trung bình của dãy
         2)	Hiển thị phần tử có giá trị lớn nhất
         3)	Sắp xếp mảng theo thứ tự giảm dần
        4)	Sắp xếp mảng theo thứ tự tăng dần
         5) In ra các phần tử xuất hiện 2 lần của mảng
         6)	Tìm kiếm phần tử lớn thứ 3 trong mảng nếu có
         7)	Cho phép người dùng nhập vào một số. Tìm kiếm số đó trong mảng

 */

public class Main {
    public static void main(String[] args) {
        // thực hiện khai báo mảng với tên arrayN lưu trữ các số nguyên, mảng có số lượng ô nhớ là 10, các giá trị trong mảng đang có giá trị mặc định
        int[] arrayN = new int[5];

        // Khai báo mảng với danh sách phần từ cố định
        int[] arrayN2 = {1,2,5,7,10};

        System.out.println("arrayN: " + arrayN.length);
        System.out.println("arrayN: " + arrayN2.length);

        int[] arrayClone = arrayN.clone();
        System.out.println(arrayClone.length);
        System.out.println("----------------");
        // cách lấy ra phần từ 5 từ index 2
        System.out.println(arrayN2[2]);
        // cách gán giá trị cho ô nhớ của mảng
        arrayN[2] = 5;
        System.out.println(arrayN[2]);
        System.out.println("Sử dụng forEch duyệt mảng");
        for (int data:arrayN2
             ) {
            System.out.println("data arrayN2: " + data);
        }
        System.out.println("Sử dụng for để nhập dữ liệu vào mảng ");
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("Nhập dữ liệu của ô nhớ số: " + (i + 1));
            arrayN[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        int index = 0;
        while (index < arrayN.length){
            System.out.println("data phần tử số " + (index + 1) + " : " + arrayN[index]);
            index++;
        }
        // khai báo mảng 10 phần tử sách
        Sach[] arraySach = new Sach[10];
    }
}
