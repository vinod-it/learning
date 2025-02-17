package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

class Employee{
    protected double salary;
    public Employee(){

    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return  salary;
    }
}
class Bonus  {
    private final static int BONUS_RATE = 5; // constant value for each employee

    public void calculatingBonus(Employee emp){// Bonus calculation on the behalf of the salary of employee
        double bonus = emp.getSalary()*(BONUS_RATE/100.0);
        System.out.println("Employees bonus is "+bonus);

    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary of employee to get see the bonus amount");
        double salary = sc.nextDouble();
        Employee emp = new Employee();
        try{
            emp.setSalary(salary);
        }catch (InputMismatchException e){
            System.out.println(" Enter a valid input"+e.getMessage());
        }

        Bonus emp1 = new Bonus();
        emp1.calculatingBonus(emp);


    }
}