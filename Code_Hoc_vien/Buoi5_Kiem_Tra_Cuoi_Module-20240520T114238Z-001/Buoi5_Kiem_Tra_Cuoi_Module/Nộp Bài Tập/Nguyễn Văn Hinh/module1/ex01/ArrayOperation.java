package lesson6.module1.ex01;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mòi nhâpj vào số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i< arr.length; i++){
            System.out.println("Nhập phần tử số "+(i+1)+" của mảng: ");
            arr[i] = sc.nextInt();
        }
int choice;
        while(true){
            System.out.println("\nMENU");
            System.out.println("1. tính tổng số lẻ");
            System.out.println("2. hien thị mảng");
            System.out.println("3. đêms số phần tử");
            System.out.println("4.sắp xếp mảng tăng ");
            System.out.println("5. Sắp xếp mảng giam");
            System.out.println("6. xoa 1 phan tưr trong mảng");
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("0. thoát chương trình");

            choice = sc.nextInt();
            switch(choice){
                case 1:
                    ArrayOperation.hienThiMang(arr);
                    break;
                case 2:
                    System.out.println(ArrayOperation.tongSoLe(arr));
                    break;
                case 3:
                    int x = sc.nextInt();
                    ArrayOperation.demSoPhanTu(arr,x);
                    break;
                case 4:
                    ArrayOperation.sapXepTang(arr);
                    ArrayOperation.hienThiMang(arr);

                    break;
                case 5:
                    ArrayOperation.sapXepGiam(arr);
                    ArrayOperation.hienThiMang(arr);

                    break;
                case 6:
                    ArrayOperation.xoaPhanTu1(arr);

                    break;
                case 0:
                    return;


                default:
                    System.out.println("dữ liệu không hợp lệ vui lòng nhập lại");


            }

        }
    }

    public static float tongSoLe(int[] arr){
        float sum = 0.0f;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 1){
                 sum += arr[i];
            }
        }
        return sum;
    }

    public static void hienThiMang(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void demSoPhanTu(int[] arr, int x){
        int dem = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                dem++;
            }
        }
        System.out.println("So phan tử " + x + " xuat hien trong mang so lan la: " +dem);
    }

    public static void sapXepTang(int[] arr){
        int n = arr.length;
        for(int i = 0; i< arr.length; i++){
            int min_index = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;

                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void sapXepGiam(int[] arr){
        int n = arr.length;
        for (int i = 0; i< arr.length; i++){
            int max_index = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] > arr[max_index]){
                    max_index = j;
                    int temp = arr[max_index];
                    arr[max_index] = arr[i];
                    arr[i] = temp;
                }
            }

        }
    }

    public static void xoaPhanTu1(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vao phan tu muon xoa : ");
        int k = scanner.nextInt();
        int n, i, c;

       //4 5 3 7 3
        for (c = i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }

        n = c;

        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    //    public static void xoaPhanTu(int[] arr){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào phần tử bạn muốn xóa trong mảng: ");
//        int n = sc.nextInt();
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] == n){
//                for(int j = i; j<arr.length; j++){
//                    if(arr[j] == arr.length -1){
//                        arr[j] =-1;
//                    }
//                    else{
//                        arr[j] = arr[j+1];
//                    }
//                }
//                i-=1;
//                System.out.println("phan tu " + n + "duoc xoa thanh cong");
//            }
//        }
//    }

}



