package baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.printf("Hãy Nhập Vào Số n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Nhập Vào " +n + " Số Nguyên:%n");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Số " + (i + 1) + ":");
            int x = sc.nextInt();
            // Chỉ Cho Phép Nhập Số Lớn Hơn 0
            while (x <= 0){
                System.out.printf("Số Nguyên Phải Lớn Hơn 0,Vui Lòng Nhập Lại:");
                x = sc.nextInt();
            }
            array[i] = x;
        }

        //Hien Thi Danh Sach Da Nhap
        System.out.printf("Danh Sách Đã Nhập :");
        danhSachSoNguyen(array);

        //Tong Cac So Le
        System.out.printf("%nTổng Các Phần Tử Lẻ Là: " + tongCacSoLe(array));

        //Nhap 1 So Bat Ky
        System.out.printf("%nNhập 1 Số Bất Kỳ:");
        int number = sc.nextInt();
        while (number <= 0){
            System.out.printf("Số Nguyên Phải Lớn Hơn 0,Vui Lòng Nhập Lại:");
            number = sc.nextInt();
        }
        System.out.printf("Có " + soGiongNhau(array,number) + " Số Giống Số Vừa Nhập");

        //Sap Xep Tang Dan
        sapXepTangDan(array);
        System.out.printf("%nDanh Sách Sắp Xếp Tăng Dần: ");
        danhSachSoNguyen(array);

        //Sap Xep Giam Dan
        sapXepGiamDan(array);
        System.out.printf("%nDanh Sách Sắp Xếp Giảm Dần: ");
        danhSachSoNguyen(array);
        //Nhap Vao 1 So Va Xoa Cac Phan Tu Giong
        System.out.printf("%nNhập Vào 1 Số Bất Kỳ:");
        int count = sc.nextInt();
        while (count <= 0){
            System.out.printf("Số Nguyên Phải Lớn Hơn 0,Vui Lòng Nhập Lại:");
            count = sc.nextInt();
        }
        array = xoaPhanTuGiong(array,count);
        System.out.printf("Danh Sách Số Nguyên Mới Là:");
        danhSachSoNguyen(array);
    }
    private static void danhSachSoNguyen(int[] arr){
        for (int danhsach : arr){
            System.out.printf(" " + danhsach);
        }
    }
    private static int tongCacSoLe(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1){
                sum += arr[i];
            }
        }
        return sum;
    }
    private static int soGiongNhau(int[] arr, int n){
        int same = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                same ++;
            }
        }
        return same;
    }
    private static void sapXepTangDan(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }
    }
    private static void sapXepGiamDan(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }
    }
    private static int[] xoaPhanTuGiong(int[] arr,int number){
        int soGiongNhau = soGiongNhau(arr,number);
        int count =0;
        int[] arrayNew = new int[arr.length - soGiongNhau];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != number){
                if(count < arr.length - soGiongNhau){
                    arrayNew[count] = arr[i];
                    count++;
                }
            }
        }
        return arrayNew;
    }
}
