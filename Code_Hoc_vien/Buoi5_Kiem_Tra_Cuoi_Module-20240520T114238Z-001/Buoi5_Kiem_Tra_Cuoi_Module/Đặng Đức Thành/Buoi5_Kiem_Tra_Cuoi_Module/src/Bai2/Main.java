package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Student[] list = new Student[100];
    private int size = 0;

    public void HienThiHocSinh() {
        if (size == 0) {
            System.out.println("Danh sach hoc sinh trong");
        } else {
            for (int i = 0; i < size; i++) {
                if(list[i] != null){
                    System.out.println(list[i]);
                }
            }
        }
    }

    public void ThemHocSinh() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma hoc sinh: ");
        String mhs = scanner.nextLine();
        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap que quan: ");
        String queQuan = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        String namSinh = scanner.nextLine();
        System.out.println("Nhap sdt: ");
        String sdt = scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String ngayThangNamSinh = scanner.nextLine();

        Student student = new Student(mhs, ten, tuoi, queQuan, namSinh, sdt, ngayThangNamSinh);
        list[size++] = student;
        System.out.println("Hoc sinh da duoc them vao danh sach");
    }

    public void HienThiSinhVien23DN() {
        for (Student student : list) {
            if (student.getTuoi() == 23 && student.getQueQuan().equalsIgnoreCase("Da Nang")) {
                System.out.println(student);
            }
        }
    }

    public void TimTheoTenHoacNam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten/ nam sinh muon tiem kiem: ");
        String text = scanner.nextLine();

        for (Student student : list) {
            if (student.getTen().contains(text) || student.getNamSinh().equals(text)) {
                System.out.println(student);
            }
        }
    }

    public void XoaTheoIDvaTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma hoc sinh: ");
        String mhs = scanner.nextLine();
        System.out.println("Nhap vao ten: ");
        String ten = scanner.nextLine();
        boolean tim = false;

        for (int i = 0; i < size; i++) {
            Student student = list[i];
            if (student.getMhs().equalsIgnoreCase(mhs) && student.getTen().equalsIgnoreCase(ten)) {
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[i + 1];
                }
                size--;
                tim = true;
                System.out.println("Hoc sinh da duoc xoa");
                break;
            }
            if (!tim) {
                System.out.println("Khong tim thay hoc sinh da nhap");
            }
        }
    }

    public void updateHocSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma hoc sinh: ");
        String mhs = scanner.nextLine();

        for (Student student : list) {
            if (student.getMhs().equalsIgnoreCase(mhs)) {
                System.out.println("Nhap ten: ");
                student.setTen(scanner.nextLine());
                System.out.println("Nhap tuoi: ");
                student.setTuoi(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Nhap que quan: ");
                student.setQueQuan(scanner.nextLine());
                System.out.println("Nhap nam sinh: ");
                student.setNamSinh(scanner.nextLine());
                System.out.println("Nhap sdt: ");
                student.setSdt(scanner.nextLine());
                System.out.println("Nhap ngay sinh: ");
                student.setNgayThangNamSinh(scanner.nextLine());

            }
        }
        System.out.println("Khong tim thay hoc sinh da nhap");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------Menu------------");
            System.out.println("1. Hien thi danh sach hoc sinh");
            System.out.println("2. Them hoc sinh");
            System.out.println("3. Hien thi cac hoc sinh co tuoi la 23 va que o Da Nang");
            System.out.println("4. Tim kiem hoc sinh theo ten (hoac nam sinh)");
            System.out.println("5. Xoa hoc sinh(Xoa theo ma)");
            System.out.println("6. Update hoc sinh theo ma");
            System.out.println("7. Thoat");
            System.out.println("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    main.HienThiHocSinh();
                    break;
                case 2:
                    main.ThemHocSinh();
                    break;
                case 3:
                    main.HienThiSinhVien23DN();
                    break;
                case 4:
                    main.TimTheoTenHoacNam();
                    break;
                case 5:
                    main.XoaTheoIDvaTen();
                    break;
                case 6:
                    main.updateHocSinh();
                    break;
                case 7:
                    System.exit(1);
            }
        }
    }
}
