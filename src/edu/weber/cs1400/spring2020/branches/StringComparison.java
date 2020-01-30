package edu.weber.cs1400.spring2020.branches;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "Hello World!";
        String str3 = "hello world!";

        //method 1: using == to compare strings
        System.out.println("Using == to compare strings.");
        if (str1 == str2) {
            System.out.println(str1 + " == " + str2 + " is true.");
        } else {
            System.out.println(str1 + " == " + str2 + " is false.");
        }

        //method 2: equals()
        System.out.println("Using equals()");
        if (str1.equals(str2)) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

        //method 3: use equalsIngoreCase
        System.out.println("Using equalsIngoreCase().");
        if (str1.equalsIgnoreCase(str3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //method 4: compareTo()
        System.out.println("Using compareTo().");

        System.out.println(str1.compareTo(str3));

        if (str1.compareTo(str3) == 0) {
            System.out.println("same");
        } else if (str1.compareTo(str3) < 0) {
            System.out.println(str1 + " is smaller.");
        } else {  // if the result is more than 0 then str1 is bigger
            System.out.println(str3 + " is smaller.");
        }
    }
}
