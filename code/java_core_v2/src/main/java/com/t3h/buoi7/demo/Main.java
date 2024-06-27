package com.t3h.buoi7.demo;

public class Main {

    public static void main(String[] args) {


        Bank shb = new SHB();
        shb.setBonus(100);
        Bank bidv = new Bidv();
        bidv.setBonus(100);
        Bank viettinbank = new Viettinbank();
        viettinbank.setBonus(100);
        System.out.println(shb.calculatorBonus());
        System.out.println(bidv.calculatorBonus());
        System.out.println(viettinbank.calculatorBonus());

    }
}
