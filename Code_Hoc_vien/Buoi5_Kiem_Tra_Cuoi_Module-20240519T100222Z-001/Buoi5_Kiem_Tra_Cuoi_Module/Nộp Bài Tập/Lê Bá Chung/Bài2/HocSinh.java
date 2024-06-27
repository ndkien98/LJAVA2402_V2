package com.javaweb.bai2;

public class HocSinh {
    private String maHocSinh;
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int namSinh;
    private long soDienThoai;
    private String ngayThangNamSinh;

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public String getHoTen() {
        return hoTen;
    }


    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public int getNamSinh() {
        return namSinh;
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

    public void setSoDienThoai(long soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public HocSinh(String maHocSinh, String hoTen, int tuoi, String queQuan, int namSinh, long soDienThoai, String ngayThangNamSinh) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
        this.soDienThoai = soDienThoai;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "maHocSinh='" + maHocSinh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh=" + namSinh +
                ", soDienThoai=" + soDienThoai +
                ", ngayThangNamSinh=" + ngayThangNamSinh +
                '}';
    }
}

