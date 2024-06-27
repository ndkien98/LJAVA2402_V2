package com.t3h.NguyenNgocHai.bai2;

import java.util.Scanner;

public class Main {
 /**   Yêu cầu 3: Cài đặt chương trình có các chức năng sau:
            1) Hiển thị danh sách học sinh
2) Thêm học sinh mới với đầy đủ thông tin.
3) Hiển thị các học sinh có tuổi là 23 và quê ở Đà Nẵng.
4) Nhập vào tên hoặc năm sinh của sinh viên tìm kiếm các học sinh có thuông tin tương tự
	- lưu ý: cho phép tìm kiếm học sinh theo tên không bắt buộc chính xác 100%
    vd: tên học sinh Nguyễn Đắc Kiên khi nhập Kiên,kiên,NGUYỄN ĐẮC KIÊN đều có thể tìm ra
5) Nhập vào mã học sinh và Tên học sinh, nếu trùng sẽ xóa đi học sinh đó, tên bắt buộc tìm kiếm phải đúng 100%, vd: tên học sinh Nguyễn Đắc Kiên khi nhập Kiên,kiên,NGUYỄN ĐẮC KIÊN đều không thể tìm ra. Chỉ tìm ra và xóa khi nhập đúng Nguyễn Đắc Kiên
6) Cho phép nhập vào mã học sinh, hiển thị thông tin của sinh viên đó ra màn hình console
    và cho phép nhập thông tin mới để chỉnh sửa tất cả thông tin của sinh viên đó, ngoại trừ mã sinh viên
    */
 public static void main(String[] args) {
     QuanLyHocSinh qlhs=new QuanLyHocSinh(10);
     Scanner sc=new Scanner(System.in);

     while(true){
         System.out.println("1.Hiển thị danh sách học sinh:");
         System.out.println("2.Thêm học sinh");
         System.out.println("3.Hiển thị các học sinh tuổi 23 quê Đà Nẵng");
         System.out.println("4.Tìm học sinh");
         System.out.println("5.Xóa học sinh");
         System.out.println("6.Chỉnh sửa");
         System.out.println("7.Thoát");
         System.out.println("Chọn chức năng:");
         int cho=sc.nextInt();
         switch (cho){
             case 1:
                 qlhs.hienThiHocSinh();
                 break;
             case 2:
                 System.out.println("Mã học sinh:");
                 String maHocSinh=sc.nextLine();
                 System.out.println("Họ tên:");
                 String hoTen=sc.nextLine();
                 System.out.println("Tuổi:");
                 int tuoi=sc.nextInt();
                 sc.nextLine();
                 System.out.println("Quê quán:");
                 String queQuan=sc.nextLine();
                 System.out.println("Năm sinh:");
                 int namSinh=sc.nextInt();
                 sc.nextLine();
                 System.out.println("Số điẹn thoại:");
                 String soDienThoai=sc.nextLine();
                 System.out.println("Ngày tháng năm sinh:");
                 String ngayThangNamSinh=sc.nextLine();
                 HocSinh hoacSinh= new HocSinh(maHocSinh,hoTen,tuoi,queQuan,namSinh,soDienThoai,ngayThangNamSinh);
                 qlhs.themHocSinh(hoacSinh);
                 break;
             case 3:
                 qlhs.hocSinh23T();
                 break;
             case 4 :
                 System.out.println("Nhập tên hoặc năm sinh để tìm kiếm");
                 String tuKhoa= sc.nextLine();
                 qlhs.timHocSinh(tuKhoa);
                 break;
             case 5 :
                 System.out.println("Nhập mã học sinh:");
                 String maHS= sc.nextLine();
                 System.out.println("Nhập tên học sinh");
                 String tenHS= sc.nextLine();
                 qlhs.xoaHocSinh(maHS,tenHS);
                 break;
             case 6:
                 System.out.println("Mã học sinh cần chỉnh sửa");
                 String maHSSua=sc.nextLine();
                 qlhs.chinhSuaHocSinh(maHSSua,sc);
                 break;
             case 7:
                 sc.close();
                 System.exit(0);
             default:
                 System.out.println("Mời nhập lại.");
                 break;
         }

     }
 }
}
