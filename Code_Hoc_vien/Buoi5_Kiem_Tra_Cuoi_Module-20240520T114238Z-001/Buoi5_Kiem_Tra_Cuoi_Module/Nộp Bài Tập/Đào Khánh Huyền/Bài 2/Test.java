package org.example.Exercises.Test.Bai2;


import javax.swing.*;
import java.util.Scanner;

/*
 Bài 2) Để quản lý hồ sơ học sinh của trường THPT nhà trường cần các thông tin sau:
các thông tin về cá nhân của mỗi học sinh.
Mỗi học sinh có các thông tin sau: Mã học sinh ,Họ tên, tuổi, quê quán, năm sinh, số điện thoại, ngày tháng năm sinh
Yêu cầu 1: Xây dựng Lớp HocSinh để quản lý thông tin của mỗi học sinh.
Yêu cầu 2: Xây dựng các phương thức thêm, hiển thị thông tin của mỗi học sinh.
Yêu cầu 3: Cài đặt chương trình có các chức năng sau:
1) Hiển thị danh sách học sinh
2) Thêm học sinh mới với đầy đủ thông tin.
3) Hiển thị các học sinh có tuổi là 23 và quê ở Đà Nẵng.
4) Nhập vào tên hoặc năm sinh của sinh viên tìm kiếm các học sinh có thuông tin tương tự
	- lưu ý: cho phép tìm kiếm học sinh theo tên không bắt buộc chính xác 100%
	vd: tên học sinh Nguyễn Đắc Kiên khi nhập Kiên,kiên,NGUYỄN ĐẮC KIÊN đều có thể tìm ra
5) Nhập vào mã học sinh và Tên học sinh, nếu trùng sẽ xóa đi học sinh đó, tên bắt buộc tìm kiếm phải đúng 100%,
 vd: tên học sinh Nguyễn Đắc Kiên khi nhập Kiên,kiên,NGUYỄN ĐẮC KIÊN đều không thể tìm ra. Chỉ tìm ra và xóa khi nhập đúng Nguyễn Đắc Kiên
6) Cho phép nhập vào mã học sinh, hiển thị thông tin của sinh viên đó ra màn hình console
và cho phép nhập thông tin mới để chỉnh sửa tất cả thông tin của sinh viên đó, ngoại trừ mã sinh viên

*/
public class Test {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        quanLyHocSinh.setDefaultStudents();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Hiện thị danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Hiển thị thông tin học sinh tuổi là 23 và address là Đà Nẵng");
            System.out.println("4. Tìm kiếm thông tin sinh viên theo tên hoặc tuổi");
            System.out.println("5. Xóa thông tin sinh viên theo mã học sinh và tên học sinh");
            System.out.println("6. Update thông tin học sinh theo mã học sinh");
            System.out.println("7. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                   quanLyHocSinh.hienThiThongTin();
                    break;
                case 2:
                    quanLyHocSinh.themHocSinh();
                    break;
                case 3:
                    quanLyHocSinh.hienThiHocSinhTuoi23QueDaNang();
                    break;
                case 4:
                    quanLyHocSinh.timKiemHocSinhTheoTenHoacTuoi();
                    break;
                    case 5:
                    quanLyHocSinh.xoaHocSinh();
                    break;
                    case 6:
                    quanLyHocSinh.capNhatThongTinHocSinhTheoMaHocSinh();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }



    }
}
