package com.javaweb.kiemtramodule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "No";
        while (!exit.toLowerCase().equals("yes")){
            System.out.printf("Nhập 1 Để Bạn THêm Động Vật%n" +
                    "Nhập 2 Để Sửa Thông Tin ĐỘng Vật Theo Id%n" +
                    "Nhập 3 Để Tìm Kiếm Động Vật Theo Tên%n" +
                    "Nhập 4 Để THêm Loại Máy%n" +
                    "Nhập 5 Để Sửa Thông Tin Loại Máy Theo Id%n" +
                    "Nhập 6 Để Tìm Kiếm Loại Máy Theo Tên%n");
            try {
                int type = scanner.nextInt();
                luaChon(type);
            }catch (Exception e){
                System.out.printf("Main"+e.getMessage());
            }
            System.out.printf("Bạn Muốn Thoát Chương Trình:");
            scanner.nextLine();
            exit = scanner.nextLine();
        }

    }
    public static void luaChon(int type) throws CustomException{
        QuanLyDongVat quanLyDongVat = new QuanLyDongVat(10);
        QuanLyLoaiMay quanLyLoaiMay = new QuanLyLoaiMay(5);
        switch (type){
            case 1:
                quanLyDongVat.themLoaiDongVat();
                break;
            case 2:
                quanLyDongVat.suaThongTin();
                break;
            case 3:
                quanLyDongVat.timThongTinTheoTen();
                break;
            case 4:
                quanLyLoaiMay.themLoaiMay();
                break;
            case 5:
                quanLyLoaiMay.suaThongTin();
                break;
            case 6:
                quanLyLoaiMay.timThongTinTheoTen();
                break;
            default:
                throw new CustomException("Nhập Từ 1 Đến 6");
        }
    }
}
