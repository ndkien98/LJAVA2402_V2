package com.t3h.buoi13;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**

    SortedSet:


 */
public class Main2 {

    public static void main(String[] args) {

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2);
        System.out.println("listInteger: " + listInteger);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.add(1);
        sortedSet.add(1);
        System.out.println("sortedSet: " + sortedSet);

    }
}
