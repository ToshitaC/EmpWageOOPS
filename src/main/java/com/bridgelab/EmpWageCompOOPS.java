package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == 0) {
            System.out.println("Employee is present for work ");
            int dailyEmpWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee daily wage: " + dailyEmpWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
    }
