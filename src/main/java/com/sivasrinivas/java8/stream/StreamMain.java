package com.sivasrinivas.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author sivasrinivas
 */
public class StreamMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(8);

        System.out.println("Print using stream ");
        //Run through the stream and print all members of the list
        list.stream().forEach(i -> System.out.println(i));

        System.out.println("Print using parallel stream ");
        list.parallelStream().forEach(i -> System.out.println(i));

        Predicate<Integer> matchPred = (v) -> {
            if(v.compareTo(5) <=0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Print all elements which satisfies the matching condition");
        //Print all elements matching 'matchPred'
        list.stream().filter(matchPred).forEach(i -> System.out.println(i));
    }
}
