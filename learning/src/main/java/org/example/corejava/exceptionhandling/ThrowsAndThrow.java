package org.example.corejava.exceptionhandling;


class NotNegativeSalary extends Exception{
    @Override
    public String getMessage(){
        return "Salary should be positive";
    }
}

class Employees{
    public static int BONUS_PERCENTAGE = 8;

    public void calculateBonus(int salary) throws NotNegativeSalary{ // We have to indicate that this method may show an exception so, while calling it should be handled
        if(salary<0){
            // salary must be positive so user must enter a valid input
            //if not , then program will stop here only
            throw new NotNegativeSalary();
        }
        int bonus = (salary*BONUS_PERCENTAGE)/100;
        System.out.println("Your bouns is "+bonus);
    }
}
public class ThrowsAndThrow {
    /*
    Throws - We use throws keyword to indicate that, method can make an
    exception so handle that.

    Throw - Throw keyword used to explicitly pass an exception if any certain condition
    meet. It also used when we want to pass a custom exception
     */
    public static void main(String[] args) {
        Employees emp1 = new Employees();
        try{
            emp1.calculateBonus(20000);
        }catch (NotNegativeSalary e){
            System.out.println(e.getMessage());
        }


    }
}
