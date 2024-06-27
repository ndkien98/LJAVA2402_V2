package com.t3h.buoi7.demo;

public class Bidv extends Bank{

    public Bidv() {
        super();
        super.setRate(0.8f);
    }

    @Override
    public float calculatorBonus() {
        return super.getRate() * super.getBonus();
    }



}
