package com.t3h.buoi10.demoabstract;

public class HinhVuong extends Hinh{

    @Override
    public void veHinh(String tenHinh) {
        System.out.println("Hình vuông đang được vẽ");
    }

    @Override
    public void veHinhNangCao() {
        System.out.println("Hình vuông nâng cao đang được vẽ");
    }
}
