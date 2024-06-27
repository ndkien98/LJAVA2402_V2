package com.javaweb.kiemtramodule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLyDongVat {
    int soDongVatHienTai ;
    Animal[] animals ;
    int tongSoDongVat;


    public QuanLyDongVat(int tongSoDongVat){
        this.tongSoDongVat = tongSoDongVat;
        this.animals = new Animal[tongSoDongVat];
        this.soDongVatHienTai = 0;
    }
    public void themLoaiDongVat() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Động Vật Bạn Muốn Thêm:%n");
        System.out.printf("Nhập 1 Để Thêm Chó, 2 Để Thêm Chim, 3 Để Thêm Cá:");
        try {
            int count = sc.nextInt();
            luaChon(count);
        }catch (InputMismatchException e){
            System.out.printf("QuanLyDongVat:"+e.getMessage());
        } catch (CustomException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void luaChon(int type) throws CustomException {
        Animal animal = null;
        switch (type){
            case 1:
                animal = new Dog();
                nhapId(animal);
                ((Dog)animal).nhapThongTin();
                ((Dog)animal).hienThiThongTin();
                animals[soDongVatHienTai] = animal;
                soDongVatHienTai++;
                break;
            case 2:
                animal = new Chim();
                nhapId(animal);
                ((Chim)animal).nhapThongTin();
                ((Chim)animal).hienThiThongTin();
                animals[soDongVatHienTai] = animal;
                soDongVatHienTai++;
                break;
            case 3:
                animal = new Ca();
                nhapId(animal);
                ((Ca)animal).nhapThongTin();
                ((Ca)animal).hienThiThongTin();
                animals[this.soDongVatHienTai] = animal;
                this.soDongVatHienTai++;
                break;
            default:
                throw new CustomException("Nhập từ 1 đến 3:");
        }
    }
    public void suaThongTin(){
        System.out.printf("Nhập Id Bạn Muốn Sửa Thông Tin:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        if(soDongVatHienTai > 0){
            for (int i = 0 ; i < soDongVatHienTai ; i ++){
                if(animals[i].id.equals(id)){
                    if(animals[i] instanceof Dog){
                        ((Dog)animals[i]).nhapThongTin();
                        ((Dog)animals[i]).hienThiThongTin();
                    }
                    if(animals[i] instanceof Chim){
                        ((Chim)animals[i]).nhapThongTin();
                        ((Chim)animals[i]).hienThiThongTin();
                    }
                    if(animals[i] instanceof Ca){
                        ((Ca)animals[i]).nhapThongTin();
                        ((Ca)animals[i]).hienThiThongTin();
                    }
                }else {
                    System.out.printf("Id Bạn Muốn Sửa Không Có:");
                }
            }
        }else {
            System.out.printf("Id Bạn Muốn Sửa Không Có:");
        }

    }
    public void timThongTinTheoTen(){
        System.out.printf("Nhập Tên Bạn Muốn Tìm Kiếm:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(soDongVatHienTai > 0){
            for (int i = 0 ; i < soDongVatHienTai ; i ++){
                if(animals[i].ten.toLowerCase().contains(name)){
                    if (animals[i] instanceof Dog){
                        ((Dog) animals[i]).hienThiThongTin();
                    }
                    if (animals[i] instanceof Chim){
                        ((Chim) animals[i]).hienThiThongTin();
                    }
                    if (animals[i] instanceof Ca){
                        ((Ca) animals[i]).hienThiThongTin();
                    }
                }else {
                    System.out.printf("Không Có Tên Cần TÌm");
                }
            }
        }else {
            System.out.printf("Không Có Tên Cần TÌm");
        }

    }
    public void nhapId(Animal animal){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Id:");
        String id = sc.nextLine();
        while (kiemTraId(id)){
            System.out.printf("Id Đã Trùng.Vui Lòng Nhập Lại:");
            id = sc.nextLine();
        }
        animal.setId(id);
    }
    public boolean kiemTraId( String id) {
        for (int i = 0; i < soDongVatHienTai; i++) {
            if(animals[i].id.equals(id)){
                return true;
            }
        }
        return false;
    }
}
