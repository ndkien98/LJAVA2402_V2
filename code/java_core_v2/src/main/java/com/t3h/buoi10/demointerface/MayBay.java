package com.t3h.buoi10.demointerface;

public class MayBay implements TongHopCacChucNang{
    private String maMayBay;

    @Override
    public void runnable() {
        System.out.println(this.maMayBay + " đang chạy");
    }

    @Override
    public void flyable() {
        System.out.println(this.maMayBay + " đang bay");
    }

    @Override
    public void swimming() {
        System.out.println(this.maMayBay + " đã tử nạn dưới biển");
    }

    @Override
    public void demoDefault() {
        TongHopCacChucNang.super.demoDefault();
    }

    @Override
    public void start() {

    }
}
