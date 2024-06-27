package lesson6.module1.ex02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLiHocSinh quanLy = new QuanLiHocSinh();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quanLy.soLuongHocSinhHienTai; i++) {

            HocSinh hocSinh = new HocSinh(i + 1, "ten" + i, i + 1, "que " + i, i + 1, i + 1, i + 1);
            quanLy.themHocSinh(hocSinh);

        }
        int choice;
        do {
            System.out.println("1) Hiển thị danh sách học sinh");
            System.out.println("2) Thêm học sinh mới");
            System.out.println("3) Hiển thị các học sinh có tuổi là 23 và quê ở Đà Nẵng");
            System.out.println("4) Tìm kiếm học sinh theo tên ");
            System.out.println("5) Tìm kiếm học sinh theo tuổi ");
            System.out.println("6) Chỉnh sửa thông tin học sinh theo mã");
            System.out.println("7) Xóa học sinh theo mã và tên");
            System.out.println("0) Thoát");
            System.out.print("Chọn chức năng (nhập <0 mất công nhập lại) : ");


            choice = sc.nextInt();
            int chocie;
            switch (choice) {
                case 1:
                    quanLy.hienThiHocSinh();
                    break;
                case 2:
                    System.out.println("nhap vao thong tin hoc sinh");
                    HocSinh hs = new HocSinh();
                    hs.themHocSinh();
                    quanLy.themHocSinh(hs);
                    break;
                case 3:
                    quanLy.hienThiHocSinh23TuoiQueDaNang();
                    quanLy.hienThiHocSinh();
                    break;
                case 4:
                    quanLy.timTheoTen();
                    break;
                case 5:
                    quanLy.timTheoTuoi();
                    break;
                case 6:
                    System.out.println("nhap ma hoc sinh sinh vien can chinh sua:");
                    int mhs = sc.nextInt();
                    quanLy.chinhSuaThongTin(mhs);
                    break;
                case 7:
                    quanLy.xoaHocSinh();
                    System.out.println("Số học sinh còn lại trong mảng là: ");
                    quanLy.hienThiHocSinh();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("lua chon khong hop le");
            }
        } while (choice > 0);
        sc.close();
    }
}
