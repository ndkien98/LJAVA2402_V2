package com.t3h.buoi8.demo;

public class Dog extends Animal {

    private String canNang;

    public String getCanNang() {
        return canNang;
    }

    public void setCanNang(String canNang) {
        this.canNang = canNang;
    }

    @Override
    public void tiengKeu() {
        System.out.println("Gou Gou");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "canNang='" + canNang + '\'' +
                '}';
    }
}