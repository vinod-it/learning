package org.example.java8.iteration;

import java.util.HashSet;
import java.util.Set;

public class LambdaExpr {
    public static void main(String[] args) {
        // set has no insertion order, duplication not allowed
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Life");
        set.add("looks");
        set.add("different");
        set.add("World"); // will not part of output : duplication not allowed

        set.forEach(System.out::println);//Using Lambda Expression with a Collection (forEach)
        //set.forEach(i -> System.out.println(i)); // Consumer interface
    }
}
