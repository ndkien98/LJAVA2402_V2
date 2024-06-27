package com.t3h.resource.kethua.codeDemoSuper;

class Vehicle3 {
    Vehicle3() {
        System.out.println("Vehicle is created");
    }
}

class Bike3 extends Vehicle3 {
    Bike3() {
        super();//gọi Constructor của lớp cha
        System.out.println("Bike is created");
    }
    public static void main(String args[]) {
        Bike3 b = new Bike3();
    }
}
