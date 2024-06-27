package com.t3h.resource.kethua;

public class Main {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.getSalary());
        System.out.println("Bonus of Programmer is: " + p.bonus);
    }
}
class Employee {
   private float salary = 1000;
   String address = "HN";

    public float getSalary() {
        return salary;
    }
}
class Programmer extends Employee {
    int bonus = 150;
}
