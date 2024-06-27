package com.t3h.buoi15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList();
        integerList.add(1);
//        integerList.add("string");
        Integer data =  integerList.get(0);

        List<String> stringList = new ArrayList();
        stringList.add("A");
//
        List<Boolean> booleanList = new ArrayList();
        booleanList.add(true);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");

        ListCustom<String> listCustom = new ListCustom();
        listCustom.setData("string");
        System.out.println(listCustom.getData());

        ListCustom<Integer> listCustomInt = new ListCustom<>();
        listCustomInt.setData(1);
        System.out.println(listCustomInt.getData());


    }
}
