package com.t3h.buoi8.demo;

public class Cat extends Animal {
    private String mauLong;

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meo meo");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "mauLong='" + mauLong + '\'' +
                '}';
    }
}