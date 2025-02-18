package org.example.java8;

import java.util.*;

public class Collections {
    /**
     * Generics comes in use most when working with collection api(collections framework)
     *
     * @param args t
     */
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Vickey");
        set.add("bob");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
