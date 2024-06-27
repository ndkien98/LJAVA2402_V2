package com.t3h.buoi10.demoex;

public class Demo2 {
    public static void main(String[] args) {
        try {
            int arr2[] = new int[5];
            arr2[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task2 is completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }
    }
}
