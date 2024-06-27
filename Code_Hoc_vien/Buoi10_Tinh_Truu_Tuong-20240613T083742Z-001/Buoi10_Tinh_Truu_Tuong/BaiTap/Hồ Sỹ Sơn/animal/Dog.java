package com.t3h.buoi10.baitap.animal;

import com.t3h.buoi10.baitap.AnimalAbstract;

import java.util.Scanner;

public class Dog extends AnimalAbstract {
    private String mauDuoi;
    public Dog(String id, String ten,String mauLong,String mauDuoi){
        super(id,ten,mauLong);
        this.mauDuoi = mauDuoi;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu đuôi: ");
        mauDuoi = scanner.nextLine();
        this.mauDuoi = mauDuoi;
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Dog - ID= "+super.getId()+", Tên: "+super.getTen()+", Màu lông: "+super.getMauLong()+", Màu đuôi: "+mauDuoi);
    }

    @Override
    public void barkable() {
        System.out.println(super.getTen()+ " Có thể sủa.");
    }

    @Override
    public void runable() {
        System.out.println(super.getTen()+ " Có thể chạy.");
    }
}
