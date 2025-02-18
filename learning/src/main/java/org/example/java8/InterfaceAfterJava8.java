package org.example.java8;

interface DemoInterface{
    // every method in an interface is public abstract by default
    void show();

    default void print(){ // After java 8, it is allowed to have method body of default method
        System.out.println("Default method of an interface");
    }

    static void run(){   // After java 8, it is allowed to have method body of static method
        System.out.println("static method of interface");
    }
}
public class InterfaceAfterJava8 implements DemoInterface {
   @Override
    public void show(){
        System.out.println("Overriding interface's method in class");
    }
    /**
     * Interface was in java from starting, and it was defined that, interface will have
     * only methods declaration not methods definition (body)
     * but in java 8(v1.8), we allowed to make the method body by using keyword
     * "static" and "Default".
     */
    public static void main(String[] args) {
        InterfaceAfterJava8 obj = new InterfaceAfterJava8();

        obj.show(); // override method
        obj.print(); // default method of interface

        DemoInterface.run();// static method bonded with class only, so no need of class obj
    }
}
