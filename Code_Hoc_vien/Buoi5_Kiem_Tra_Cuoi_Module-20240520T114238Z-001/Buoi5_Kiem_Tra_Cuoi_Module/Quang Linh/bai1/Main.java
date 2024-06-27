package com.linh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // a) Hiển thị danh sách đã nhập
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " (số nguyên lớn hơn 0): ");
                arr[i] = scanner.nextInt();
            } while (arr[i] <= 0); // b) Chỉ cho phép nhập vào số lớn hơn 0
        }
        System.out.println("Danh sách đã nhập: " + Arrays.toString(arr));

        // c) Tính tổng các phần tử của danh sách số nguyên
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Tổng các phần tử của danh sách: " + sum);

        // d) Nhập vào một số bất kỳ => cho biết có bao nhiêu số giống với số vừa nhập
        System.out.print("Nhập một số bất kỳ: ");
        int x = scanner.nextInt();
        int count = 0;
        for (int j : arr) {
            if (j == x) {
                count++;
            }
        }
        System.out.println("Có " + count + " số giống với số đã nhập.");

        // e) Sắp xếp danh sách theo thứ tự từ bé đến lớn
        Arrays.sort(arr);
        System.out.println("Danh sách sắp xếp từ bé đến lớn: " + Arrays.toString(arr));

        // f) Sắp xếp danh sách theo thứ tự từ lớn đến bé
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("Danh sách sắp xếp từ lớn đến bé: " + Arrays.toString(arr));

        // g) Cho phép nhập vào một phần tử, xóa đi các phần tử trong mảng trùng với phần tử đã nhập
        System.out.print("Nhập một phần tử để xóa: ");
        int y = scanner.nextInt();
        arr = Arrays.stream(arr).filter(val -> val != y).toArray();
        System.out.println("Danh sách sau khi xóa: " + Arrays.toString(arr));
    }
}
