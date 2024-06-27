package org.example.buoi5;

import java.util.Date;
import java.util.Scanner;

public class QuanLyHocSinh {
    HocSinh[] hocSinhs = new HocSinh[3];

    public QuanLyHocSinh() {
        Date date = new Date();
        hocSinhs[0] = new HocSinh("001", "Quang", "17", "Hà Nội", date);
        hocSinhs[1] = new HocSinh("002", "Anh", "18", "Hải Dương", date);
        hocSinhs[2] = new HocSinh("003", "Minh", "19", "Quảng Ninh", date);

    }

    public void NhapSach() {
        Date date = new Date();
        int a = 0;
        do {
            System.out.println("Mời Bạn Nhập Chức Năng:");
            System.out.println("Nhập 1 Thêm Học Sinh");
            System.out.println("Nhập 2 Hiên thị Học Sinh Tên Quang Quê hải Dương ");
            System.out.println("Nhập 3 Tìm Kiếm Học Sinh Theo Tên tuổi ");
            System.out.println("Nhập 4 Xóa Học Sinh Theo Tên tuổi và tên ");
            System.out.println("Nhập 5 Thoát ");
            a = new Scanner(System.in).nextInt();
            switch (a) {
                case 1:
                    HocSinh hocSinh = new HocSinh();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Mời Bạn Nhập Mã HocSinh /n");
                    hocSinh.setMa(scanner.nextLine());
                    System.out.println("Mời Bạn Nhập Tên HocSinh /n");
                    hocSinh.setName(scanner.nextLine());
                    System.out.println("Mời Bạn tuổi /n");
                    hocSinh.setTuoi(scanner.nextLine());
                    System.out.println("Mời Bạn Nhập Quê Quán HocSinh /n");
                    hocSinh.setQueQuan(scanner.nextLine());
                    hocSinh.setNgaySinh(date);

                    hocSinhs = QuanLyHocSinh.addHocSinh(hocSinhs, hocSinh);

                    System.out.println("------------Thông tin Học Sinh----------");
                    for (HocSinh hocSinh1 : hocSinhs) {
                        System.out.println(hocSinh1);
                    }

                    break;
                case 2:
                    System.out.println("------------Thông tin Học Sinh----------");
                    for (HocSinh hocSinh1 : hocSinhs) {
                        if(hocSinh1.getTuoi().equals("18") &&hocSinh1.getQueQuan().equals("Hải Dương")){
                            System.out.println(hocSinh1);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mời Bạn Nhập tên học Sinh");
                    String ten = new Scanner(System.in).nextLine();
                    System.out.println("Mời Bạn Nhập Tuoi học Sinh");
                    String tuoi = new Scanner(System.in).nextLine();
                    System.out.println("------------Thông tin Học Sinh----------");
                    for (HocSinh hocSinh1 : hocSinhs) {
                       if(hocSinh1.getTuoi().contains(tuoi) || hocSinh1.getName().contains(ten)){
                           System.out.println(hocSinh1);
                       }
                    }
                    break;
                case 4:
                    System.out.println("Mời Bạn ma  học Sinh");
                    String ma = new Scanner(System.in).nextLine();
                    System.out.println("Mời Bạn Nhập Tên học Sinh");
                    String ten2 = new Scanner(System.in).nextLine();
                    hocSinhs = QuanLyHocSinh.removeHocSinh(hocSinhs, ma,ten2);
                    System.out.println("------------Thông tin Học Sinh----------");
                    for (HocSinh hocSinh1 : hocSinhs) {
                        System.out.println(hocSinh1);
                    }
                    break;

            }

        } while (a != 5);

    }

    public static HocSinh[] addHocSinh(HocSinh[] saches, HocSinh newSach) {
        // Tạo một mảng mới với kích thước lớn hơn mảng ban đầu một đơn vị
        HocSinh[] newBooks = new HocSinh[saches.length + 1];
        // Sao chép các phần tử từ mảng ban đầu sang mảng mới
        for (int i = 0; i < saches.length; i++) {
            newBooks[i] = saches[i];
        }
        // Thêm cuốn sách mới vào vị trí cuối cùng của mảng mới
        newBooks[newBooks.length - 1] = newSach;
        // Trả về mảng mới
        return newBooks;
    }
    public static HocSinh[] removeHocSinh(HocSinh[] hocSinhs, String maHocSinh,String ten) {
        // Tạo một mảng mới có kích thước nhỏ hơn một đơn vị so với mảng ban đầu
        HocSinh[] newSaches = new HocSinh[hocSinhs.length - 1];

        int newIndex = 0;

        // Duyệt qua mảng ban đầu để sao chép các phần tử vào mảng mới, loại bỏ phần tử có mã sách cần xóa
        for (int i = 0; i < hocSinhs.length; i++) {
            // Nếu mã sách của cuốn sách hiện tại không trùng khớp với mã sách cần xóa
            if (!hocSinhs[i].getMa().equals(maHocSinh) &&!hocSinhs[i].getName().equals(ten) ) {
                // Sao chép cuốn sách hiện tại vào mảng mới
                newSaches[newIndex] = hocSinhs[i];
                // Tăng chỉ số của mảng mới
                newIndex++;
            }
        }

        // Trả về mảng mới sau khi xóa cuốn sách
        return newSaches;
    }


}






