package com.t3h.buoi6.stackheap;

import com.t3h.buoi4.btvn.demo.bai2.Sach;

public class DemoStack {

    /**
     Tham chiếu, tham trị
     tham chiếu:
        + truyền trực tiếp địa chỉ ô nhớ vào method => trong method đó có thể thay đối giá trị của biến đó
        + trong C có hỗ trợ truyền tham chiếu &tienBien => truyền địa chỉ ô nhớ của biến đó
     tham trị:
        + truyền giá trị copy vào trong method => method chỉ thay đổi giá trị trên biến copy và không làm thay đổi giá trị của biến chính thức

     Lưu ý: trong Java chỉ cho phép truyền biến dưới dạng tham trị vào trong method

     */
    public static void main(String[] args) {


        Sach sachJava = new Sach();
        sachJava.setMaSach("A");
        System.out.println(sachJava.getMaSach()); // A
        sachJava = new Sach();
        System.out.println(sachJava.getMaSach()); // null ?
        // demo truyền tham trị
        DemoStack demoStack = new DemoStack();
        int tong = 0;
        int soA = 1;
        int soB = 2;
        demoStack.congHaiSo(soA,soB,tong);
        System.out.println(tong);

        Sach sach1 = new Sach();
        sach1.setMaSach("S1");
        sach1.setTenNhaXuatBan("T1");
        demoStack.xoaThongTinSach(sach1);
        System.out.println(sach1.getMaSach() + " | " + sach1.getTenNhaXuatBan());
    }
    public Sach xoaThongTinSach(Sach param){
        param.setMaSach(null);
        param.setTenNhaXuatBan(null);
        return new Sach();
    }
    public void congHaiSo(int soA,int soB, int tong){
        tong = soA + soB;
    }
}
