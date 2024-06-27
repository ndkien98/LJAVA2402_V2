package org.example.Exercises.Test.Bai2;

import java.util.Scanner;

public class QuanLyHocSinh {
    private final HocSinh[] listStudents;
    private int currentStudent;

    public QuanLyHocSinh() {
        this.listStudents = new HocSinh[10000];
        this.currentStudent = 0;
    }

    public void setDefaultStudents(){
        HocSinh hocsinh1 = new HocSinh("HS01", "Đào Khánh Huyền", 21, "Nam Định", 2003, "0123456789", "23/08/2003");
        HocSinh hocsinh2 = new HocSinh("HS02", "Nguyễn T.Ánh Bích", 21, "Ninh Bình", 2003, "0987654321", "30/03/2003");
        HocSinh hocsinh3 = new HocSinh("HS03", "Huỳnh Hà Mai Anh", 21, "Hà Nội", 2003, "0456123987", "28/02/2003");
        this.listStudents[this.currentStudent] = hocsinh1;
        this.currentStudent++;
        this.listStudents[this.currentStudent] = hocsinh2;
        this.currentStudent++;
        this.listStudents[this.currentStudent] = hocsinh3;
        this.currentStudent++;

    }

    Scanner scanner = new Scanner(System.in);
    public void themHocSinh(){
        System.out.print("Nhập mã học sinh: ");
        String maHocSinh = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        String queQuan = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        int namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String soDienThoai = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh: ");
        String birthday = scanner.nextLine();

        HocSinh hocSinh = new HocSinh(maHocSinh, hoTen, tuoi, queQuan, namSinh, soDienThoai, birthday);
        this.listStudents[this.currentStudent] = hocSinh;
        this.currentStudent++;
        System.out.println("Đã thêm học sinh thành công.");
    }

        public void hienThiThongTin(){
            if (currentStudent == 0) {
                System.out.println("Không có học sinh nào trong danh sách.");
                return;
            }
            for (int i = 0; i < currentStudent; i++) {
                listStudents[i].hienThiThongTin();
                System.out.println();
            }

        }

    public void hienThiHocSinhTuoi23QueDaNang() {
        boolean found = false;
        String queQuan = "Đà Nẵng";
        for (int i = 0; i < currentStudent; i++) {
            if (listStudents[i].getAge() == 23 && queQuan.equalsIgnoreCase(listStudents[i].getAddress())) {
                listStudents[i].hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có học sinh nào có tuổi là 23 và quê ở Đà Nẵng.");
        }
    }

    public void timKiemHocSinhTheoTenHoacTuoi(){
        System.out.print("Nhập tên hoặc năm sinh để tìm kiếm: ");
        String input = scanner.nextLine();
        int namSinh = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < currentStudent; i++) {
            if (listStudents[i].getTenHocSinh().equalsIgnoreCase(input) || (listStudents[i].getNamSinh() == namSinh)){
                listStudents[i].hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có học sinh nào khớp với thông tin tìm kiếm.");
        }
    }
    public void xoaHocSinh() {
        System.out.print("Nhập mã học sinh: ");
        String maHocSinh = scanner.nextLine();
        System.out.print("Nhập tên học sinh: ");
        String hoTen = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < currentStudent; i++) {
            if (listStudents[i].getMaHocSinh().equals(maHocSinh) && listStudents[i].getTenHocSinh().equals(hoTen)) {
                for (int j = i; j < currentStudent - 1; j++) {
                    listStudents[j] = listStudents[j + 1];
                }
                listStudents[--currentStudent] = null;
                found = true;
                System.out.println("Đã xóa học sinh thành công.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với mã và tên đã nhập.");
        }
    }

    public void capNhatThongTinHocSinhTheoMaHocSinh() {
        System.out.print("Nhập mã học sinh: ");
        String maHocSinh = scanner.nextLine();

        for (int i = 0; i < currentStudent; i++) {
            if (listStudents[i].getMaHocSinh().equals(maHocSinh)) {
                System.out.print("Nhập họ tên mới: ");
                String ten = scanner.nextLine();
                listStudents[i].setTenHocSinh(ten);
                System.out.print("Nhập tuổi mới: ");
                int age = scanner.nextInt();
                listStudents[i].setAge(age);
                scanner.nextLine();
                System.out.print("Nhập quê quán mới: ");
                String address = scanner.nextLine();
                listStudents[i].setAddress(address);
                System.out.print("Nhập năm sinh mới: ");
                int namSinh = scanner.nextInt();
                listStudents[i].setNamSinh(namSinh);
                scanner.nextLine();
                System.out.print("Nhập số điện thoại mới: ");
                String phone = scanner.nextLine();
                listStudents[i].setPhoneNumber(phone);
                System.out.print("Nhập ngày tháng năm sinh mới: ");
                String birthday = scanner.nextLine();
                listStudents[i].setBirthday(birthday);

                System.out.println("Đã cập nhật thông tin học sinh thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với mã đã nhập.");
    }


}
