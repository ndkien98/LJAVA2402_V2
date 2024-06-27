package com.t3h.buoi10.demointerface;

// class Chó đang triển khai các chức năng của interface TongHopCacChucNang
public class Cho implements TongHopCacChucNang{
    private String mauLong;
    private String ten;
    @Override
    public void runnable() {
        System.out.println(this.ten + " đang chạy");
    }

    @Override
    public void flyable() {
        System.out.println(this.ten + " không thể bay");
    }

    @Override
    public void swimming() {
        System.out.println(this.ten + " may ra thì bơi được");
    }

    @Override
    public void demoDefault() {
        TongHopCacChucNang.super.demoDefault();
    }

    @Override
    public void start() {

    }
}
