package lesson6.module1.ex02;

import java.util.Scanner;

public class HocSinh {
    private int maHocSinh;
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int namSinh;
    private long soDienThoai;
    private int thangSinh;


    public HocSinh() {

    }
    public HocSinh(int maHocSinh, String hoTen, int tuoi, String queQuan, int namSinh, long soDienThoai, int thangSinh) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.thangSinh = thangSinh;
        this.namSinh = namSinh;
        this.soDienThoai = soDienThoai;

    }

    public  void themHocSinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma hoc sinh ");
        this.maHocSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Moi nhap ho va ten : ");
        this.hoTen = sc.nextLine();
        System.out.println("Moi nhap tuoi : ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Moi nhap queQuan : ");
        this.queQuan = sc.nextLine();
        System.out.println("Moi nhap thangSinh : ");
        this.thangSinh = sc.nextInt();
        System.out.println("Moi nhap namSinh : ");
        this.namSinh = sc.nextInt();
        System.out.println("Moi nhap soDienThoai : ");
        this.soDienThoai = sc.nextLong();



    }


    public void hienThiThongTin(){
        System.out.println(this.toString());
    }
    public int getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public long getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(long soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getThangSinh() {
        return thangSinh;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "maHocSinh=" + maHocSinh +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", namSinh=" + namSinh +
                ", soDienThoai=" + soDienThoai +
                ", thangSinh=" + thangSinh +
                '}';
    }

    public void setThangSinh(int thangSinh) {
        this.thangSinh = thangSinh;
    }
}
