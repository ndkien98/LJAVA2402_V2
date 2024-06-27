package com.t3h.buoi7;

public class Developer extends Employee{
    private float bonus;
    public Developer() {
        super();
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "bonus=" + bonus +
                ", address='" + address + "" + super.getSalary() + "" +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
