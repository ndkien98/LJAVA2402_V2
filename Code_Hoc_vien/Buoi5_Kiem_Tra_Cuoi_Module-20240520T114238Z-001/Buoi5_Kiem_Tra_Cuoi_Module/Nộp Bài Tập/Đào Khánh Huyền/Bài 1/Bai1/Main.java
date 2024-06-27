package org.example.Exercises.Test.Bai1;

//
//Bài 1) Cho phép nhập vào n phần tử số nguyên. Thực hiện các yêu cầu sau
//a) hiển thị danh sách đã nhập
//b) chỉ cho phép nhập vào số lớn hơn 0
//c) Tính tổng các phần tử lẻ của danh sách số nguyên
//d) nhập vào một số bất kỳ => cho biết có bao nhiêu số giống với số vừa nhập
//e) sắp xếp danh sách theo thứ tự từ bé đến lớn
//f) sắp xếp danh sách theo thứ tự từ lớn đến bé
//g) cho phép nhập vào một phần tử, xóa đi các phần tử trong mảng trùng với phần tử đã nhập


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        int sumOdd = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if(array[i] <= 0) {
                    System.out.println("Vui lòng nhập phần tử lớn hơn 0!");
                }

            }while (array[i] <= 0);

        }

        System.out.print("Mảng sau khi đã nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
            if (array[i] % 2 != 0) {
                sumOdd += array[i];
            }
        }

        System.out.println("\nTổng các phần tử lẻ là: "+sumOdd);

        System.out.print("Nhập 1 số bất kì: ");
        int randomNumber = scanner.nextInt();
        int count = 0;
        boolean found = false;
        for(int i = 0; i < n; i++){
            if (array[i] == randomNumber) {
                count++;
                found = true;
            }
            else {
                found = false;
            }
        }

        if(found){
            System.out.println("Có tổng cộng " +count+ " giống với số vừa nhập");
        }else {
            System.out.println("Không có phần tủ nào giống với phần tử nhập vào");
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(array[i] > array[j]){
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sắp xếp từ bé đến lớn là: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(array[i] < array[j]){
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sắp xếp từ lớn đến bé là: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Nhập phần tử cần xóa: ");
        int x = scanner.nextInt();
        int[] newArray = new int[n];
        int newSize = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != x) {
                newArray[newSize++] = array[i];
            }
        }
        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();


    }
}
