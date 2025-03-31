package org.example.core_java.exceptionhandling;

class MyException extends Exception{
    @Override
    public  String toString(){
        return "Area can not be negative";
    }

    @Override
    public String getMessage(){
        return "Radius can not negative";
    }
}

public class CustomeException{
    // if we throw any new excp. inside the method then we have to use throws keyword in method body
    public static void areaOfCircle(int r)throws MyException{
        if(r<0){
            // To stop the program where r is less then 0 as area can not be negative
            throw new MyException();
        }
        double result = Math.PI*r*r;
        System.out.println(Math.round(result));
    }
    public static void main(String[] args) {
        // We have to handle the MyException before calling the method
        try {
            areaOfCircle(4);
        } catch (MyException e) {
            System.out.println(e.getMessage()); // Message which is overrided in MyException class
        }

    }
}
