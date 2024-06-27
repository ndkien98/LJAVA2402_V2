package com.t3h.buoi10.baitap.machine;

import com.t3h.buoi10.baitap.MachineAbstract;
import com.t3h.buoi11.IvanlidTriangleException;

import java.util.Scanner;

public class Car extends MachineAbstract {
    private String ngayHetDangKiem;
    public Car(String id,String ngaySanXuat,String hang,String ten,String ngayHetDangKiem){
        super(id, ngaySanXuat, hang, ten);
        this.ngayHetDangKiem = ngayHetDangKiem;
    }

    @Override
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày hết đăng kiểm: ");
        ngayHetDangKiem = scanner.nextLine();
        this.ngayHetDangKiem = ngayHetDangKiem;
        super.nhapThongTin();


    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Car - ID= "+super.getId()+", Ngày sản xuất: "+super.getNgaySanXuat()+", Hãng: "+super.getHang()+", Tên: "+super.getTen()+", Ngày hết đăng kiểm: "+ngayHetDangKiem);
    }

    @Override
    public void runable() {
        System.out.println(super.getTen()+" Có thể chạy.");
    }
}
