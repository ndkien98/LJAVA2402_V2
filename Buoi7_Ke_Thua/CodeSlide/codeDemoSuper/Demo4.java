package com.t3h.resource.kethua.codeDemoSuper;

class Person {
    void message() {
        System.out.println("Person welcome");
    }
}

class Student16 extends Person {
    void message() {
        System.out.println("Student16 welcome to java");
    }
    void display() {
        message();// gọi phương thức message() của lớp hiện tại
        super.message();// gọi phương thức message() của lớp cha
    }
    public static void main(String args[]) {
        Student16 s = new Student16();
        s.display();
    }
}
