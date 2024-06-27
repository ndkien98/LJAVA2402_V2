package com.t3h.buoi2;

public class Main2 {
    public static void main(String[] args) {
        int tongSoPhim = 80;
        int soLuongPhimTrongMotTrang = 25;
        int tongSoPage = Main2.tinhTongSoPagePhim(tongSoPhim,soLuongPhimTrongMotTrang);
        System.out.println(tongSoPage);
        // lấy ra chỉ số của các phim của page số 3
        /**
         vd: page số 1: có các phim từ 1-25
         cách tính khoảng số của page số 3 là bao nhiêu
         */
        int chiSoTrang = 1;
//        // lấy ra danh sách các bộ phim tại page số 3?
//        int start = ((chiSoTrang - 1) * soLuongPhimTrongMotTrang) + 1;
//        int end = chiSoTrang * soLuongPhimTrongMotTrang;
        Main2.hienThiDanhSachCacPhim(chiSoTrang,soLuongPhimTrongMotTrang,tongSoPhim);

    }
    // 3,25,80
    public static void hienThiDanhSachCacPhim(int chiSoTrang,int soLuongPhimTrongMotTrang,int tongSoPhim){
        int start = ((chiSoTrang - 1) * soLuongPhimTrongMotTrang) + 1 ;
        int end = chiSoTrang * soLuongPhimTrongMotTrang;
        if (end > tongSoPhim){
            end = tongSoPhim;
        }
        System.out.println("Danh sách các phim sẽ trong khoảng: " + start + " -> " + end);
    }
    public static int tinhTongSoPagePhim(int tongSoPhim,int soLuongPhimTrongMotTrang){
        int tongSoTrang = tongSoPhim / soLuongPhimTrongMotTrang; // 80 /25 = 3
        int soDuPhim = tongSoPhim % soLuongPhimTrongMotTrang; // 80 % 25 = 5
        // nếu biểu thức soDuPhim > 0 = true => thực thi đoạn code trong ngoặc kép
        // nếu soDuPhim > 0 = false => thực thi đoạn code trong else
        if(soDuPhim > 0){
            tongSoTrang = tongSoTrang + 1;
        }else {
            System.out.println("Số lượng phim không dư");
        }
        return tongSoTrang;
    }
}
