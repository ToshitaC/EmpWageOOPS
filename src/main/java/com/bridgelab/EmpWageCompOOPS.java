package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;


    public static void main(String[] args) {
        Random random = new Random();
        int dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        int empCheck = random.nextInt(3);
        if (empCheck == 0) {
            System.out.println("Employee is present");
            System.out.println("Employee daily wage: "+dailyEmpWage);
            System.out.println("Employee is present Full day ");
            System.out.println("Employee daily wage: " + dailyEmpWage);
        } else if (empCheck == 1) {
            System.out.println("Employee present for Part time");
            dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee wage: "+dailyEmpWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}


