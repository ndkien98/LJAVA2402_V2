package Bai2;

public class Student {
    private String mhs;
    private String ten;
    private int tuoi;
    private String queQuan;
    private String namSinh;
    private String sdt;
    private String ngayThangNamSinh;

    public Student() {
    }

    public Student(String mhs, String ten, int tuoi, String queQuan, String namSinh, String sdt, String ngayThangNamSinh) {
        this.mhs = mhs;
        this.ten = ten;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.namSinh = namSinh;
        this.sdt = sdt;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getMhs() {
        return mhs;
    }

    public void setMhs(String mhs) {
        this.mhs = mhs;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mhs='" + mhs + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", ngayThangNamSinh='" + ngayThangNamSinh + '\'' +
                '}';
    }
}
