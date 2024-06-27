package com.javaweb.bai2;

import java.util.Scanner;

public class Bai2 {
    private static HocSinh hocSinh;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Số Lượng Học Sinh Trong Lớp:");
        int n = sc.nextInt();
        //Them Danh Sach Hoc Sinh
        System.out.printf("Nhập Thông Tin Danh Sách Học Sinh:%n");
        HocSinh[] arrayHocSinh = new HocSinh[n];
        for (int i = 0; i < arrayHocSinh.length; i++) {
            System.out.printf("Nhập Thông Tin Hoc Sinh Số " + (i + 1) + ":%n");
            nhapThongTin();
            arrayHocSinh[i] = hocSinh;
        }
        //Hien Thi Danh Sach Hoc Sinh
        hienThiDanhSach(arrayHocSinh);
        //Them Hoc Sinh Moi
        arrayHocSinh = themHocSinh(arrayHocSinh,1);
        //Hien Thi Danh Sach Hoc Sinh Moi
        hienThiDanhSach(arrayHocSinh);
        //kiem Tra Va Hien Thi Cac Hoc Sinh 23 Tuoi Va Que Da Nang
        System.out.printf("Các Học Sinh Có Tuổi 23 Và Quê Đà Nẵng:%n");
        kiemTraDieuKien(arrayHocSinh,23,"Đà Nẵng");
        //Nhap Ten De Tìm Kiem Thong Tin
        System.out.printf("Nhập Tên Bạn Muốn Tìm Kiếm:");
        sc.nextLine();
        String ten = sc.nextLine();
        timKiemTheoTen(arrayHocSinh,ten);
        //Nhap Nam Sinh De TIm Kiem Thong Tin
        System.out.printf("%nNhập Năm Sinh Bạn Muốn Tìm Kiếm:");
        int namSinh = sc.nextInt();
        timKiemTheoNamSinh(arrayHocSinh,namSinh);
        //Nhap Ma Hoc Sinh Va Ho Ten
        System.out.printf("%nNhập Mã Học Sinh Và Họ Tên Bạn Muốn Tìm Kiếm:");
        System.out.printf("%nNhập Mã Học Sinh:");
        sc.nextLine();
        String maHocSinh = sc.nextLine();
        System.out.printf("Nhập Họ Tên:");
        String hoTen = sc.nextLine();
        //Xoa Hoc Sinh
        arrayHocSinh = xoaHocSinh(arrayHocSinh,maHocSinh,hoTen);
        hienThiDanhSach(arrayHocSinh);
        //Nhap Ma Hoc Sinh Va Sua Thong Tin
        System.out.printf("%nNhập Mã Học Sinh:");
        maHocSinh = sc.nextLine();
        timKiemTheoMaHocSinh(arrayHocSinh,maHocSinh);
        //Hien Thi Danh Sach Hoc Sinh Moi
        hienThiDanhSach(arrayHocSinh);
    }

    private static void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Mã Học Sinh:");
        String maHocSinh = sc.nextLine();
        System.out.printf("Nhập Ho Ten:");
        String hoTen = sc.nextLine();
        System.out.printf("Nhập Tuoi:");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhập Que Quan:");
        String queQuan = sc.nextLine();
        System.out.printf("Nhập Năm Sinh:");
        int namSinh = sc.nextInt();
        System.out.printf("Nhập Số Điện Thoại:");
        long soDienThoai = sc.nextLong();
        sc.nextLine();
        System.out.printf("Nhập Ngày Tháng Năm Sinh:");
        String ngayThangNam = sc.nextLine();
        hocSinh = new HocSinh(maHocSinh,hoTen,tuoi,queQuan,namSinh,soDienThoai,ngayThangNam);
    }
    private static void hienThiDanhSach(HocSinh[] arrayHocSinh){
        System.out.printf("Thông Tin Danh Sách Học Sinh:%n");
        for (int i = 0; i < arrayHocSinh.length; i++) {
            System.out.printf(arrayHocSinh[i].toString()+ "%n");
        }
    }
    private static HocSinh[] themHocSinh(HocSinh[] arrayHocSinh,int number){
        HocSinh[] hocSinhNew = new HocSinh[arrayHocSinh.length + number];
        for (int i = 0; i < hocSinhNew.length; i++) {
            if (i < arrayHocSinh.length) {
                hocSinhNew[i] = arrayHocSinh[i];
            }else {
                System.out.printf("Nhập Thêm Thông Tin Hoc Sinh Số " + (i + 1) + ":%n");
                nhapThongTin();
                hocSinhNew[i] = hocSinh;
            }
        }
        return hocSinhNew;
    }
    private static void kiemTraDieuKien(HocSinh[] arrayHocSinh,int _tuoi , String _queQuan ){
        int count = 0;
        for (int i = 0; i < arrayHocSinh.length; i++) {
            if (arrayHocSinh[i].getTuoi() == _tuoi && arrayHocSinh[i].getQueQuan().equals(_queQuan)) {
                System.out.printf("Thông Tin Học Sinh Số " + (i + 1) + ":%n");
                System.out.printf(arrayHocSinh[i].toString()+ "%n");
                count++;
            }
        }
        if(count == 0){
            System.out.printf("Không Có Học Sinh Có Tuổi " + _tuoi + " Và Quê Quán Ở " + _queQuan +"%n");
        }
    }
    private static void timKiemTheoTen(HocSinh[] arrayHocSinh, String _ten){
        int count = 0;
        for (int i = 0 ; i < arrayHocSinh.length ; i++){
            String[] split = arrayHocSinh[i].getHoTen().split(" ");
            if (split[split.length -1].toLowerCase().contains(_ten.toLowerCase())) {
                System.out.printf("Thông Tin Học Sinh Số " + (i + 1) + ":%n");
                System.out.printf(arrayHocSinh[i].toString()+ "%n");
                count++;
            }
        }
        if(count == 0){
            System.out.printf("Không Có Học Sinh Có Tên " + _ten +"%n");
        }
    }
    private static void timKiemTheoNamSinh(HocSinh[] arrayHocSinh, int _namSinh){
        int count = 0;
        for (int i = 0 ; i < arrayHocSinh.length ; i++){
            if (arrayHocSinh[i].getNamSinh() == _namSinh) {
                System.out.printf("Thông Tin Học Sinh Số " + (i + 1) + ":%n");
                System.out.printf(arrayHocSinh[i].toString()+ "%n");
                count++;
            }
        }
        if(count == 0){
            System.out.printf("Không Có Học Sinh Có Năm Sinh " + _namSinh +"%n");
        }
    }
    private static int dieuKienMaVaTen(HocSinh[] arrayHocSinh,String _maHocSinh, String _hoTen){
        int count = 0;
        for (int i = 0; i < arrayHocSinh.length; i++) {
            if (arrayHocSinh[i].getMaHocSinh().equals(_maHocSinh) && arrayHocSinh[i].getHoTen().equals(_hoTen)) {
                System.out.printf("Xóa Thông Tin Học Sinh Số " + (i + 1) + ":%n");
                System.out.printf(arrayHocSinh[i].toString()+ "%n");
                count++;
            }
        }
        if(count == 0){
            System.out.printf("Không Có Học Sinh Có Mã Hoc Sinh " + _maHocSinh + " Và Họ Tên " + _hoTen+"%n");
        }
        return count;
    }
    private static HocSinh[] xoaHocSinh(HocSinh[] arrayHocSinh,String _maHocSinh, String _hoTen){
        HocSinh[] hocSinhNew = new HocSinh[arrayHocSinh.length - dieuKienMaVaTen(arrayHocSinh,_maHocSinh, _hoTen)];
        int count = 0;
        for (int i = 0 ; i < arrayHocSinh.length; i++){
            if (arrayHocSinh[i].getMaHocSinh().equals(_maHocSinh) && arrayHocSinh[i].getHoTen().equals(_hoTen)) {
                System.out.printf("Đã Xóa Học Sinh Số " + (i+1)+"%n");
            }else {
                hocSinhNew[count] = arrayHocSinh[i];
                count++;
            }
        }
        return hocSinhNew;
    }
    private static void timKiemTheoMaHocSinh(HocSinh[] arrayHocSinh, String _maHocSinh){
        int count = 0;
        for (int i = 0 ; i < arrayHocSinh.length ; i++){
            if (arrayHocSinh[i].getMaHocSinh().equals(_maHocSinh)) {
                System.out.printf("Thông Tin Học Sinh Số " + (i + 1) + ":%n");
                System.out.printf(arrayHocSinh[i].toString()+ "%n");
                System.out.printf("Sửa Thông Tin Học Sinh Số "+ (i + 1) + ":%n");
                suaThongTin(arrayHocSinh[i]);
                System.out.printf("Thông Tin Học Sinh Số " + (i + 1) + " Đã Sửa:%n");
                System.out.printf(arrayHocSinh[i].toString()+ "%n");
                count++;
            }
        }
        if(count == 0){
            System.out.printf("Không Có Học Sinh Có Mã Học Sinh " + _maHocSinh +"%n" );
        }
    }
    private static void suaThongTin(HocSinh hocSinh){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Ho Ten:");
        String hoTen = sc.nextLine();
        hocSinh.setHoTen(hoTen);
        System.out.printf("Nhập Tuoi:");
        int tuoi = sc.nextInt();
        hocSinh.setTuoi(tuoi);
        sc.nextLine();
        System.out.printf("Nhập Que Quan:");
        String queQuan = sc.nextLine();
        hocSinh.setQueQuan(queQuan);
        System.out.printf("Nhập Năm Sinh:");
        int namSinh = sc.nextInt();
        hocSinh.setNamSinh(namSinh);
        System.out.printf("Nhập Số Điện Thoại:");
        long soDienThoai = sc.nextLong();
        hocSinh.setSoDienThoai(soDienThoai);
        sc.nextLine();
        System.out.printf("Nhập Ngày Tháng Năm Sinh:");
        String ngayThangNam = sc.nextLine();
        hocSinh.setNgayThangNamSinh(ngayThangNam);
    }
}
