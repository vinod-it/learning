package org.example.java8.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    /**
     * We can use iterator() to Iterate on different data structure
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(5); // duplicate values are allowed in list interface

        Iterator i = list.iterator(); //Iteration by iterator obj

        while (i.hasNext()) System.out.println(i.next());
    }
}
