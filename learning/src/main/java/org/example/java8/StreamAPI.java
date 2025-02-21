package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPI{
    /*
     *Streams are Lazy : stream operations(filtering,mapping,transforming) will not work,
     * until any Terminal operation (forEach(),collect(),reduce(),count()..) get called
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(21,41,10,45,51,37,7);

        // method reference
        list.forEach(System.out::println);


        // Stream() api
        list.stream().forEach(System.out::println);


        /*
         *  Here, there are number of mutation happening which cause the software slow
         so, to reduce the mutation and increase the concurrency here we can use steam()
         */
        //    int result = 0;
        //    for (int i :list){
        //     result = result +i*2;
        //    }

        //    System.out.println(result);

        /*
         * Doing the same operation with internal iteration
         * Using method stream to get the obj of Stream interface , and
         map() [lazy function] - for calculation condition
         reduce() [Terminal function] for to perform the operation newly built steam of map() and return a single result (here it is addition)
         */
        System.out.println(list.stream()
                .map(i->i*2) // [lazy function - will not work until gets any TERMINAL operation]
                .reduce(0,(c,e)->c+e)); // Terminal operation


        /*
         * Filter() : returns true or false

         */
        System.out.println(list.stream()
                .filter(i->i%2==0)  // [lazy function ]
                .reduce(0,Integer::sum)); //c+e = Integer.sum(a,b) = Integer::sum (method reference)


        /*
         * findFirst().orElse() [Terminal function]: Returns first value of given stream
         *  Ex. "Optional[22]" if filter condition is true and "Optional.empty" if it's not true
         * If we do not want this "Optional", we can use .orElse() after the findFirst() in syntax
         */

        System.out.println(list.stream()
                .filter(i->i%2==0)
                .findFirst()); // output - Optional[22]

        System.out.println(list.stream()
                .filter(i->i%2==0)
                .findFirst() // Terminal function
                .orElse(0)); // 0 (if there is no even number as per filter method)


        /*
         * This experiment show that lazy function are more effective
         */
        System.out.println(list.stream()
                .filter(StreamAPI::isDivisible)
                .map(StreamAPI::mapDouble)
                .findFirst()
                .orElse(0));

    }
    public static boolean isDivisible(Integer e){
        System.out.println("In side isDivisible method "+e);
        return e%2 == 0;
    }
    public static int mapDouble(int i) {
        System.out.println("In side mapDouble method "+i);
        return i*2;
    }
}
