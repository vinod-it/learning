package org.example.java8;
import java.util.Arrays;
import java.util.List;
public class MethodReference {
    /**
     * Method Reference :- when we use a method as a reference , is called method reference
     * in lambda expression , we put method as reference along with double colon with the method's class name
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,6,89,23,76);

         /*
         * Here we are giving method reference (println) in this
         * lambda expression with its classes (System.out)
         */
        list.forEach(System.out::println);
    }
}

