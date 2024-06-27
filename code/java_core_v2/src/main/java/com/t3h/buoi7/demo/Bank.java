package com.t3h.buoi7.demo;

public class Bank {

    private float salary;
    private float bonus;
    private float rate;

    public float calculatorSalary(float salary,float rate){
        return (salary + bonus ) * rate;
    }

    public long calculatorSalary(long salary){
        return (long) ((salary + bonus ) * rate);
    }

    public float calculatorBonus(){
        return bonus;
    }
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
