package com.t3h.buoi7.bai2.c1;

import java.util.Scanner;

public class KhachSan {

    private Phong[] danhSachCacPhong;

    private int tongSoCacPhong;
    private int soLuongPhongDaSuDung;

    public KhachSan() {
        this.tongSoCacPhong = 20;
        this.danhSachCacPhong = new Phong[20];
    }

    public void themPhong(){
        Scanner scanner = new Scanner(System.in);
        boolean loaiPhongKhongHopLe = true;
        Phong phong = null;
        do {
            System.out.println("Chọn loại phòng muốn thêm, Nhập vào các ký tự A,B,C để chọn loại: ");
            String loaiPhong = scanner.nextLine();
            switch (loaiPhong){
                case "A":
                    phong = new PhongA();
                    loaiPhongKhongHopLe=false;
                    break;
                case "B":
                    phong = new PhongB();
                    loaiPhongKhongHopLe=false;
                    break;
                case "C":
                    phong = new PhongC();
                    loaiPhongKhongHopLe=false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai loại phòng, đề nghị nhập lại");
            }
        }while (loaiPhongKhongHopLe);
        System.out.println("Bạn đã nhập loại phòng đúng, thêm thông tin phòng");
        phong.nhapThongTin();
        this.danhSachCacPhong[this.soLuongPhongDaSuDung] = phong;
        this.soLuongPhongDaSuDung++;
        System.out.println("Thông tin phòng đã nhập: ");
        phong.hienThiThongTinPhong();
    }

    public void hienThiDanhSachCacPhong(){
        for (Phong p:this.danhSachCacPhong
             ) {
            if (p != null){
                p.hienThiThongTinPhong();
            }
        }
    }

}
