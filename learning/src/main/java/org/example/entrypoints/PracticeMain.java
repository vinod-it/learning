package org.example.entrypoints;

import org.example.practice.Bonus;
import org.example.practice.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeMain {
    /**
     * Main method for entry point.
     *
     * @param args for cmd inputs
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary of employee to get see the bonus amount");
        double salary = sc.nextDouble();
        Employee emp = new Employee();
        try {
            emp.setSalary(salary);
        } catch (InputMismatchException e) {
            System.out.println(" Enter a valid input" + e.getMessage());
        }
        Bonus emp1 = new Bonus();
        emp1.calculatingBonus(emp);
    }
}
