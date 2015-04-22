package com.sivasrinivas.java8.interfaces;

/**
 * @author sivasrinivas
 */
public class RunnableMain {

    public static void main(String[] args) {
        //using lambda expression
        Runnable r1 = () -> {
            System.out.println("Running thread 1...");
        };
        new Thread(r1).start();

        //using anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running thread 2...");
            }
        }).start();
    }
}
