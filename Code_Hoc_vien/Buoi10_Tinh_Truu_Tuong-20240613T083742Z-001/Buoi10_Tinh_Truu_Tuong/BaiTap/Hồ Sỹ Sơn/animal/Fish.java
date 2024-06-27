package com.t3h.buoi10.baitap.animal;

import com.t3h.buoi10.baitap.AnimalAbstract;

import java.util.Scanner;

public class Fish extends AnimalAbstract {
    private String vungBien;
    public Fish(String id, String ten, String mauLong, String vungBien){
        super(id, ten, mauLong);
        this.vungBien = vungBien;
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vùng biển: ");
        vungBien = scanner.nextLine();
        this.vungBien = vungBien;
        super.nhapThongTin();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Fish - ID= "+super.getId()+", Tên: "+super.getTen()+", Màu lông: "+super.getMauLong()+", Vùng biển: "+vungBien);
    }

    @Override
    public void swimable() {
        System.out.println(super.getTen()+" Có thể bơi.");
    }
}
