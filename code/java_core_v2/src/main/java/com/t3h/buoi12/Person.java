package com.t3h.buoi12;

public class Person {

    private int id;
    private String name;

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Person)obj).id;
    }

//    @Override
//    public int hashCode() {
//        return Integer.hashCode(this.id);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
