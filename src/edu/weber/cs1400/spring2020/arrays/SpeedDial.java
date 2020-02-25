package edu.weber.cs1400.spring2020.arrays;

import java.util.Scanner;

public class SpeedDial {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String [] phoneNumber = new String[101];
        String input;
        int i = 0;
        int j;

        System.out.println("Type in a phone number (such as 801-555-1234 or 8015551234), enter ‘q’ to quit.");
        input = scnr.nextLine();

        while (!input.equals("q")) {
            phoneNumber[i] = input;
            ++i;
            System.out.println("Type in a phone number (such as 801-555-1234 or 8015551234), enter ‘q’ to quit.");
            phoneNumber[i] = scnr.nextLine();
        }
        --i;
        for (i = i; i >= 0; --i) {
            System.out.println(phoneNumber[i]);
        }
    }
}
