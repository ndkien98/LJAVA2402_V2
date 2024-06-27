package org.example.buoi5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HocSinh {
  private String ma;
  private String name;
  private String tuoi;
  private String queQuan;
  private Date ngaySinh;

    public HocSinh(String ma, String name, String tuoi, String queQuan, Date ngaySinh) {
        this.ma = ma;
        this.name = name;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public HocSinh() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        // Sử dụng SimpleDateFormat để định dạng ngày tháng
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String ngaySinhs = (ngaySinh != null) ? sdf.format(ngaySinh) : "N/A";

        return "Book{" +
                "ma='" + ma + '\'' +
                ", name='" + name + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", queQuan=" + queQuan +
                ", ngaySinh=" + ngaySinhs +
                '}';
    }
}
