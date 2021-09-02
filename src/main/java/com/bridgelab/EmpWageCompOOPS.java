package com.bridgelab;

import java.util.Random;

public class EmpWageCompOOPS {
    public static void main(String[] arg){
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == 0) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent ");
        }
    }
}