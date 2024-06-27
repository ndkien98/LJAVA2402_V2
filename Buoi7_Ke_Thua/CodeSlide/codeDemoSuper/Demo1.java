package com.t3h.resource.kethua.codeDemoSuper;
class Vehicle1 {
    int speed = 50;
    public void run(){
        System.out.println("Vehicle1 is running..");
    }
}
class Bike2 extends Vehicle1 {
    int speed = 100;

    void display() {
        System.out.println(super.speed);//Sử dung super gọi tới biến
        super.run();
    }
    public static void main(String args[]) {
        Bike2 b = new Bike2();
        b.display();

    }
}
