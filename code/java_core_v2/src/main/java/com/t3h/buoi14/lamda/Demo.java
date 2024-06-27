package com.t3h.buoi14.lamda;

public class Demo {

    public static void main(String[] args) {
        PhepCong phepCong = (a,b) -> a + b;
//        PhepCong phepCong = new PhepCong() {
//            @Override
//            public int tong(int a, int b) {
//                return a + b;
//            }
//        };
        System.out.println(phepCong.tong(1,2));

    }
}
