package Bai2;

public class QuanLyHocSinh {
    private HocSinh[] danhSachHocSinh;
    private int soLuongHocSinh;

    public QuanLyHocSinh(int kichThuocBanDau) {
        this.danhSachHocSinh = new HocSinh[kichThuocBanDau];
        this.soLuongHocSinh = 0;
    }

    public void themHocSinh(HocSinh hocSinh) {
        if (soLuongHocSinh == danhSachHocSinh.length) {
            tangKichThuocMang();
        }
        danhSachHocSinh[soLuongHocSinh] = hocSinh;
        soLuongHocSinh++;
    }

    private void tangKichThuocMang() {
        int kichThuocMoi = danhSachHocSinh.length +1;
        HocSinh[] mangMoi = new HocSinh[kichThuocMoi];
        for (int i = 0; i < danhSachHocSinh.length; i++) {
            mangMoi[i] = danhSachHocSinh[i];
        }
        danhSachHocSinh = mangMoi;
    }

    public void hienThiDanhSachHocSinh() {
        if (soLuongHocSinh == 0) {
            System.out.println("Danh sách chưa có học sinh nào, vui lòng nhập thông tin học sinh.");
        } else {
            for (int i = 0; i < soLuongHocSinh; i++) {
                danhSachHocSinh[i].hienThiThongTin();
            }
        }
    }
    public void hienThiHocSinhTheoTuoiVaQue(int tuoi, String queQuan) {
        boolean found = false;
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getTuoi() == tuoi && danhSachHocSinh[i].getQueQuan().equalsIgnoreCase(queQuan)) {
                danhSachHocSinh[i].hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh nào với tuổi " + tuoi + " và quê quán " + queQuan);
        }
    }
    public void timKiemHocSinhTheoTenVaNamSinh(String ten, int namSinh) {
        boolean found = false;
        String keyword = ten.toLowerCase();

        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getHoTen().toLowerCase().contains(keyword) && danhSachHocSinh[i].getNamSinh() == namSinh) {
                danhSachHocSinh[i].hienThiThongTin();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh nào với tên chứa '" + ten + "' và năm sinh " + namSinh);
        }
    }
    public void xoaHocSinh(String maHocSinh, String tenHocSinh) {
        int viTriXoa = -1;
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getMaHocSinh().equals(maHocSinh) && danhSachHocSinh[i].getHoTen().equals(tenHocSinh)) {
                viTriXoa = i;
                break;
            }
        }

        if (viTriXoa != -1) {
            for (int i = viTriXoa; i < soLuongHocSinh - 1; i++) {
                danhSachHocSinh[i] = danhSachHocSinh[i + 1];
            }
            danhSachHocSinh[soLuongHocSinh - 1] = null;
            soLuongHocSinh--;
            System.out.println("Đã xóa học sinh có mã " + maHocSinh + " và tên " + tenHocSinh);
        } else {
            System.out.println("Không tìm thấy học sinh có mã " + maHocSinh + " và tên " + tenHocSinh);
        }
    }
    public HocSinh TimKiemHocSinhTheoMa(String maHocSinh){
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getMaHocSinh().equals(maHocSinh)) {
                return danhSachHocSinh[i];
            }
        }
        return null;
    }
    public void CapNhatThongTinHocSinh(HocSinh hocSinh, String hoTen,  int tuoi, String queQuan, int namSinh, String soDienThoai, String ngayThangNamSinh){
       hocSinh.setHoTen(hoTen);
       hocSinh.setTuoi(tuoi);
       hocSinh.setQueQuan(queQuan);
       hocSinh.setNamSinh(namSinh);
       hocSinh.setSoDienThoai(soDienThoai);
       hocSinh.setNgayThangNamSinh(ngayThangNamSinh);
    }
}
