package com.t3h.buoi14;

import com.t3h.buoi14.lamda.PhepCong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**

// - Biểu thức lamda
//    (a,b) -> a + b
 định nghĩa:
    là một cách triển khai rút gọn các method của functional interface,
    giúp cho code viết ngắn gọn hơn, ít tạo ra anonymous class

 functional interface: là các interface chỉ có một method abstract duy nhất ->đó là functional interface

 * */
public class Main4 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(5);
        list.add(1);
        // sắp xếp các phần tử từ bé đến lớp
//        Comparator comparator = new customComperator();
//        list.sort(comparator);
        // new Comparator() -> class vô danh (anonymous class)
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 > o2 ? 1 : -1;
//            }
//        };
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 > o2 ? 1 : -1;
//            }
//        });
        // (a,b) -> a - b : biểu thức lamda
        list.sort((a,b) -> a - b);
        System.out.println(list);




    }
}
