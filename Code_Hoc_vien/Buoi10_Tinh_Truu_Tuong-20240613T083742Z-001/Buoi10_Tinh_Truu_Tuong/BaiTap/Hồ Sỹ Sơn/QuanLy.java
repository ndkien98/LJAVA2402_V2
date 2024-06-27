package com.t3h.buoi10.baitap;

import com.t3h.buoi10.baitap.animal.Bird;
import com.t3h.buoi10.baitap.animal.Dog;
import com.t3h.buoi10.baitap.animal.Fish;
import com.t3h.buoi10.baitap.machine.Car;
import com.t3h.buoi10.baitap.machine.Plane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuanLy {
    private AnimalAbstract[] danhSachDongVat = new AnimalAbstract[100];
    private int soLuongDongVat = 0;
    private MachineAbstract[] danhSachMay = new MachineAbstract[100];
    private int soLuongMay = 0;


    //Thêm động vật.
    public void themDongVat(AnimalAbstract animalAbstract){
        if (soLuongDongVat < danhSachDongVat.length){
            danhSachDongVat[soLuongDongVat++] = animalAbstract;
        }else {
            System.out.println("Danh sách đã đầy.");
        }
    }
    //Sửa động vật
    public void suaDongVat(String id){
        for (int i = 0; i < soLuongDongVat; i++) {
            if (danhSachDongVat[i].getId().equals(id)){
                danhSachDongVat[i].nhapThongTin();
                danhSachDongVat[i].hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy động vật với id: "+id);
    }
    //Tìm động vật
    public void timDongVat(String ten){
        for (int i = 0; i < soLuongDongVat; i++) {
            if (danhSachDongVat[i].getTen().contains(ten)){
                danhSachDongVat[i].hienThiThongTin();
            }
        }
    }
    //Hienr thị dv
    public void hienThiDongVat(){
        if (soLuongDongVat == 0){
            System.out.println("Danh sách động vật rỗng.");
        }else {
            for (int i = 0; i < soLuongDongVat; i++) {
               
                danhSachDongVat[i].hienThiThongTin();
            }
        }
    }
    //Thêm máy
    public void themMay(MachineAbstract machineAbstract){
        if (soLuongMay < danhSachMay.length){
            danhSachMay[soLuongMay++] = machineAbstract;
        }else {
            System.out.println("Danh sách đã đầy.");
        }
    }
    //Sửa tt máy
    public void suaThongTinMay(String id){
        for (int i = 0; i < soLuongMay; i++) {
            if (danhSachMay[i].getId().equals(id)){
                danhSachMay[i].nhapThongTin();
                danhSachMay[i].hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy máy với id: "+id);
    }
    //Tìm máy theo tên
    public void timKiemMay(String ten){
        for (int i = 0; i < soLuongMay; i++) {
            if (danhSachMay[i].getTen().contains(ten)){
                danhSachMay[i].hienThiThongTin();
            }
        }
    }
    public void hienThiMayMoc(){
        if (soLuongMay == 0){
            System.out.println("Danh sách máy móc rỗng.");
        }else {
            for (int i = 0; i < soLuongMay; i++) {
                danhSachMay[i].hienThiThongTin();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        while (true) {
            try {
                System.out.println("===MENU====");
                System.out.println("1.Thêm thông tin.");
                System.out.println("2.Sửa thông tin.");
                System.out.println("3.Tìm kiếm thông tin.");
                System.out.println("4.Hiển thị thông tin.");
                System.out.println("5.Thoát chương trình.");
                System.out.println("Nhập lựa chọn: ");
                int luaChon = scanner.nextInt();
                scanner.nextLine();
                switch (luaChon) {
                    case 1:
                        System.out.println("Chọn loại: " + "1.Động vật." + "2.Máy móc.");
                        int loai = scanner.nextInt();
                        scanner.nextLine();
                        if (loai == 1) {
                            System.out.println("Chọn loại động vật: " + "1.Chó." + "2.Chim." + "3.Cá.");
                            int loaidv = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập ID: ");
                            String id = scanner.nextLine();
                            System.out.println("Nhập tên: ");
                            String ten = scanner.nextLine();
                            System.out.println("Nhập màu lông: ");
                            String mauLong = scanner.nextLine();
                            if (loaidv == 1) {
                                System.out.println("Nhập màu đuôi:");
                                String mauDuoi = scanner.nextLine();
                                Dog dog = new Dog(id, ten, mauLong, mauDuoi);
                                quanLy.themDongVat(dog);
                            } else if (loaidv == 2) {
                                System.out.println("Nhập loại hạt: ");
                                String loaiHat = scanner.nextLine();
                                Bird bird = new Bird(id, ten, mauLong, loaiHat);
                                quanLy.themDongVat(bird);
                            } else if (loaidv == 3) {
                                System.out.println("Nhập vùng biển: ");
                                String vungBien = scanner.nextLine();
                                Fish fish = new Fish(id, ten, mauLong, vungBien);
                                quanLy.themDongVat(fish);
                            } else {
                                System.out.println("Nhập sai.");
                            }
                        } else if (loai == 2) {
                            System.out.println("Chọn loại máy móc: " + "1.Xe." + "2.Máy bay.");
                            int loaimay = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhập id: ");
                            String id = scanner.nextLine();
                            try{
                                System.out.println("Nhập ngày sản xuất:");
                                String ngaySanXuat = new Scanner(System.in).nextLine();
                                System.out.println("Ngày sản xuất vừa nhập là: "+ Integer.parseInt(ngaySanXuat));
                                System.out.println("Nhập hãng: ");
                                String hang = scanner.nextLine();
                                System.out.println("Nhập tên: ");
                                String ten = scanner.nextLine();
                                if (loaimay == 1) {
                                    try {
                                        System.out.println("Nhập ngày hết đăng kiểm: ");
                                        String ngayHetDangKiem = scanner.nextLine();
                                        System.out.println("Ngày hết hạn đăng kiểm vừa nhập là: "+Integer.parseInt(ngayHetDangKiem));
                                        Car car = new Car(id, ngaySanXuat, hang, ten, ngayHetDangKiem);
                                        quanLy.themMay(car);
                                    }catch (NumberFormatException e){
                                        System.out.println("Nhập sai format số.");
                                    }

                                } else if (loaimay == 2) {
                                    System.out.println("Nhập sân bay: ");
                                    String sanBay = scanner.nextLine();
                                    Plane plane = new Plane(id, ngaySanXuat, hang, ten, sanBay);
                                    quanLy.themMay(plane);
                                } else {
                                    System.out.println("Nhập sai.");
                                }

                            }catch (NumberFormatException e){
                                System.out.println("Nhập sai fomat số.");
                            }


                        } else {
                            System.out.println("Nhập sai.Vui lòng chọn lại.");
                        }
                        break;
                    case 2:
                        System.out.println("Chọn loại:" + "1.Động vật." + "2.Máy móc.");
                        int chon = scanner.nextInt();
                        scanner.nextLine();
                        if (chon == 1) {
                            System.out.println("Nhập ID động vật cần sửa: ");
                            String idDongVat = scanner.nextLine();
                            quanLy.suaDongVat(idDongVat);
                        } else if (chon == 2) {
                            System.out.println("Nhập ID máy móc cần sửa: ");
                            String idMay = scanner.nextLine();
                            quanLy.suaThongTinMay(idMay);
                        } else {
                            System.out.println("Chọn sai.");
                        }
                        break;
                    case 3:
                        System.out.println("Chọn loại:" + "1.Động vật." + "2.Máy móc.");
                        int chon1 = scanner.nextInt();
                        scanner.nextLine();
                        if (chon1 == 1) {
                            System.out.println("Nhập tên động vật cần tìm kiếm:");
                            String tenDV = scanner.nextLine();
                            quanLy.timDongVat(tenDV);
                        } else if (chon1 == 2) {
                            System.out.println("Nhập tên máy móc cần tìm kiếm: ");
                            String tenMM = scanner.nextLine();
                            quanLy.timKiemMay(tenMM);
                        } else {
                            System.out.println("Chọn sai.");
                        }
                        break;
                    case 4:
                        System.out.println("Chọn loại:" + "1.Động vật." + "2.Máy móc.");
                        int chon2 = scanner.nextInt();
                        scanner.nextLine();
                        if (chon2 == 1){
                            quanLy.hienThiDongVat();
                        } else if (chon2 == 2) {
                            quanLy.hienThiMayMoc();
                        }else {
                            System.out.println("Nhập sai.");
                        }
                        break;
                    case 5:
                        System.out.println("Chương trình kết thúc.");
                        return;
                    default:
                        System.out.println("chọn sai!");
                }
            }catch (InputMismatchException e){
                System.out.println("Dữ liệu nhập vào không hợp lệ.");
                scanner.nextLine();
            }
        }
    }
}
