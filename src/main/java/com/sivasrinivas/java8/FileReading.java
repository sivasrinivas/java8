package com.sivasrinivas.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author sivasrinivas
 * @date 8/17/16
 */
public class FileReading {
    public static void main(String[] args) {
        System.out.println("***Streams***\n");
        //Read given file using stream
        try {
            Files.lines(Paths.get("src/main/resources/input.txt"))
                    .map(line -> line.trim()) //trim each line
                    .filter(line -> !line.startsWith("first")) //filter out
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("***Try-with-resources***\n");
        //try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
