package com.sivasrinivas.java8.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sivasrinivas
 */
public class ListsMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("stirng1");
        strings.add("stirng2");
        strings.add("string3");
        strings.add("string4");

        System.out.println("*** For each loop ***");
        //traditional for each loop
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("*** Iterator interface ***");
        //using Iterator interface
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("*** Lambda expression ***");
        //lambda expression and forEach method
        //Consumer class is a target for lambda expression, which takes an input and returns void
        strings.forEach(str -> System.out.println(str));
    }
}
