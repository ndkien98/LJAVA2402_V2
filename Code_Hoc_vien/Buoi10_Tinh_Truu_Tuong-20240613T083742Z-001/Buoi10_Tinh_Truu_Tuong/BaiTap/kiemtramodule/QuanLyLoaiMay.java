package com.javaweb.kiemtramodule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLyLoaiMay {
    int soMayHienTai ;
    Machine[] machines ;
    int tongSoMay;


    public QuanLyLoaiMay(int tongSoMay){
        this.tongSoMay = tongSoMay;
        this.machines = new Machine[tongSoMay];
        this.soMayHienTai = 0;
    }
    public void themLoaiMay() {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Loại Máy Bạn Muốn Thêm:%n");
        System.out.printf("Nhập 1 Để Thêm Oto, 2 Để Thêm Máy Bay:");

        try {
            int count = sc.nextInt();
            luaChon(count);
        }catch (InputMismatchException e){
            System.out.printf("QuanLyLoaiMay"+e.getMessage());
        } catch (CustomException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void luaChon(int type) throws CustomException {
        Machine machine = null;
        switch (type){
            case 1:
                machine = new XeOTo();
                nhapId(machine);
                ((XeOTo)machine).nhapThongTin();
                ((XeOTo)machine).hienThiThongTin();
                machines[soMayHienTai] = machine;
                soMayHienTai++;
                break;
            case 2:
                machine = new MayBay();
                nhapId(machine);
                ((MayBay)machine).nhapThongTin();
                ((MayBay)machine).hienThiThongTin();
                machines[soMayHienTai] = machine;
                soMayHienTai++;
                break;
            default:
                throw new CustomException("Nhập Từ 1 đến 2");
        }

    }
    public void suaThongTin(){
        System.out.printf("Nhập Id Bạn Muốn Sửa Thông Tin:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        if(soMayHienTai > 0){
            for (int i = 0 ; i < soMayHienTai ; i ++){
                if(machines[i].id.equals(id)){
                    if(machines[i] instanceof XeOTo){
                        ((XeOTo)machines[i]).nhapThongTin();
                        ((XeOTo)machines[i]).hienThiThongTin();
                    }
                    if(machines[i] instanceof MayBay){
                        ((MayBay)machines[i]).nhapThongTin();
                        ((MayBay)machines[i]).hienThiThongTin();
                    }
                }else {
                    System.out.printf("Id Bạn Muốn Sửa Không Có:");
                }
            }
        }else {
            System.out.printf("Id Bạn Muốn Sửa Không Có:");
        }

    }
    public void timThongTinTheoTen(){
        System.out.printf("Nhập Tên Bạn Muốn Tìm Kiếm:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(soMayHienTai > 0){
            for (int i = 0 ; i < soMayHienTai ; i ++){
                if(machines[i].ten.toLowerCase().contains(name)){
                    if (machines[i] instanceof XeOTo){
                        ((XeOTo) machines[i]).hienThiThongTin();
                    }
                    if (machines[i] instanceof MayBay){
                        ((MayBay) machines[i]).hienThiThongTin();
                    }
                }else {
                    System.out.printf("Không Có Tên Bạn Cần Tìm");
                }
            }
        }else {
            System.out.printf("Không Có Tên Bạn Cần Tìm");
        }

    }
    public void nhapId(Machine machine){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập Id:");
        String id = sc.nextLine();
        while (kiemTraId(id)){
            System.out.printf("Id Đã Trùng.Vui Lòng Nhập Lại:");
            id = sc.nextLine();
        }
        machine.setId(id);
    }
    public boolean kiemTraId( String id) {
        for (int i = 0; i < soMayHienTai; i++) {
            if(machines[i].id.equals(id)){
                return true;
            }
        }
        return false;
    }
}
