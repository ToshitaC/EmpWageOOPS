package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_HOURS_PER_MONTH = 100;


    public static void main(String[] args) {
        Random random = new Random();
        int dailyEmpWage;
        int totalWage = 0;
        for (int i = 1; i <= 20; i++) {
            int totalWorkingHrs = 0;
            int totalWorkingDays = 0;

            while (totalWorkingHrs <= MAX_HOURS_PER_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
                totalWorkingDays++;
                double empCheck = (Math.floor(Math.random() * 10) % 3);
                switch ((int) empCheck) {
                    case 0:
                        System.out.println("Employee is present full day");
                        dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        System.out.println("Employee daily wage on day is :" + dailyEmpWage);
                        totalWage += dailyEmpWage;
                        totalWorkingHrs += FULL_DAY_HOUR;
                        break;
                    case 1:
                        System.out.println("Employee present for Halfday (part time)");
                        dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                        System.out.println("Employee wage is :" + dailyEmpWage);
                        totalWage += dailyEmpWage;
                        totalWorkingHrs += PART_TIME_HOUR;
                        break;
                    case 2:
                        System.out.println("Employee Absent for work on day");
                }
                System.out.println("Total Employee Wage  : " + totalWage);
                System.out.println("Number of Working Days:" + totalWorkingDays);
                System.out.println("Number of Working Hours:" + totalWorkingHrs);
            }
        }
    }
}

