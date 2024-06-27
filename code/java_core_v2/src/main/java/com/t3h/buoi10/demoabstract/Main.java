package com.t3h.buoi10.demoabstract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hinh hinhVuong = new HinhVuong();
        Hinh hinhTron = new HinhTron();
        hinhVuong.veHinhNangCao();
        hinhTron.veHinhNangCao();

        Scanner scanner = new Scanner(System.in);
    }
}
