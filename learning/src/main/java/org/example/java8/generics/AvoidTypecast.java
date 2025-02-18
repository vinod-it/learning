package org.example.java8.generics;

import java.util.ArrayList;
import java.util.List;
public class AvoidTypecast {
    public static void main(String[] args) {
        //WithoutGenerics newObj = new WithoutGenerics();
        //newObj.printObj();

        WithGenerics obj = new WithGenerics();
        obj.print();
    }
}
class WithoutGenerics{
    Object obj ;
    // String newStr = obj; //error: incompatible types: Object cannot be converted to String


    public void printObj(){
        System.out.println(obj);
    }
}
class WithGenerics{

    public void print(){
        List<String> newStr = new ArrayList<>();
        newStr.add("hello");
        String str = newStr.get(0);
        System.out.println(str);
    }
}
class Wildcard{
    
}