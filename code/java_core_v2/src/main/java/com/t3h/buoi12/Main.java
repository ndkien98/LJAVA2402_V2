package com.t3h.buoi12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Kien");
        p1.setId(1);

        Person p2 = new Person();
        p2.setName("Kien");
        p2.setId(1);

        Person p3 = new Person();
        p2.setName("Kien");
        p2.setId(1);

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);

        Set<Person> personSet = new HashSet<Person>();
        personSet.add(p1);
        personSet.add(p2);
        System.out.println("a");

        people.remove(p3);
        personSet.remove(p3);

        people.remove(p2);
        personSet.remove(p2);
        System.out.println("a");
    }
}
