package com.t3h.buoi10.baitap.animal;

import com.t3h.buoi10.baitap.AnimalAbstract;

import java.util.Scanner;

public class Bird extends AnimalAbstract {
    private String loaiHat;
    public Bird(String id,String ten,String mauLong,String loaiHat){
        super(id, ten, mauLong);
        this.loaiHat = loaiHat;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập loại hạt:");
        loaiHat = scanner.nextLine();
        this.loaiHat = loaiHat;
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Bird - ID= "+super.getId()+", Tên: "+super.getTen()+", Màu lông: "+super.getMauLong()+", Loại hạt: "+loaiHat);
    }

    @Override
    public void flyable() {
        System.out.println(super.getTen()+" Có thể bay.");
    }
}
