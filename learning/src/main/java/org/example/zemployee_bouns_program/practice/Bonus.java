package org.example.zemployee_bouns_program.practice;

import static org.example.zemployee_bouns_program.utils.Constants.BONUS_RATE;

public class Bonus {
    // constant value for each employee

    public void calculatingBonus(Employee emp) {
        // Bonus calculation on the behalf of the salary of employee
        double bonus = emp.getSalary() * (BONUS_RATE / 100.0);
        System.out.println("Employees bonus is " + bonus);
    }
}
