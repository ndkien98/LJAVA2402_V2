package com.t3h.buoi8.demo;


import java.util.Scanner;

/**
 - Ép kiểu lên(Upcasting)
 + ép từ đối tượng kiểu con(subclass) lên đối tượng kiểu cha(supperclass)
 - Ép kiểu xuống(Downcasting)
 + ép kiểu từ đối tượng cha(supperclass) xuống kiểu con(sublcass)

 Bài tập
    cho nhập vào danh sách các động vật.
    cho lựa chọn người dùng có thể nhập vào là Dog hoặc Cat tùy ý.

 */
public class Animal {
    private String name;

    public void tiengKeu(){
        System.out.println("Động vật đang kêu");
    }
}

