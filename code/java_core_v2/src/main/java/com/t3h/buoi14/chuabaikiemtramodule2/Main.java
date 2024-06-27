package com.t3h.buoi14.chuabaikiemtramodule2;


import com.t3h.buoi14.chuabaikiemtramodule2.exceptions.T3hCustomException;
import com.t3h.buoi14.chuabaikiemtramodule2.interfaces.IQuanLy;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static final int QUAN_LY_DONG_VAT = 1;
    public static final int QUAN_LY_MAY_MOC = 2;
    public static final int THOAT_CHUONG_TRINH = -1;

    public static final int THEM_MOI = 1;
    public static final int CHINH_SUA = 2;
    public static final int TIM_KIEM_TEN = 3;
    public static final int HIEN_THI_THONG_TIN = 4;
    public static final int QUAY_LAI_CHON_QUAN_LY = 5;

    public static IQuanLy quanLyDongVat = null;
    public static IQuanLy quanLyMayMoc = null;

    public static void main(String[] args) {
        boolean tiepTuc = true;
        while (tiepTuc) {
            tiepTuc = thucThiChuongTrinh();
        }
    }

    public static boolean thucThiChuongTrinh() {
        IQuanLy quanLy = null;
        int chucNangQuanLy = nhapThongTinChucNangQuanLy();
        if (chucNangQuanLy == Main.QUAN_LY_DONG_VAT) {
            quanLy = Main.quanLyDongVat != null ? Main.quanLyDongVat : new QuanLyDongVat();
        } else if (chucNangQuanLy == Main.QUAN_LY_MAY_MOC) {
            quanLy = Main.quanLyMayMoc != null ? Main.quanLyMayMoc : new QuanLyMayMoc();
        } else {
            return false;
        }
        boolean quayLaiChonQuanLy = thucThiChucNangChiTiet(chucNangQuanLy, quanLy);
        if (chucNangQuanLy == Main.QUAN_LY_DONG_VAT) {
            Main.quanLyDongVat = quanLy;
        } else if (chucNangQuanLy == Main.QUAN_LY_MAY_MOC) {
            Main.quanLyMayMoc = quanLy;
        }

        return quayLaiChonQuanLy;
    }

    private static boolean thucThiChucNangChiTiet(int chucNangQuanLy, IQuanLy quanLy) {
        boolean tiepTucChonChiTiet = true;
        do {
            int chucNangQuanLyChiTiet = getChucNangChiTiet(chucNangQuanLy);
            switch (chucNangQuanLyChiTiet) {
                case Main.THEM_MOI:
                    quanLy.themMoi();
                    break;
                case Main.CHINH_SUA:
                    quanLy.chinhSua();
                    break;
                case Main.TIM_KIEM_TEN:
                    quanLy.timKiem();
                    break;
                case Main.HIEN_THI_THONG_TIN:
                    quanLy.hienThiDuLieu();
                    break;
                case Main.QUAY_LAI_CHON_QUAN_LY:
                    return true;
                case Main.THOAT_CHUONG_TRINH:
                    System.exit(0);
            }
        } while (tiepTucChonChiTiet);
        return false;
    }

    private static int getChucNangChiTiet(int chucNangQuanLy) {
        System.out.println();
        int chucNangChiTiet = 0;
        switch (chucNangQuanLy) {
            case QUAN_LY_DONG_VAT:
                System.out.println("===== Quản lý động vật, chọn các chức năng về động vật =====");
                chucNangChiTiet = nhapThongTinChucNang();
                break;
            case QUAN_LY_MAY_MOC:
                System.out.println("===== Quản lý máy móc, chọn các chức năng về máy móc ===== ");
                chucNangChiTiet = nhapThongTinChucNang();
                break;
            case THOAT_CHUONG_TRINH:
                System.out.println("Bạn đã chọn thoát chương trình!");
                chucNangChiTiet = THOAT_CHUONG_TRINH;
                break;
        }
        return chucNangChiTiet;
    }

    public static int nhapThongTinChucNangQuanLy(){
        boolean dataInvalid = true;
        int chucNangQuanLy = 0;
        do {
            try {
                System.out.println("=======================================================================");
                System.out.println("=== Chào mừng đến với danh sách các chức năng trong bài kiểm tra module 2 ===");
                System.out.println("Chọn các chức năng: ");
                System.out.println("1: Quản lý danh sách các động vật");
                System.out.println("2: Quản lý danh sách các loại máy móc");
                System.out.println("-1: Thoát chương trình");
                chucNangQuanLy = scanner.nextInt();
                scanner.nextLine();
                if ((chucNangQuanLy >=1 && chucNangQuanLy <=2) || chucNangQuanLy == -1){
                    dataInvalid = false;
                }else {
                    System.out.println("Dữ liệu bạn nhập không nằm trong danh sách chức năng, đề nghị nhập lại!");
                }
            }catch (Exception e){
                System.out.println("Bạn đã nhập sai định dạng chức năng, đề nghị nhập lại: ");
                scanner.nextLine();
            }
        }while (dataInvalid);
        return chucNangQuanLy;
    }

    public static int nhapThongTinChucNang(){
        int chucNang = 0;
        boolean dataInvalid = true;
        do {
            try {
                System.out.println("1: Thêm mới ");
                System.out.println("2: Sửa thông tin theo id ");
                System.out.println("3: Tìm kiếm theo tên ");
                System.out.println("4: Hiển thị danh sách ");
                System.out.println("5: Quay lại chọn chức năng quản lý");
                System.out.println("-1: Thoát chuơng trình");
                chucNang = scanner.nextInt();
                scanner.nextLine();
                if ((chucNang >=1 && chucNang <=5) || chucNang == -1){
                    dataInvalid = false;
                }else {
                    System.out.println("Dữ liệu bạn nhập không nằm trong danh sách chức năng, đề nghị nhập lại!");
                }
            }catch (Exception e){
                System.out.println("Bạn đã nhập sai định dạng chức năng, đề nghị nhập lại: ");
                scanner.nextLine();
            }
        }while (dataInvalid);
        return chucNang;
    }
}
