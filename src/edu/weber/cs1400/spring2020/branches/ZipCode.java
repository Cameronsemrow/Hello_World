package edu.weber.cs1400.spring2020.branches;

import java.util.Scanner;

import static java.lang.System.exit;

public class ZipCode {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String zip;
        System.out.println("Enter a zip code: ");
        zip = stdIn.nextLine();
        int aInt = 10;
        if(zip.length() != 5){ // makes sure the zip is 5 digits long first
            System.out.println("invalid Zip code");
            exit(0);
        }
        switch(zip.charAt(0)){ // an int, or a character, or a String
            case '0':
            case '2':
            case '3':
                System.out.println(zip + " is on the East Coast.");
                break;
            case '4':
            case '5':
            case '6':
                System.out.println(zip + " is in the Central Plains area.");
                break;
            case '7':
                System.out.println(zip + " is in the South.");
                break;
            case '8':
            case '9':
                System.out.println(zip + " is in the West.");
            default:
                System.out.println(zip + " is an invalid ZIP Code.");
                break;
        }
    }
}
