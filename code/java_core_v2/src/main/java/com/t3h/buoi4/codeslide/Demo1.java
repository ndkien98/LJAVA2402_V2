package com.t3h.buoi4.codeslide;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length; // length = 5
        int[] copy = numbers.clone(); // Sao chép mảng numbers vào mảng copy


        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array1, array2); // isEqual = true

    }
}
