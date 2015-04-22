package com.sivasrinivas.java8;

import java.util.*;

/**
 * @author sivasrinivas
 */
public class Test implements Runnable{

    public static void main(String[] args) throws RuntimeException{
        Thread thread= new Thread(new Test());
        thread.start();
        System.out.println("End of the method");
    }

    @Override
    public void run() {
        System.out.println("run.");
        throw  new RuntimeException("Problem");
    }
}
