package buoi5.Bai2;

public class HocSinh {
    private String maHocSinh;
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int namSinh;
    private String soDienThoai;
    private String ngaySinh;

    public HocSinh(String maHocSinh, String hoTen, int tuoi, String queQuan, int namSinh, String soDienThoai, String ngaySinh) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
    }

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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getNgaySinh() {
        return ngaySinh;
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

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "maHocSinh='" + maHocSinh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh=" + namSinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
