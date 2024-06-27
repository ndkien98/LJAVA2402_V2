package com.t3h.buoi4.btvn;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n= sc.nextInt();
        while(n<3){
            System.out.println("n phải lớn hơn 3, nhập lại: ");
            n= sc.nextInt();
        }
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+"th element: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Mảng của bạn là: ");
        for(int num: arr){
            System.out.print(num+" ");
        }

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

            System.out.println("Nhập lựa chọn của bạn: ");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    average(arr);
                    break;
                case 2:
                    findMax(arr);
                    break;
                case 3:
                    increasing(arr);
                    break;
                case 4:
                    decreasing(arr);
                    break;
                case 5:
                    element2times(arr);
                    break;
                case 6:
                    find3stNumber(arr);
                    break;
                case 7:
                    findNumber(arr);
                    break;
                case 8:
                    deleteNumber(arr);
                    break;
                case 9:
                    System.out.println("Chương trình kết thúc!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Nhập lại!");
            }
        }



    }

    static void average(int[] arr){
        float tong = 0;
        for (int element: arr){
            tong+=element;
        }
        float average = (float) tong/ arr.length;

        System.out.println("The average is "+average);
    }
    static void findMax(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The max is "+max);
    }
    static void increasing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void decreasing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void element2times(int[] arr){
        System.out.println("Số xuất hiện 2 lần trong mảng là: ");
        int count=0;
        // 2 2 2 3
        for (int i=0; i< arr.length;i++){

            for (int j=i+1 ; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                    System.out.println(arr[i]+" ");
                }
            }

        }
        if(count==0){
            System.out.println("Không có phần tử nào xuất hiện 2 lần.");
        }
    }

    static void find3stNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Mảng sắp xếp giảm dần:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSố lớn thứ 3 trong mảng là: "+ arr[2]);
    }

    static void findNumber(int[] arr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số muốn tìm kiếm: ");
        int number = sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (arr[i]==number){
                list.add(i);
            }
        }
        if (!list.isEmpty()) {
            System.out.println("Số " + number + " được tìm thấy tại các index sau trong mảng:");
            for (int index : list) {
                System.out.println(index);
            }
        } else {
            System.out.println("Số " + number + " không được tìm thấy trong mảng.");
        }
    }

    static void deleteNumber(int[] arr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số muốn xóa: ");
        int numberToDelete= sc.nextInt();
        int count=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==numberToDelete){
                count++;
            }
        }
        int[] newArr= new int[arr.length-count];
        int newIndex= 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=numberToDelete){
                newArr[newIndex++]= arr[i];
            }
        }
        System.out.println("Mảng sau khi xóa số " + numberToDelete + ":");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
