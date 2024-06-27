package com.t3h.buoi10.demoabstract;

public class HinhTron extends Hinh{
    @Override
    public void veHinh(String tenHinh) {
        System.out.println("Hình tròn đang vẽ");
    }

    @Override
    public void veHinhNangCao() {
        System.out.println("Hình tròn nâng cao đang vẽ");
    }
}
