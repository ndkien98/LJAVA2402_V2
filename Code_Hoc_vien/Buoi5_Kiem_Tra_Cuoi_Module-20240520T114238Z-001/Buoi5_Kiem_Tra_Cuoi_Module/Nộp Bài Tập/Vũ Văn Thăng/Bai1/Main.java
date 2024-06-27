package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng.");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " (số nguyên lớn hơn 0): ");
                int input = sc.nextInt();

                if (input > 0) {
                    array[i] = input;
                    break;
                } else {
                    System.out.println("Số nhập vào phải lớn hơn 0. Vui lòng nhập lại.");
                }
            }
        }
      while (true){
          System.out.println("\n=====MENU=====");
          System.out.println("1. Hiển thị danh sách.");
          System.out.println("2. Tính tổng các sô lẻ trong mảng.");
          System.out.println("3. Tìm trong mảng số giống với 1 số bất kỳ.");
          System.out.println("4. Sắp xếp mảng tăng dần.");
          System.out.println("5. Sắp xếp mảng giảm dần.");
          System.out.println("6. Xóa các phần tử giống với 1 số bất kỳ.");
          System.out.println("7. Thoát chương trình.");

          System.out.println("\n Nhập lựa chọn của bạn: ");
          int choice = sc.nextInt();
          switch (choice) {
              case 1:
                  System.out.println("Mảng đã nhập là: ");
                  hienThiDanhSach(array);
                  break;
              case 2:
                  TongCacSoLe(array);
                  break;
              case 3:
                  TimSoGiongNhau(array);
                  break;
              case 4:
                  SapXepTangDan(array);
                  break;
              case 5:
                  SapXepGiamDan(array);
                  break;
              case 6:
                  XoaMotPhanTu(array);
                  break;
              case 7:
                  System.out.println("Chương trình kết thúc.");
                  return;
              default:
                  System.out.println("Lựa chọn không hợp lệ.");
          }
      }
    }
    static void hienThiDanhSach(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    static void TongCacSoLe(int[] arr){
        int tong =0;
        for(int i: arr){
            if(i%2!=0){
                tong+=i;
            }
        }
        System.out.println("Tổng các số lẻ trong mảng là: "+tong);
    }
    static void TimSoGiongNhau(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm: ");
        int n=sc.nextInt();
        int count = 0;
        for(int i : arr){
            if(i==n){
                count++;
            }
        }
       if(count==0){
           System.out.println("Không có số nào giống với "+n+" trong mảng.");
       }else{
           System.out.println("Có "+count+" số giống với "+n+" trong mảng.");
       }
    }
    static void SapXepTangDan(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sắp xếp tăng dần là: ");
        hienThiDanhSach(arr);
    }
    static void SapXepGiamDan(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sắp xếp giảm dần là: ");
        hienThiDanhSach(arr);
    }
    static void XoaMotPhanTu(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp 1 số muốn xóa: ");
        int n = sc.nextInt();
        int count =0;
        for(int i: arr){
            if(i==n){
                count++;
            }
        }
       if(count==0){
           System.out.println("Số "+n+" không có trong mảng nên không thể xóa.");
       }else{
           int[] newArray = new int[arr.length-count];
           int newIndex = 0;
           for(int i=0; i<newArray.length; i++){
               if(arr[i]!=n){
                   newArray[newIndex++] = arr[i];
               }
           }
           System.out.println("Mảng sau khi đã xóa số "+n+" là: ");
           hienThiDanhSach(newArray);
       }
    }
}
