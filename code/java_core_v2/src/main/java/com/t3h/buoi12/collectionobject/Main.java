package com.t3h.buoi12.collectionobject;

import com.t3h.buoi8.baitap.bai1.QuanLyTaiLieu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        /**
         Tạo ra một mảng có 3 person
         tạo ra menu chức năng:
         1) Thêm mới person
         2) Xóa person theo tên
         3) Sắp xếp person từ bé đến lớn theo id
         4) đảm bảo không có person nào trùng tên và id
         */
        boolean tiepTuc=true;
        PersonManager personManager = new PersonManager();
        personManager.khoiTaoMacDinh();
        while (tiepTuc){
            System.out.println("Chọn chức năng: ");
            System.out.println("1: Thêm mới person");
            System.out.println("2: Xóa person theo tên");
            System.out.println("3: Sắp xếp person từ bé đến lớn theo id");
            System.out.println("4: Hien thi danh sach");
            System.out.println("5: Thoát");
            int action = new Scanner(System.in).nextInt();
            switch (action) {
                case 1:
                    personManager.themMoiPerson();
                    break;
                case 2:
                    personManager.xoaTheoTen();
                    break;
                case 3:
                    personManager.sapXepTheoId();
                    break;
                case 4:
                    personManager.hienThiDanhSach(null);
                    break;
                case 5:
                    tiepTuc=false;
            }
        }
    }


}
