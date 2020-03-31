package edu.weber.cs1400.spring2020.userDefinedMethods;
import java.util.Scanner;

public class InClassCodingPart3 {

    // Method to prompt for and input an integer
    public static int promptForInteger(Scanner input, String userPrompt) {

        int userInt;

        System.out.println(userPrompt);
        userInt = input.nextInt();

        return userInt;
    }

    // Method to get a value from one table based on a range in the other table
    public static double getCorrespondingTableValue(int search, int [] baseTable, double [] valueTable) {

        // the tax rate should be returned at the end of the method
        // baseTable: salary base table
        // valueTable: tax base table
        int i;
        int tempVal = 0;
        for(i = 0; i < baseTable.length; ++i){

            if(search < baseTable[i]){
                tempVal = i;
                break;
            }
        }
        return valueTable[tempVal];
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int annualSalary = 0;
        double taxRate;
        int taxToPay;
        int i;

        int [] salaryBase = { 20000,     50000,     100000,     999999999 };
        double [] taxBase = {   .10,       .20,        .30,           .40 };



        String promptUser = "\nEnter annual salary  (0 to exit): ";
        
        annualSalary = promptForInteger(scnr,promptUser);



        while (annualSalary > 0) {
            taxRate = getCorrespondingTableValue(annualSalary, salaryBase,  taxBase);

            taxToPay= (int)(annualSalary * taxRate);  // Truncate tax to an integer amount
            System.out.println("Annual salary: " + annualSalary +
                    "\tTax rate: " + taxRate +
                    "\tTax to pay: " + taxToPay);

            // Get the next annual salary

            annualSalary = promptForInteger(scnr,promptUser);
        }
    }
}