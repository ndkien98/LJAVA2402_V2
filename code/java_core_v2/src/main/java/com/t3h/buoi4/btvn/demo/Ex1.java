package com.t3h.buoi4.btvn.demo;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // 1 3 4 4 4
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n= sc.nextInt();
        while( n < 3){
            System.out.println("n phải lớn hơn 3, nhập lại: ");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Nhập phần tử số "+(i+1)+" của mảng: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Mảng của bạn là: ");
        Ex1.hienThiMang(arr);

        while(true){
            System.out.println("\nMenu: ");
            System.out.println("1. Tính trung bình của mảng.");
            System.out.println("2. Tìm giá trị lớn nhất trong mảng.");
            System.out.println("3. Sắp xếp mảng theo thứ tự giảm dần");
            System.out.println("4. Sắp xếp mảng theo thứ tự tăng dần");
            System.out.println("5. In ra các phần tử xuất hiện 2 lần trong mảng.");
            System.out.println("6. Tìm số lớn thứ 3 trong mảng.");
            System.out.println("7. Tìm kiếm 1 số bất kỳ trong mảng.");
            System.out.println("8. Xóa đi 1 số trong mảng.");
            System.out.println("9. Thoát chương trình.");
            System.out.println("10: Hiển thị mảng ");

            System.out.println("Nhập lựa chọn của bạn: ");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    tinhTrungBinh(arr);
                    break;
                case 2:
                    timSoLonNhat(arr);
                    break;
                case 3:
                    sapXepGiamDan(arr);
                    break;
                case 4:
                    sapXepTangDan(arr);
                    break;
                case 5:
                    soXuatHienHaiLan(arr);
                    break;
                case 6:
                    timSoLonThuBa(arr);
                    break;
                case 7:
                    System.out.println("Nhập vào số cần tìm: ");
                    int so = new Scanner(System.in).nextInt();
                    if (timSoBatKy(so,arr)){
                        System.out.println("Tồn tại số " + so + " trong mảng");
                    }else {
                        System.out.println("Không tồn tại số: " + so + " trong mảng");
                    }
                    break;
                case 8:
                    xoaSo(arr);
                    break;
                case 9:
                    System.out.println("Chương trình kết thúc!");
                    return;
                case 10:
                    hienThiMang(arr);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại!");
            }
        }
    }
    // 4 4 4 1 1 1 2 2

    /**
     // 1 1 1 2 2 3
     */
    public static void xoaSo(int[] arr){
        System.out.println("Nhập vào số cần xóa: ");
        int soCanXoa = new Scanner(System.in).nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i] == soCanXoa){
                for (int j = i; j < arr.length; j++) {
                    if (j == arr.length - 1){
                        arr[j] = -1;
                    }else {
                        arr[j] = arr[j + 1];
                    }
                }
                i-=1;
            }
        }
    }
    // 4 4 4 1 1 1
    public static void timSoLonThuBa(int[] arr){
        // lọc ra các số trùng lặp trong mảng = target
        int[] mangSoKhongTrung = new int[arr.length];
        int soLuongSoKhongTrung = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!Ex1.timSoBatKy(arr[i],mangSoKhongTrung)){
                mangSoKhongTrung[soLuongSoKhongTrung] = arr[i];
                soLuongSoKhongTrung++;
            }
        }
        // sắp xếp mảng target
        for (int i = 0; i < soLuongSoKhongTrung; i++) {
            for (int j = i + 1; j < soLuongSoKhongTrung; j++) {
                if (mangSoKhongTrung[i] < mangSoKhongTrung[j]){
                    int tam = mangSoKhongTrung[i];
                    mangSoKhongTrung[i] = mangSoKhongTrung[j];
                    mangSoKhongTrung[j] = tam;
                }
            }
        }
        // tìm ra số lớn thứ 3
        if (soLuongSoKhongTrung < 3){
            System.out.println("Không tồn tại số lớn thứ 3");
        }else {
            System.out.println("Số lớn thứ 3 là: " + mangSoKhongTrung[2]);
        }
    }

    /**
     [] soDaTim;
     duyệt mảng:
     biến đếm
     nếu phần tử thứ j == i => đếm ++
     if(đếm == 2 && soDaTim không chứa j){
        đếm++;
        soDaTim.add(j)
     }
     in ra mảng soDaTim
     1 3 3 4 4 4

     */
    public static void soXuatHienHaiLan(int[] arr){
        int[] soDaTim = new int[arr.length];
        int dem=0;
        for (int i = 0; i < arr.length; i++) {
            dem=1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] && !Ex1.timSoBatKy(arr[i],soDaTim)){
                    dem++;
                }
            }
            if (dem == 2 ){
                soDaTim[i]=arr[i];
                System.out.println("Số xuất hiện hai lần là: " + arr[i]);
            }
        }
    }

    public static boolean timSoBatKy(int n,int[] arr){
        boolean timThay = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                timThay=true;
                break;
            }
        }
        return timThay;
    }
    public static void sapXepTangDan(int[] arr){
        int tam;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // nếu phần tử thứ i > phần tử thứ j => đổi chỗ hai phần tử
                if (arr[i] > arr[j]){
                    // đổi chỗ
                    tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần là là: ");
        Ex1.hienThiMang(arr);
    }
    public static void sapXepGiamDan(int[] arr){
        int tam;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // nếu phần tử thứ i < phần tử thứ j => đổi chỗ hai phần tử
                if (arr[i] < arr[j]){
                    // đổi chỗ
                    tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần là: ");
        Ex1.hienThiMang(arr);
    }
    public static void timSoLonNhat(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất là: " + max);
    }
    public static void tinhTrungBinh(int[] arr){
        float tong = 0;
        float tongTrungBinh = 0;
        for (int i = 0; i < arr.length; i++) {
            tong +=arr[i];
        }
        tongTrungBinh = (float) tong / arr.length;
        System.out.println("Tổng trung bình của mảng là: " + tongTrungBinh);
    }
    public static void hienThiMang(int[] arr){
        for(int num: arr){
            if (num >= 0){
                System.out.print( num +" ");
            }
        }
    }
}
