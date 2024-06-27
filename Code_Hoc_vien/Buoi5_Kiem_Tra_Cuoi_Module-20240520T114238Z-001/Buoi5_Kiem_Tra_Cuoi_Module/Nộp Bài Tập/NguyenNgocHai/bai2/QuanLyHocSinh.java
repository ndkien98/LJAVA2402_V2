package com.t3h.NguyenNgocHai.bai2;

import java.util.Scanner;

public class QuanLyHocSinh {
    /**
     *  Yêu cầu 2: Xây dựng các phương thức thêm, hiển thị thông tin của mỗi học sinh.
     */
    private HocSinh[] quanLyHocSinh;
    private int soLuongHocSinh = 0;

    public QuanLyHocSinh(int kichThuoc) {
        this.quanLyHocSinh=new HocSinh[kichThuoc];
        this.soLuongHocSinh=0;
    }
    public void hienThiHocSinh(){
        for(int i=0;i<soLuongHocSinh;i++){
            System.out.println(quanLyHocSinh[i]);
        }
    }

    public void themHocSinh (HocSinh hocSinh) {
        if(soLuongHocSinh >= quanLyHocSinh.length){
            HocSinh[] danhSachMoi = new HocSinh[quanLyHocSinh.length*2];
            for(int i=0;i<quanLyHocSinh.length;i++){
                danhSachMoi[i]=quanLyHocSinh[i];
            }
            quanLyHocSinh=danhSachMoi;
        }
        quanLyHocSinh[soLuongHocSinh++]= hocSinh;
    }

    public void hocSinh23T(){
        for(int i=0;i<soLuongHocSinh;i++){
            if(quanLyHocSinh[i].getTuoi()==23 && quanLyHocSinh[i].getQueQuan().equalsIgnoreCase("Đà Nẵng")){
                System.out.println(quanLyHocSinh[i]);
            }
        }
    }

    public void timHocSinh(String tuKhoa){
        for(int i=0;i<soLuongHocSinh;i++){
            if(quanLyHocSinh[i].getHoTen().toLowerCase().contains(tuKhoa.toLowerCase())|| String.valueOf(quanLyHocSinh[i].getNamSinh()).equals(tuKhoa)) {
                System.out.println(quanLyHocSinh[i]);
            }
        }
    }

    public void xoaHocSinh(String maHocSinh, String hoTen){
        for(int i=0;i<soLuongHocSinh;i++){
            if(quanLyHocSinh[i].getMaHocSinh().equals(maHocSinh)&&quanLyHocSinh[i].getHoTen().equals(hoTen)){
                for(int j=i;j<soLuongHocSinh-1;j++){
                    quanLyHocSinh[j]=quanLyHocSinh[j+1];
                }
                quanLyHocSinh[--soLuongHocSinh]=null;
                break;
            }
        }
    }
    public void chinhSuaHocSinh(String maHocSinh, Scanner sc){
        for(int i=0;i<soLuongHocSinh;i++){
            if(quanLyHocSinh[i].getMaHocSinh().equals(maHocSinh)){
                System.out.println("Nhập tên mới");
                quanLyHocSinh[i].setHoTen(sc.nextLine());
                System.out.println("Nhập tuổi mới");
                quanLyHocSinh[i].setTuoi(sc.nextInt());
                System.out.println("quê quán mới");
                quanLyHocSinh[i].setQueQuan(sc.nextLine());
                System.out.println("năm sinh mới");
                quanLyHocSinh[i].setNamSinh(sc.nextInt());
                System.out.println("số điện thoại mới");
                quanLyHocSinh[i].setSoDienThoai(sc.nextLine());
                System.out.println("ngày tháng năm mới");
                quanLyHocSinh[i].setNgayThangNamSinh(sc.nextLine());
                break;
            }
        }
    }
}
