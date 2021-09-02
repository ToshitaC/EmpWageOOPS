package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;


    public static void main(String[] args) {
        Random random = new Random();
        int dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        double empCheck = (Math.floor(Math.random() * 10) % 3);
        switch ((int) empCheck) {
            case 0:
                System.out.println("Employee is present for full day ");
                dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employee daily wage: " + dailyEmpWage);
                break;
            case 1:
                System.out.println("Employee present for Part time");
                dailyEmpWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee wage: " + dailyEmpWage);
                break;
            case 2:
                System.out.println("Employee Absent");
        }
    }
}



