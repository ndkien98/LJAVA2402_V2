package com.t3h.buoi9;

public class Employee {
    private String hoTen;
    // khai báo biến static
    public static String tenCongTy;

    public void hienThiTenCongTy(){
        System.out.println(String.format("Tên công ty của %s là: %s", this.hoTen,Employee.tenCongTy));
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
