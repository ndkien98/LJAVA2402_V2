package com.t3h.buoi4.btvn.demo.bai2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Sach {

    private String maSach;
    private String tenNhaXuatBan;
    private  String soBanPhatHanh;
    private  String tenTacGia;
    private  long soTrang;
    private  int ngayPhatHanh;
    private long soPhatHanh;
    private  int thangPhatHanh;

    public Sach() {
    }

    public Sach(String maSach, String tenNhaXuatBan, String soBanPhatHanh, String tenTacGia, long soTrang, int ngayPhatHanh, long soPhatHanh, int thangPhatHanh) {
        this.maSach = maSach;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.ngayPhatHanh = ngayPhatHanh;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(String soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public long getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(long soTrang) {
        this.soTrang = soTrang;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public long getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(long soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
        this.maSach = scanner.nextLine();
        System.out.println("Nhập vào tên nhà xuất bản: ");
        this.tenNhaXuatBan = scanner.nextLine();
        System.out.println("Nhập vào số phát hành: ");
        this.soBanPhatHanh = scanner.nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.tenTacGia = scanner.nextLine();
        System.out.println("Nhập số trang: ");
        this.soTrang = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày phát hành: ");
        this.ngayPhatHanh = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Nhập số phát hành: ");
        this.soPhatHanh = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Nhập tháng phát hành: ");
        this.thangPhatHanh = scanner.nextInt();
    }

    public void hienThiThongTin(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return
                "Mã Sách ='" + maSach + '\'' +
                        ", Tên Nhà Xuất Bản ='" + tenNhaXuatBan + '\'' +
                        ", Số bản phát hành =" + soBanPhatHanh +
                        ", Tên tác giả ='" + tenTacGia + '\'' +
                        ", Số trang =" + soTrang +
                        ", Ngày phát hành =" + ngayPhatHanh +
                        ", Số phát hành =" + soPhatHanh +
                        ", Tháng phát hành =" + thangPhatHanh +".";
    }

    public String getMaSach() {
        return maSach;
    }
}
