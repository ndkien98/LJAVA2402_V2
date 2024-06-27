package com.t3h.NguyenNgocHai.bai1;

import java.util.Scanner;

public class Bai1 {
    /**
    Bài 1) Cho phép nhập vào n phần tử số nguyên. Thực hiện các yêu cầu sau
    a) hiển thị danh sách đã nhập
    b) chỉ cho phép nhập vào số lớn hơn 0
    c) Tính tổng các phần tử nẻ của danh sách số nguyên
    d) nhập vào một số bất kỳ => cho biết có bao nhiêu số giống với số vừa nhập
    e) sắp xếp danh sách theo thứ tự từ bé đến lớn
    f) sắp xếp danh sách theo thứ tự từ lớn đến bé
    g) cho phép nhập vào một phần tử, xóa đi các phần tử trong mảng trùng với phần tử đã nhập
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int num;
                System.out.println("nhập phần tử thứ " + (i + 1) + "(lớn hơn 0: )");
                num = sc.nextInt();
            while (num<=0){
                System.out.println("n nhỏ hơn 0, nhập lại:");
                num = sc.nextInt();
            };
            arr[i] = num;
        }
        System.out.println("Danh sách đã nhập:");
        Bai1.hienThiDanhSach(arr);

        while (true){
            System.out.println("Menu");
            System.out.println("1.tổng phần tủ lẻ là :");
            System.out.println("2.số giống nhau:");
            System.out.println("3.từ bé đến lớn: ");
            System.out.println("4.từ lớn đến bé:");
            System.out.println("5.xóa phần tử giống đã nhập");

            System.out.println("Mời bạn chọn:");
            int nhap = sc.nextInt();
            switch (nhap){
                case 1:
                    phanTuLe(arr);
                    break;
                case 2:
                    System.out.println("Bạn hãy nhập số bất kì:");
                    int soCanTim=sc.nextInt();
                    int soGiongNhau= soLanGiongNhau(arr,soCanTim);
                    System.out.println("Số "+soCanTim+" xuất hiện "+soGiongNhau+" lần giống số đã nhập");

                    break;
                case 3:
                    beDenLon(arr);
                    break;
                case 4:
                    lonDenBe(arr);
                    break;
                case 5:
                    System.out.println("nhập phần tử xóa:");
                    int xoaSo=sc.nextInt();
                    int[] ketQua= xoaPanTu(arr,xoaSo);
                    System.out.println("sau khi xóa số "+xoaSo+" , mảng mới là :");
                    hienThiDanhSach(ketQua);
                    break;
                default:
                    System.out.println("Không hợp lệ, nhập lại !");
            }
        }

    }
    public static int[] xoaPanTu(int[] arr, int xoaSo) {
        int so = 0;
        for (int num : arr) {
            if (num != xoaSo) {
                so++;
            }
        }
        int[] mangMoi = new int[so];
        int index = 0;
        for (int num : arr) {
            if (num != xoaSo) {
                mangMoi[index++] = num;
            }
        }
        return mangMoi;
    }
    public static void lonDenBe(int[] arr) {
        int tang;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tang = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tang;
                }
            }
        }
        System.out.println("Sau sắp xếp ta được  : ");
        hienThiDanhSach(arr);
    }
    public static void beDenLon(int[] arr){
        int giam;
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    giam=arr[i];
                    arr[i]=arr[j];
                    arr[j]=giam;
                }
            }
        }
        System.out.println("Sau sắp xếp ta được : ");
        hienThiDanhSach(arr);
    }

    public static int soLanGiongNhau(int[] arr, int soCanTim){
        int dem=0;
        for(int num: arr){
            if (num ==soCanTim){
                dem++;
            }
        }
        return dem;
    }
    public static void phanTuLe(int[] arr){
        int sum = 0;
        for(int num : arr){
            if (num % 2 !=0){
                sum += num;
            }
        }
        System.out.println("Tinh tổng ta đc:"+sum);
    }
    public static void hienThiDanhSach(int[] arr){
        for(int num : arr){
            System.out.println(num+" ");
        }
    }

}
