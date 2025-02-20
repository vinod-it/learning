package org.example.java8;

import java.util.ArrayList;
import java.util.List;

public class TypeSafety {
    // Type safety use case
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19); // only integer types are allowed
        list.add(4);
       // list.add("vickey"); // compile time error : incompatible type

        for(Integer element:list){
            System.out.println(element);
        }
    }
}
