package edu.weber.cs1400.spring2020.loops;

import java.util.Scanner;

public class TaxRatesTable {
    public static void main(String[] args) {
        Scanner userNum = new Scanner(System.in);
        int annualSalary;
        int i;
        double taxRate;
        double taxToPay;
        int maxAnnualSalary;
        int minAnnualSalary;
        System.out.println("Enter an annual salary (press a number equal to or less then 0 to exit)");
        annualSalary = userNum.nextInt();

        while (annualSalary > 0) {

            System.out.println("Enter an annual salary (press a number equal to or less then 0 to exit)");
            annualSalary = userNum.nextInt();


            if (annualSalary > 0 && annualSalary <= 20000) {
                taxRate = .1;
                taxToPay = annualSalary * taxRate;
                System.out.println(taxToPay);

            } else if (annualSalary > 20000 && annualSalary <= 50000) {
                taxRate = .2;
                taxToPay = annualSalary * taxRate;
                System.out.println(taxToPay);

            } else if (annualSalary > 50000 && annualSalary <= 100000) {
                taxRate = .3;
                taxToPay = annualSalary * taxRate;
                System.out.println(taxToPay);

            } else {
                taxRate = .4;
                taxToPay = annualSalary * taxRate;
                System.out.println(taxToPay);

            }
        }

        System.out.println("Annual Salary\tTax Rate\t\tTax to pay");
        double tableTaxRate = .1;
        double tableTaxToPay;
        for (i = 10000; i <= 110000; i = i + 20000) {
            tableTaxToPay = tableTaxRate * i;
            System.out.println("Salary: " + i + "\tTax Rate: " + tableTaxRate + "\tTax to pay: " + tableTaxToPay);
            tableTaxRate = tableTaxRate + .1; //hi
        }
    }
}

