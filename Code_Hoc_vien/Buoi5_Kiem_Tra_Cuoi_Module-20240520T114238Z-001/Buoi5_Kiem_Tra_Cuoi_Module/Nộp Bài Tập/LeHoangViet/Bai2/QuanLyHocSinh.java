package buoi5.Bai2;

import java.util.Scanner;

public class QuanLyHocSinh {
    private HocSinh[] danhSachHocSinh;
    private int soLuongHocSinh;

    public QuanLyHocSinh(int kichThuoc) {
        danhSachHocSinh = new HocSinh[kichThuoc];
        soLuongHocSinh = 0;
    }

    public void themHocSinh(HocSinh hocSinh) {
        if (soLuongHocSinh < danhSachHocSinh.length) {
            danhSachHocSinh[soLuongHocSinh] = hocSinh;
            soLuongHocSinh++;
        } else {
            System.out.println("Không thể thêm học sinh, danh sách đã đầy.");
        }
    }

    public void hienThiDanhSachHocSinh() {
        for (int i = 0; i < soLuongHocSinh; i++) {
            System.out.println(danhSachHocSinh[i]);
        }
    }
    public void hienThiHocSinh() {
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getTuoi() == 23 && danhSachHocSinh[i].getQueQuan().equalsIgnoreCase("")) {
                System.out.println(danhSachHocSinh[i]);
            }
        }
    }

    public void timKiemHocSinh(String tuKhoa) {
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getHoTen().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                    Integer.toString(danhSachHocSinh[i].getNamSinh()).contains(tuKhoa)) {
                System.out.println(danhSachHocSinh[i]);
            }
        }
    }

    public void xoaHocSinh(String maHocSinh, String hoTen) {
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getMaHocSinh().equals(maHocSinh) && danhSachHocSinh[i].getHoTen().equals(hoTen)) {
                // Xóa học sinh bằng cách dịch chuyển các phần tử sau đó lên trước
                for (int j = i; j < soLuongHocSinh - 1; j++) {
                    danhSachHocSinh[j] = danhSachHocSinh[j + 1];
                }
                danhSachHocSinh[soLuongHocSinh - 1] = null; // Xóa phần tử cuối cùng
                soLuongHocSinh--;
                System.out.println("Đã xóa học sinh với mã " + maHocSinh + " và tên " + hoTen);
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với mã " + maHocSinh + " và tên " + hoTen);
    }

    public void chinhSuaHocSinh(String maHocSinh) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getMaHocSinh().equals(maHocSinh)) {
                System.out.println("Nhập thông tin mới cho học sinh có mã " + maHocSinh);
                System.out.print("Họ tên: ");
                danhSachHocSinh[i].setHoTen(scanner.nextLine());
                System.out.print("Tuổi: ");
                danhSachHocSinh[i].setTuoi(scanner.nextInt());
                scanner.nextLine(); // Đọc bỏ dòng trống
                System.out.print("Quê quán: ");
                danhSachHocSinh[i].setQueQuan(scanner.nextLine());
                System.out.print("Năm sinh: ");
                danhSachHocSinh[i].setNamSinh(scanner.nextInt());
                scanner.nextLine(); // Đọc bỏ dòng trống
                System.out.print("Số điện thoại: ");
                danhSachHocSinh[i].setSoDienThoai(scanner.nextLine());
                System.out.print("Ngày sinh: ");
                danhSachHocSinh[i].setNgaySinh(scanner.nextLine());
                System.out.println("Đã cập nhật thông tin cho học sinh.");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với mã " + maHocSinh);
    }

    public static void main(String[] args) {
        QuanLyHocSinh qlhs = new QuanLyHocSinh(100); // Tạo danh sách với tối đa 100 học sinh
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1) Hiển thị danh sách học sinh");
            System.out.println("2) Thêm học sinh mới");
            System.out.println("3) Hiển thị các học sinh có tuổi và quê");
            System.out.println("4) Tìm kiếm học sinh theo tên hoặc năm sinh");
            System.out.println("5) Xóa học sinh theo mã và tên chính xác");
            System.out.println("6) Chỉnh sửa thông tin học sinh theo mã học sinh");
            System.out.println("7) Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    qlhs.hienThiDanhSachHocSinh();
                    break;
                case 2:
                    System.out.print("Mã học sinh: ");
                    String ma = scanner.nextLine();
                    System.out.print("Họ tên: ");
                    String ten = scanner.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống
                    System.out.print("Quê quán: ");
                    String que = scanner.nextLine();
                    System.out.print("Năm sinh: ");
                    int nam = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống
                    System.out.print("Số điện thoại: ");
                    String sdt = scanner.nextLine();
                    System.out.print("Ngày sinh: ");
                    String ngay = scanner.nextLine();
                    HocSinh hs = new HocSinh(ma, ten, tuoi, que, nam, sdt, ngay);
                    qlhs.themHocSinh(hs);
                    break;
                case 3:
                    qlhs.hienThiHocSinh();
                    break;
                case 4:
                    System.out.print("Nhập tên hoặc năm sinh để tìm kiếm: ");
                    String tuKhoa = scanner.nextLine();
                    qlhs.timKiemHocSinh(tuKhoa);
                    break;
                case 5:
                    System.out.print("Nhập mã học sinh: ");
                    String maXoa = scanner.nextLine();
                    System.out.print("Nhập tên học sinh: ");
                    String tenXoa = scanner.nextLine();
                    qlhs.xoaHocSinh(maXoa, tenXoa);
                    break;
                case 6:
                    System.out.print("Nhập mã học sinh để chỉnh sửa: ");
                    String maSua = scanner.nextLine();
                    qlhs.chinhSuaHocSinh(maSua);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
    // Các phương thức khác sẽ được thêm vào đây

