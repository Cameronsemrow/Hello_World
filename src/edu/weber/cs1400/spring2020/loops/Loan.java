package edu.weber.cs1400.spring2020.loops;

public class Loan {
    public static void main(String[] args) {
        int monthsToPay = 0;
        int loanToPay = 50000;

        while (loanToPay > 0){
            ++monthsToPay;
            loanToPay = loanToPay - 500;
        }
        System.out.println("It takes " + monthsToPay + " months to pay off.");
    }
}
