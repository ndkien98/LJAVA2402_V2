package Bai2;

public class HocSinh {
    private String maHocSinh;
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int namSinh;
    private String soDienThoai;
    private String ngayThangNamSinh;

    public HocSinh(){

    }

    public HocSinh(String maHocSinh, String hoTen, int tuoi, String queQuan, int namSinh, String soDienThoai, String ngayThangNamSinh) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
        this.soDienThoai = soDienThoai;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }
    public String getQueQuan(){
        return queQuan;
    }
    public int getTuoi(){
        return tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public void hienThiThongTin() {
        System.out.println("Mã học sinh: " + maHocSinh);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Ngày tháng năm sinh: " + ngayThangNamSinh);
        System.out.println("------------------------------------");
    }
}

