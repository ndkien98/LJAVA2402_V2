package com.t3h.buoi12;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        /**
         demo1:
            cho người dùng nhập vào n phần tử số nguyên.
         Đưa n số nguyên đó vào Set và List
         => hiển thị danh sách các phần tử trong Set và List
         List: sử dụng for i
         Set: Sử dụng forEch

         */
        System.out.println("Nhập vào n phần tử: ");
        int n = new Scanner(System.in).nextInt();

        List<Integer> listInteger = new ArrayList<>();
        Set<Integer> setInteger = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " cho List và Set");
            int data = (new Scanner(System.in)).nextInt();
            listInteger.add(data);
            setInteger.add(data);
        }
        System.out.println("Hiển thị danh sách dữ liệu trong List");
        for (int i = 0; i < listInteger.size(); i++) {
            int data = listInteger.get(i);
            System.out.println(data);
        }
        System.out.println("Hiển thị danh sách dữ liệu trong Set");
        for (Integer data: setInteger){
            System.out.println(data);
        }


    }
}
