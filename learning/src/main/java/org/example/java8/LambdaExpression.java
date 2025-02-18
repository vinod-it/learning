package org.example.java8;

/**
 * We have 2 ways to use the interface method,
 * 1) we can implement the interface in a class
 * 2) we can create an Anonymous class(if its has only one use )
 */
interface NewInterface{
    void run();
}
//class Demo implements NewInterface{
//    /**
//     * Using class to implementing the run() method
//     */
//    @Override
//    public void run(){
//        System.out.println("Override method of interface");
//    }
//}
public class LambdaExpression {
    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.run();

            //OR

        NewInterface obj; // interface intentiation is allowed in java but not obj creation

        /**
         * When we have method in side a block of code, its called as class
         * so, here its a Anonymous class as it has no name
         */
//        obj = new NewInterface() {
//            @Override
//            public void run() {
//                System.out.println("Creating anonymous class ");
//            }
//        };
//        obj.run();

        //      OR

        /**
         * If we have already written the signature of the method than why we are
         * defining it again so, here in main method we can short the boiler code
         * (Feature introduced in java 8)
         */

//        obj = ()-> {
//            System.out.println("Creating anonymous class ");
//        };

        /**
         * And as it is a one line of code so we can erase the braces from it
         */

        obj = () -> System.out.println("Creating anonymous class ");
        // So this one line of code called a lambda expression
        // -> this ero indicates that "()" belongs to "System.out.println("Creating anonymous class ");"
        // If we have one parameter only, than we can write it like ( obj = i -> System.out.println("Creating anonymous class ");)
        // The use of lambda is , to avoid creating any inner class..
        obj.run();
    }
}
