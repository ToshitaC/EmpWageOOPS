package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    static final int WAGE_PER_HR = 20;
    static final int FULL_DAY_HR = 8;
    static final int PART_TIME_HR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_HRS_PER_MONTH = 100;
    static final int IS_FULL_TIME = 0;
    static final int IS_PART_TIME = 1;

    public void employeeWage() {
        Random random = new Random();
        int dailyEmpWage;
        int totalWage = 0;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;
        int empHours = 0;

        while (totalWorkingHrs < MAX_HRS_PER_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee present");
                    empHours = FULL_DAY_HR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee present part time");
                    empHours = PART_TIME_HR;
                    break;
                default:
                    System.out.println("Employee Absent on day");
                    empHours = 0;
            }
            totalWorkingHrs += empHours;
        }
        totalWage = totalWorkingHrs * WAGE_PER_HR;
        System.out.println("Total Wage: " + totalWage);
        System.out.println("total working hours: " + totalWorkingHrs);
        System.out.println("total working Days: " + totalWorkingDays);
    }

    public static void main(String[] args) {
        EmpWageCompOOPS empWage = new EmpWageCompOOPS();
        empWage.employeeWage();
    }
}