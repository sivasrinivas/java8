package com.sivasrinivas.java8.stream;

import java.util.Random;
import java.util.function.IntPredicate;

/**
 * @author sivasrinivas
 */
public class RandomStream {

    public static void main(String[] args) {
        IntPredicate exitPred = (v) -> {
            Integer value = (Integer)v;
            if(value <= 10) {
                return true;
            } else {
                return false;
            }
        };
//        new Random().ints().filter(exitPred).forEach(i -> System.out.println(i));
        new Random().ints(0, 100).forEach(i -> System.out.println(i));
    }
}
