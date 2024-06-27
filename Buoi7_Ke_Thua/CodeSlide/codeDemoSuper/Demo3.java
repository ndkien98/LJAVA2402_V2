package com.t3h.resource.kethua.codeDemoSuper;

class Vehicle6 {
    Vehicle6() {
        System.out.println("Vehicle is created");
    }
}
class Bike6 extends Vehicle6 {
    int speed;

    Bike6(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }
    public static void main(String args[]) {
        Bike6 b = new Bike6(10);
    }
}
