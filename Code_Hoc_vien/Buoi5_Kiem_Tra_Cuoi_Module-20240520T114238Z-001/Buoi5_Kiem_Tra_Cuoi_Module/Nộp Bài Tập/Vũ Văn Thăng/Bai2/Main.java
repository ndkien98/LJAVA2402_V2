package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh qlhs = new QuanLyHocSinh(2);
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\t=====Menu=====");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Hiển thị học sinh theo tuổi và quê quán");
            System.out.println("4. Tìm kiếm học sinh theo tên và năm sinh");
            System.out.println("5. Xóa học sinh theo mã học sinh và theo tên học sinh.");
            System.out.println("6. Chỉnh sửa thông tin học sinh theo mã học sinh.");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    qlhs.hienThiDanhSachHocSinh();
                    break;
                case 2:
                    System.out.print("Nhập mã học sinh: ");
                    String maHocSinh = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập quê quán: ");
                    String queQuan = sc.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String soDienThoai = sc.nextLine();
                    System.out.print("Nhập ngày tháng năm sinh (dd/mm/yyyy): ");
                    String ngayThangNamSinh = sc.nextLine();

                    HocSinh hocSinh = new HocSinh(maHocSinh, hoTen, tuoi, queQuan, namSinh, soDienThoai, ngayThangNamSinh);
                    qlhs.themHocSinh(hocSinh);
                    break;
                case 3:
                    System.out.print("Nhập tuổi: ");
                    int tuoiTimKiem = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập quê quán: ");
                    String queQuanTimKiem = sc.nextLine();
                    qlhs.hienThiHocSinhTheoTuoiVaQue(tuoiTimKiem, queQuanTimKiem);
                    break;
                case 4:
                    System.out.print("Nhập tên: ");
                    String tenTimKiem = sc.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinhTimKiem = sc.nextInt();
                    sc.nextLine();
                    qlhs.timKiemHocSinhTheoTenVaNamSinh(tenTimKiem, namSinhTimKiem);
                    break;
                case 5:
                    System.out.print("Nhập mã học sinh cần xóa: ");
                    String maHocSinhCanXoa = sc.nextLine();
                    System.out.print("Nhập tên học sinh cần xóa: ");
                    String tenHocSinhCanXoa = sc.nextLine();
                    qlhs.xoaHocSinh(maHocSinhCanXoa, tenHocSinhCanXoa);
                    break;
                case 6:
                    System.out.println("Nhập mã học sinh cần chỉnh sửa: ");
                    String maHocSinhChinhSua = sc.nextLine();
                    HocSinh hocSinhChinhSua = qlhs.TimKiemHocSinhTheoMa(maHocSinhChinhSua);
                    if (hocSinhChinhSua != null){
                        hocSinhChinhSua.hienThiThongTin();
                        System.out.print("Nhập họ tên mới: ");
                        String hoTenMoi = sc.nextLine();
                        System.out.print("Nhập tuổi mới: ");
                        int tuoiMoi = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập quê quán mới: ");
                        String queQuanMoi = sc.nextLine();
                        System.out.print("Nhập năm sinh mới: ");
                        int namSinhMoi = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nhập số điện thoại mới: ");
                        String soDienThoaiMoi = sc.nextLine();
                        System.out.print("Nhập ngày tháng năm sinh mới (dd/mm/yyyy): ");
                        String ngayThangNamSinhMoi = sc.nextLine();

                        qlhs.CapNhatThongTinHocSinh(hocSinhChinhSua,hoTenMoi,tuoiMoi,queQuanMoi,namSinhMoi,soDienThoaiMoi,ngayThangNamSinhMoi);
                        System.out.println("Cập nhật thông tin học sinh thành công.");
                    }else {
                        System.out.println("Không tìm thấy học sinh với mã: "+maHocSinhChinhSua);
                    }
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (luaChon != 7);

        sc.close();
    }
}

