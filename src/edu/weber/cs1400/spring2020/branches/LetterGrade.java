package edu.weber.cs1400.spring2020.branches;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String Letter;
        System.out.println("Enter a letter grade.");
        Letter = stdIn.nextLine();
        switch(Letter.charAt(0)) { // an int, or a character, or a String
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well Done!");
                break;
            case 'D':
                System.out.println("You Passed!");
                break;
            case 'F':
                System.out.println("Better Try Again!");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
