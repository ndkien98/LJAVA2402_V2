package com.t3h.buoi4.btvn.demo.bai2;

import java.util.Scanner;

/**
 Một thư viện cần quản lý các Sách
 Mỗi cuốn Sách gồm có các thuộc tính sau:
 Mã sách (Mã tài liệu là duy nhất),
 Tên nhà xuất bản,
 số bản phát hành.
 tên tác giả
 số trang.
 Ngày phát hành.
 Số phát hành,
 tháng phát hành.
 Yêu cầu 1: Xây dựng lớp Sách để quản lý tài liệu cho thư viện một cách hiệu quả.
 Yêu cầu 2: Xây dựng lớp QuanLySach có mảng các cuốn sách và đáp ứng các chức năng sau
 a) Cho phép nhập vào 3 cuốn sách mặc định hoặc khởi tạo ra giá mặc định cho 3 cuốn sách của mảng
 b) Thêm sách vào cuối mảng
 c) Xóa sách theo mã sách
 Xây dựng chương trình như một vòng lặp với các chức năng trên và thêm chức năng exist. Khi chỉ chọn chức năng exist thì mới thoát khỏi chương trình, nếu không chương trình sẽ có thể lặp lại cho user chọn các chức năng

 */
public class QuanLySach {

    // thuộc tính danh sách các cuốn sách, đóng vai trò khai báo trước có thể có số lượng ô nhớ để chứa
    // một số lượng sách nhất định
    private Sach[] arrSach;
    // theo giõi hiện tại thư viện đã chứa bao nhiêu cuốn sách
    private int soLuongSachHienTai;
    // xác định tổng số lượng cuốn sách mà thư viện có thể chứa
    private int tongSoSachCuaThuVien;
    // được sử dụng để khởi tạo đối tượng, để JVM cấp phát cho đối tượng ô nhớ trong vùng nhớ heap
    public QuanLySach(int tongSoSachCuaThuVien){
        this.tongSoSachCuaThuVien = tongSoSachCuaThuVien;
        this.arrSach = new Sach[tongSoSachCuaThuVien];
        this.soLuongSachHienTai = 0;
    }

    public void themSach(Sach sachThem){
        if (this.soLuongSachHienTai == this.tongSoSachCuaThuVien){
            System.out.println("Số lượng sách trong thư viện đã đầy, không thể thêm");
            return;
        }
        this.arrSach[this.soLuongSachHienTai] = sachThem;
        this.soLuongSachHienTai++;
    }
    public void hienThiDanhSach(){
        for (int i = 0; i < this.soLuongSachHienTai; i++) {
            System.out.println(this.arrSach[i].toString());
        }
    }
    public void xoaSach(){
        System.out.println("Nhập vào mã sách: ");
        String maSach = new Scanner(System.in).nextLine();
        boolean xoaThanhCong = false;
        for (int i = 0; i < this.soLuongSachHienTai; i++) {
            /**
             kiểm tra nếu mã sách nhập vào tồn tại trong thư viện
             */
            if (arrSach[i].getMaSach().equals(maSach)){
                // thực hiện xóa
                for (int j = i; j < this.soLuongSachHienTai; j++) {
                    this.arrSach[j] = this.arrSach[j + 1];
                }
                this.soLuongSachHienTai--;
                xoaThanhCong = true;
            }
        }
        if (xoaThanhCong){
            System.out.println("Đã xóa thành công sách với mã: " + maSach);
        }
    }

}
