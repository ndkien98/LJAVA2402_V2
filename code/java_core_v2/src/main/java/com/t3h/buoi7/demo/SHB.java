package com.t3h.buoi7.demo;

public class SHB extends Bank{
    public SHB() {
        super();
        super.setRate(1);
    }
    @Override
    public float calculatorBonus() {
        return super.getRate() * super.getBonus();
    }
}
