package com.t3h.buoi8.baitap.bai1;

import java.util.Scanner;

public class QuanLyTaiLieu {

    private TaiLieu[] danhSachTaiLieu;
    private int tongSoTaiLieu;
    private int soLuongTaiLieuHienTai;

    public QuanLyTaiLieu(int tongSoTaiLieu) {
        this.tongSoTaiLieu = tongSoTaiLieu;
        this.danhSachTaiLieu = new TaiLieu[tongSoTaiLieu];
        this.soLuongTaiLieuHienTai = 0;
    }

    public void themTaiLieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại tài liệu: 1 Sách, 2 Tạp chí, 3 Báo cáo");
        int loaiTaiLieu = scanner.nextInt();
        scanner.nextLine();
        TaiLieu taiLieu = null;
        switch (loaiTaiLieu){
            case 1:
                taiLieu = new Sach();
                nhapMaTaiLieu(scanner, taiLieu);
                taiLieu.nhapThongTin();
                break;
            case 2:
                taiLieu = new TapChi();
                nhapMaTaiLieu(scanner, taiLieu);
                taiLieu.nhapThongTin();
                break;
            case 3:
                taiLieu = new BaoCao();
                nhapMaTaiLieu(scanner, taiLieu);
                taiLieu.nhapThongTin();
                break;
            default:
                System.out.println("Bạn chọn loại tài liệu không đúng");
        }
        this.danhSachTaiLieu[this.soLuongTaiLieuHienTai] = taiLieu;
        this.soLuongTaiLieuHienTai++;
    }

    public void timKiemTheoLoai(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chọn loại tài liệu: 1 Sách, 2 Tạp chí, 3 Báo cáo");
        int loaiTaiLieu = scanner.nextInt();
        TaiLieu taiLieu = null;
        switch (loaiTaiLieu){
            case 1:
                for (int i = 0; i < this.soLuongTaiLieuHienTai; i++) {
                    taiLieu = this.danhSachTaiLieu[i];
                    if (taiLieu instanceof Sach){ // kiểm tra xem đối tượng này có phải một thể hiện(instance, object) được tạo
                                                    // ra từ class Sach không
                        taiLieu.hienThiThongTin();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < this.soLuongTaiLieuHienTai; i++) {
                    taiLieu = this.danhSachTaiLieu[i];
                    if (taiLieu instanceof TapChi){
                        taiLieu.hienThiThongTin();
                    }
                }
                break;
            case 3:
                for (int i = 0; i < this.soLuongTaiLieuHienTai; i++) {
                    taiLieu = this.danhSachTaiLieu[i];
                    if (taiLieu instanceof BaoCao){
                        taiLieu.hienThiThongTin();
                    }
                }
                break;
            default:
                System.out.println("Bạn chọn loại tài liệu không đúng");
        }
    }
    public void xoaTaiLieu(){
        System.out.println("Nhập vào mã tài liệu: ");
        String maTaiLieuXoa = new Scanner(System.in).nextLine();
        for (int i = 0; i < this.soLuongTaiLieuHienTai; i++) {
            if (this.danhSachTaiLieu[i] != null && maTaiLieuXoa.equalsIgnoreCase(this.danhSachTaiLieu[i].getMaTaiLieu())){
                System.out.println("đã tìm thấy tài liệu cần xóa: ");
                this.danhSachTaiLieu[i].hienThiThongTin();
                for (int j = i; j < this.soLuongTaiLieuHienTai; j++) {
                    this.danhSachTaiLieu[j] = this.danhSachTaiLieu[j + 1];
                }
                this.soLuongTaiLieuHienTai--;
            }
        }
    }
    public void hienThiTaiLieu(){
        for (int i = 0; i < this.soLuongTaiLieuHienTai; i++) {
            this.danhSachTaiLieu[i].hienThiThongTin();
        }
    }
    private void nhapMaTaiLieu(Scanner scanner, TaiLieu taiLieu) {
        String maTaiLieu;
        do {
            System.out.println("Nhập vào mã tài liệu: ");
            maTaiLieu = scanner.nextLine();
        }while (this.maTaiLieuKhongHopLe(maTaiLieu));
        taiLieu.setMaTaiLieu(maTaiLieu);
    }

    public boolean maTaiLieuKhongHopLe(String maTaiLieu){
        for (int i = 0; i < this.soLuongTaiLieuHienTai; i++) {
            if (this.danhSachTaiLieu[i].getMaTaiLieu().equals(maTaiLieu)){
                return true;
            }
        }
        return false;
    }
}
