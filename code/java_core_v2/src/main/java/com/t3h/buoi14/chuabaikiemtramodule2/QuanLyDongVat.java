package com.t3h.buoi14.chuabaikiemtramodule2;

import com.t3h.buoi14.chuabaikiemtramodule2.animal.Animal;
import com.t3h.buoi14.chuabaikiemtramodule2.animal.Ca;
import com.t3h.buoi14.chuabaikiemtramodule2.animal.Chim;
import com.t3h.buoi14.chuabaikiemtramodule2.animal.Cho;
import com.t3h.buoi14.chuabaikiemtramodule2.interfaces.IQuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDongVat implements IQuanLy {

    private List<Animal> danhSachDongVat = new ArrayList<>();

    boolean idKhongHopLe(Integer id){
        for (Animal animal:danhSachDongVat){
            if (animal.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThiDuLieu() {
        System.out.println("Thông tin danh sách động vật là: "); // thêm i để biết thứ tự
        for (int i = 0; i < danhSachDongVat.size(); i++) {
            System.out.print((i + 1) + " ");
            Animal animal = danhSachDongVat.get(i);
            animal.hienThiThongTin();
        }
    }

    @Override
    public void themMoi() {
        System.out.println("Nhập vào loại động vật muốn thêm: ");
        System.out.println("1: Chó");
        System.out.println("2: Chim");
        System.out.println("3: Cá");
        Animal animal = null;
        int luaChon = new Scanner(System.in).nextInt();
        switch (luaChon){
            case 1:
                animal = new Cho();
                break;
            case 2:
                animal = new Chim();
                break;
            case 3:
                animal = new Ca();
                break;
            default:
                break;
        }
        if (animal == null){
            System.out.println("Nhập không đúng định dạng, kết thúc chọn");
            return;
        }

        System.out.println("Nhập thông tin của các loại động vật ");
        System.out.println("Nhập vào id: ");
        Integer id = nhapGiaTriSo();
        if (this.idKhongHopLe(id)){
            System.out.println("Id đã tồn tại trong danh sách");
            return;
        }
        animal.setId(id);
        animal.nhapThongTin();
        System.out.println("Thông tin động vật vừa nhập là: ");
        animal.hienThiThongTin();
        // thêm động vật vào list
        danhSachDongVat.add(animal);
    }

    @Override
    public void chinhSua() {
        System.out.println("Nhập vào id động vật muốn sửa: ");
        int id = nhapGiaTriSo();
        System.out.println("Đang tìm động vật với id: " + id);
        Animal dongVatCanTim = null;
        for (Animal dongVat: danhSachDongVat){
            if (dongVat.getId() == id){
                dongVatCanTim = dongVat;
                break;
            }
        }
        if (dongVatCanTim == null){
            System.out.println("Không tìm thấy động vật với id: " + id + " ...");
            return;
        }
        System.out.println("Thông tin động vật cần tìm là ");
        dongVatCanTim.hienThiThongTin();
        System.out.println();
        System.out.println("Nhập vào thông tin muốn chỉnh sửa: ");
        dongVatCanTim.nhapThongTin();
        System.out.println("thông tin động vật sau khi chỉnh sửa là: ");
        dongVatCanTim.hienThiThongTin();
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập vào tên động vật muốn tìm kiếm: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Đang tìm động vật với tên: " + ten + " ...");
        Animal dongVatCanTim = null;
        for (Animal dongVat: danhSachDongVat){
            if (ten.equalsIgnoreCase(dongVat.getTen())){
                dongVatCanTim = dongVat;
                break;
            }
        }
        if (dongVatCanTim == null){
            System.out.println("Không tìm thấy động vật tên : " + ten);
            return;
        }
        System.out.println("Thông tin động vật cần tìm là ");
        dongVatCanTim.hienThiThongTin();
    }

    public int nhapGiaTriSo(){
        boolean giaTriKhongHopLe = true;
        int giaTri = 0;
        do {
            try {
                 giaTri = new Scanner(System.in).nextInt();
                 giaTriKhongHopLe = false;
            }catch (Exception e){
                System.out.println("Bạn nhập giá trị không phải kiểu số không hợp lệ, đề nghị nhập lại");
            }
        }while (giaTriKhongHopLe);
        return giaTri;
    }
}
