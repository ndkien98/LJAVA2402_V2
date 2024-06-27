package com.t3h.resource.kethua.codeDemoSuper;

class Person2 {
    void message() {
        System.out.println("welcome");
    }
}
class Student17 extends Person2 {
    void display() {
        message();// goi toi phuong thuc lop ca
    }
    public static void main(String args[]) {
        Student17 s = new Student17();
        s.display();
    }
}
