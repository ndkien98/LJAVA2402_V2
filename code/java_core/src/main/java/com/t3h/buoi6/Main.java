package com.t3h.buoi6;

public class Main {

    public static void main(String[] args) {
        var s1 = "Java";
        var s2 = "Java";
        var s3 = "Ja".concat("va");
        var s4 = s3.intern();
        var sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
//        khi sb1.toString() thì sb1 có lấy chuỗi "Java" tại string bool không. Và tại sao System.out.println(sb1.toString() == s1); lại false

    }
}
