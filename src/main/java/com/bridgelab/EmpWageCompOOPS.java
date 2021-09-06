package com.bridgelab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpWageCompOOPS {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    // private static CompanyInfo[] companyInfoArray = new CompanyInfo[3];
    List<Company_Info> listCompany = new ArrayList<Company_Info>();
    public static Map<String, Company_Info> companyInfoMap = new HashMap<String, Company_Info>();

    private int numOfCompany = 0;

    public static int computeEmpWage(Company_Info companyInfo) {
        int empHrs = 0;
        int totalWage = 0;
        int totalHrs = 0;

        int day = 1;
        while (day <= companyInfo.getNoOfWorkingDays() && totalHrs < companyInfo.getMaxHrsPerMonth()) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyInfo.getEmpRatePerHr();

            totalHrs += empHrs;
            totalWage += empWage;
            day++;
        }
        return totalWage;
    }

    public static void main(String[] args) {
        EmpWageCompOOPS employeeWageBuilder = new EmpWageCompOOPS();
        employeeWageBuilder.addCompanyEmpWage("Dmart", 20, 6, 10);
        employeeWageBuilder.addCompanyEmpWage("JIO", 27, 16, 10);
        employeeWageBuilder.addCompanyEmpWage("Airtel", 27, 16, 10);


        employeeWageBuilder.computeEmpWage();
// for (int i = 0; i < companyInfoArray.length; i++) {
// System.out.println(companyInfoArray[i]);
// }
        System.out.println("Map:" + companyInfoMap);

        System.out.println(companyInfoMap.get("Dmart"));

    }

    public void addCompanyEmpWage(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        Company_Info companyInfo = new Company_Info(companyName, empRatePerHr, noOfWorkingDays, maxHrsPerMonth);
// companyInfoArray[numOfCompany] = companyInfo;
        listCompany.add(companyInfo);


    }

    public void computeEmpWage() {
        for (int i = 0; i < listCompany.size(); i++) {
            int totalWage = EmpWageCompOOPS.computeEmpWage(listCompany.get(i));
            listCompany.get(i).setTotalWage(totalWage);
            companyInfoMap.put(listCompany.get(i).getCompanyName(), listCompany.get(i));
        }

    }

}