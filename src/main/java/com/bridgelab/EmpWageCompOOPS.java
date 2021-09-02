package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_DAYS = 20;


    public static void main(String[] args) {
        Random random = new Random();
        int dailyEmpWage;
        int totalWage = 0;
        for (int i = 1; i <= 20; i++) {
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            switch ((int) empCheck) {
                case 0:
                    System.out.println("Employee is present for work full day");
                    dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee daily wage on day  " + i + " is :" + dailyEmpWage);
                    totalWage += dailyEmpWage;
                    break;
                case 1:
                    System.out.println("Employee present for part time");
                    dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee wage on day: " + i + " is :" + dailyEmpWage);
                    totalWage += dailyEmpWage;
                    break;
                case 2:
                    System.out.println("Employee Absent for work on day: "+i);
            }
            System.out.println("Total Employee Wage for 20 is : " + totalWage);
        }
    }
}


