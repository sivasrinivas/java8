package com.sivasrinivas.java8.interfaces;

import com.sivasrinivas.java8.interfaces.CalculatorInterface;
import com.sivasrinivas.java8.interfaces.SimpleInterface;

/**
 * @author sivasrinivas
 */
public class InterfaceMain {

    public static void main(String[] args) {

        //Declare interface variable and implement single abstract method
        SimpleInterface simpleInterface = (str) -> {
            System.out.println("Hello " + str + "!");
        };
        //calling single abstract method
        simpleInterface.print("Siva");

        //Declare interface variable and implement single abstract method
        CalculatorInterface calculatorInterface = (a, b) -> {
            int sum = a + b;
            System.out.format("Sum of %d and %d is %d", a, b, sum);
        };
        //calling single abstract method
        calculatorInterface.sum(2, 3);
    }
}

