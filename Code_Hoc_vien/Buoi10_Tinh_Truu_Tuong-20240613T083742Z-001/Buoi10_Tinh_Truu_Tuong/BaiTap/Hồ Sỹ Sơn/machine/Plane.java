package com.t3h.buoi10.baitap.machine;

import com.t3h.buoi10.baitap.MachineAbstract;

import java.util.Scanner;

public class Plane extends MachineAbstract {
    private String sanBay;
    public Plane(String id,String ngaySanXuat, String hang, String ten,String sanBay){
        super(id, ngaySanXuat, hang, ten);
        this.sanBay = sanBay;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sân bay: ");
        sanBay = scanner.nextLine();
        this.sanBay = sanBay;
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Car - ID= "+super.getId()+", Ngày sản xuất: "+super.getNgaySanXuat()+", Hãng: "+super.getHang()+", Tên: "+super.getTen()+", Sân bay: "+sanBay);
    }

    @Override
    public void flyable() {
        System.out.println(super.getTen()+ " Có thể bay.");
    }
}
