package buoi5.Bai1;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // b) Chỉ cho phép nhập vào số lớn hơn 0
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if (array[i] <= 0) {
                    System.out.println("Phần tử phải lớn hơn 0. Vui lòng nhập lại.");
                }
            } while (array[i] <= 0);
        }

        // a) Hiển thị danh sách đã nhập
        System.out.print("Danh sách đã nhập: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // c) Tính tổng các phần tử lẻ của danh sách số nguyên
        int sumOdd = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sumOdd += num;
            }
        }
        System.out.println("Tổng các phần tử lẻ: " + sumOdd);

        // d) Nhập vào một số bất kỳ => cho biết có bao nhiêu số giống với số vừa nhập
        System.out.print("Nhập vào một số bất kỳ: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        System.out.println("Số phần tử giống với số " + number + ": " + count);

        // e) Sắp xếp danh sách theo thứ tự từ bé đến lớn
        sortArrayAscending(array);
        System.out.print("Danh sách sau khi sắp xếp từ bé đến lớn: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // f) Sắp xếp danh sách theo thứ tự từ lớn đến bé
        sortArrayDescending(array);
        System.out.print("Danh sách sau khi sắp xếp từ lớn đến bé: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // g) Cho phép nhập vào một phần tử, xóa đi các phần tử trong mảng trùng với phần tử đã nhập
        System.out.print("Nhập phần tử cần xóa: ");
        int elementToRemove = scanner.nextInt();
        int[] newArray = removeElement(array, elementToRemove);
        System.out.print("Danh sách sau khi xóa phần tử " + elementToRemove + ": ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    private static void sortArrayAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void sortArrayDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static int[] removeElement(int[] array, int elementToRemove) {
        int count = 0;
        for (int num : array) {
            if (num == elementToRemove) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int num : array) {
            if (num != elementToRemove) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }
}
