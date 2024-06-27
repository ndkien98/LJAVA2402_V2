package com.t3h.buoi14.chuabaikiemtramodule2;


import com.t3h.buoi14.chuabaikiemtramodule2.interfaces.IQuanLy;
import com.t3h.buoi14.chuabaikiemtramodule2.machine.Machine;
import com.t3h.buoi14.chuabaikiemtramodule2.machine.MayBay;
import com.t3h.buoi14.chuabaikiemtramodule2.machine.Xe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class QuanLyMayMoc implements IQuanLy {
    private List<Machine> danhSachMayMoc = new ArrayList<>();


    @Override
    public void themMoi() {
        System.out.println("Nhập vào loại máy móc muốn thêm: ");
        System.out.println("1: Máy bay");
        System.out.println("2: Xe ô tô");
        Machine machine = null;
        int luaChon = new Scanner(System.in).nextInt();
        switch (luaChon){
            case 1:
                machine = new MayBay();
                break;
            case 2:
                machine = new Xe();
                break;
            default:
                break;
        }
        if (machine == null){
            System.out.println("Nhập không đúng định dạng, kết thúc chọn");
            return;
        }

        System.out.println("Nhập thông tin của các loại máy móc ");
        System.out.println("Nhập vào id: ");
        Integer id = nhapGiaTriSo();
        if (this.idKhongHopLe(id)){
            System.out.println("Id đã tồn tại trong danh sách");
            return;
        }
        machine.setId(id);
        machine.nhapThongTin();
        System.out.println("Thông tin máy móc vừa nhập là: ");
        machine.hienThiThongTin();
        // thêm máy móc vào list
        danhSachMayMoc.add(machine);
    }

    @Override
    public void chinhSua() {
        System.out.println("Nhập vào id máy móc muốn sửa: ");
        int id = nhapGiaTriSo();
        System.out.println("Đang tìm máy móc với id: " + id);
        Machine mayMocCanTim = null;
        for (Machine machine: danhSachMayMoc){
            if (machine.getId() == id){
                mayMocCanTim = machine;
                break;
            }
        }
        if (mayMocCanTim == null){
            System.out.println("Không tìm thấy máy móc với id: " + id + " ...");
            return;
        }
        System.out.println("Thông tin máy móc cần tìm là ");
        mayMocCanTim.hienThiThongTin();
        System.out.println();
        System.out.println("Nhập vào thông tin muốn chỉnh sửa: ");
        mayMocCanTim.nhapThongTin();
        System.out.println("thông tin máy móc sau khi chỉnh sửa là: ");
        mayMocCanTim.hienThiThongTin();
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập vào tên máy móc muốn tìm kiếm: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Đang tìm máy móc với tên: " + ten + " ...");
        Machine machineTimKiem = null;
        for (Machine machine: danhSachMayMoc){
            if (ten.equalsIgnoreCase(machine.getTen())){
                machineTimKiem = machine;
                break;
            }
        }
        if (machineTimKiem == null){
            System.out.println("Không tìm thấy máy móc tên : " + ten);
            return;
        }
        System.out.println("Thông tin máy móc cần tìm là ");
        machineTimKiem.hienThiThongTin();
    }

    @Override
    public void hienThiDuLieu() {
        System.out.println("Thông tin danh sách máy móc là: "); // thêm i để biết thứ tự
        for (int i = 0; i < danhSachMayMoc.size(); i++) {
            System.out.print((i + 1) + " ");
            Machine machine = danhSachMayMoc.get(i);
            machine.hienThiThongTin();
        }
    }

    boolean idKhongHopLe(Integer id){
        for (Machine machine:danhSachMayMoc){
            if (Objects.equals(machine.getId(), id)){
                return true;
            }
        }
        return false;
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
