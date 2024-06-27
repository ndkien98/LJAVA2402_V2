package lesson6.module1.ex02;

import java.util.Scanner;

public class QuanLiHocSinh {
    public HocSinh[] danhSachHocSinh;
    public int soLuongHocSinhHienTai ;


    public QuanLiHocSinh() {
        this.danhSachHocSinh = new HocSinh[5];
        this.soLuongHocSinhHienTai = 0;
    }
    public void tangKichThuocMang(){
        HocSinh[] newarr= new HocSinh[danhSachHocSinh.length +1] ;
        for(int i=0; i<danhSachHocSinh.length; i++){
            newarr[i]=danhSachHocSinh[i];
        }
        danhSachHocSinh=newarr;
    }
    public void themHocSinh(HocSinh newHocSinh) {
           if (soLuongHocSinhHienTai == danhSachHocSinh.length){
               tangKichThuocMang();
           }
            this.danhSachHocSinh[this.soLuongHocSinhHienTai] = newHocSinh;
           this.soLuongHocSinhHienTai++;
    }
    public void hienThiHocSinh() {
        if (soLuongHocSinhHienTai == 0) {
            System.out.println("Danh sách học sinh hiện tại đang trống.");
            return;
        }

        for (int i = 0; i < soLuongHocSinhHienTai; i++) {
            if (danhSachHocSinh[i] != null) {
                danhSachHocSinh[i].hienThiThongTin();
            }
        }
    }

    public void timTheoTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tên cần tìm kiếm");
        String ten = sc.nextLine();
        for (int i = 0; i < soLuongHocSinhHienTai; i++) {
            if (danhSachHocSinh[i] != null && danhSachHocSinh[i].getHoTen().toLowerCase().contains(ten.toLowerCase())) {
                danhSachHocSinh[i].hienThiThongTin();
                System.out.println("-----------------------");
            }
        }
    }
    public void timTheoTuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi de tim kiem: ");
        int tuoi = sc.nextInt();
        for (int i = 0; i<=soLuongHocSinhHienTai; i++){

            try {
                if(danhSachHocSinh[i] ==null)  {
                    System.out.println("Chua co hoc sinh nao can quan li.");
                }
            }catch (Exception e){
                if (danhSachHocSinh[i].getTuoi() == tuoi){
                    danhSachHocSinh[i].hienThiThongTin();
                    System.out.println("--------------------");
                }
            }

        }
    }
    public void hienThiHocSinh23TuoiQueDaNang() {
        for (int i = 0; i < soLuongHocSinhHienTai; i++) {
          try{  if(danhSachHocSinh[i] == null){
                System.out.println("Chua co hoc sinh nao que da nang");
          }
            }catch(Exception e){
              if (danhSachHocSinh[i].getTuoi() == 23 && danhSachHocSinh[i].getQueQuan().equalsIgnoreCase("Đà Nẵng")) {
                  danhSachHocSinh[i].hienThiThongTin();
                  System.out.println("-------------------");
              }
          }

        }
    }
    public void xoaHocSinh() {
        System.out.println("Nhap vao ma hoc sinh va ho ten: ");
        Scanner sc = new Scanner(System.in);
        int maHocSinh = sc.nextInt();
        sc.nextLine();
        String hoTen = sc.nextLine();
        boolean deleteSuccess = false;

        for (int i = 0; i < soLuongHocSinhHienTai; i++) {
            if (danhSachHocSinh[i].getMaHocSinh() == maHocSinh && danhSachHocSinh[i].getHoTen().toLowerCase().contains(hoTen.toLowerCase())) {

                for (int j = i; j < soLuongHocSinhHienTai - 1; j++) {
                    this.danhSachHocSinh[j] = this.danhSachHocSinh[j + 1];
                }
                this.danhSachHocSinh[soLuongHocSinhHienTai - 1] = null;
                this.soLuongHocSinhHienTai--;
                deleteSuccess = true;
                break;
            }
        }

        if (deleteSuccess) {
            System.out.println("Hoc sinh voi ma " + maHocSinh + " va ten " + hoTen + " xoa thanh cong.");
        } else {
            System.out.println("Không tìm thấy học sinh với mã và tên đã nhập.");
        }
    }
    public void chinhSuaThongTin(int maHocSinh){
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i< soLuongHocSinhHienTai; i++){
          if (danhSachHocSinh[i].getMaHocSinh() == maHocSinh){
              danhSachHocSinh[i].hienThiThongTin();

              System.out.println("Nhap ten moi: ");
              danhSachHocSinh[i].setHoTen(sc.nextLine());

              System.out.println(("nhap tuoi moi: "));
              danhSachHocSinh[i].setTuoi(sc.nextInt());
              sc.nextLine();

              System.out.println("Nhap que quan moi: ");
              danhSachHocSinh[i].setQueQuan(sc.nextLine());

              System.out.println("nhap thang sinh moi: ");
              danhSachHocSinh[i].setThangSinh(sc.nextInt());

              System.out.println("nhap nam sinh moi: ");
              danhSachHocSinh[i].setNamSinh(sc.nextInt());

              System.out.println("Nhap so dien thoai moi: ");
              danhSachHocSinh[i].setSoDienThoai(sc.nextLong());
          }
      }
    }
}
