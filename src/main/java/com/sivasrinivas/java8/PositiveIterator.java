package com.sivasrinivas.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sivasrinivas
 * @date 8/17/16
 */
public class PositiveIterator {
    private final Iterator<Integer> iterator;

    private Integer nextPos = -1;

    public PositiveIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        while (iterator.hasNext() && (nextPos=iterator.next())<0) {
            //no op
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        list.add(2);
        list.add(-2);
        list.add(0);
        list.add(-4);
        list.add(-1);
        list.add(-9);
        list.add(5);
        list.add(6);
        list.add(-6);

        PositiveIterator positiveIterator = new PositiveIterator(list.iterator());

        while (positiveIterator.hasNext()) {
            System.out.println(positiveIterator.next());
        }
    }

    public boolean hasNext() {
        return nextPos > -1;
    }

    public Integer next() {
        int temp = nextPos;

        while (iterator.hasNext() && (nextPos = iterator.next())<0) {
                // no op
        }
        if (temp < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return temp;
    }
}
