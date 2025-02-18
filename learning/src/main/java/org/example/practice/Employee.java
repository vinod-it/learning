package org.example.practice;

public class Employee {
    protected double salary;

    /**
     * Default Constructor
     */
    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    /**
     * setter
     *
     * @param salary double value
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}