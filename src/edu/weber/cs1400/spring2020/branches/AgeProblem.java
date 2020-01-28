package edu.weber.cs1400.spring2020.branches;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeProblem {

    public static void main(String[] args) {

        //first Challenge
        Scanner stdInput = new Scanner(System.in);
        int age;

        System.out.println("What is your age in years?");
        age = stdInput.nextInt();

        if(age < 2) {
            System.out.println("You are an Infant");
        }
        else if(2 <= age && age < 12) {
            System.out.println("You are a child");
        }
        else if(12 <= age && age < 20) {
            System.out.println("You are a Teenager");
        }
        else if(20 <= age && age < 65) {
            System.out.println("You are a adult");
        }
        else if(65 <= age) {
            System.out.println("You are a senior");
        }
        else if(age > 150) {
            System.out.println("That is too large");
        }

        Scanner birthDay = new Scanner(System.in);

        int yearOfBirth;
        int userBirthYear;

        System.out.println("What is your birthday?");
        yearOfBirth = birthDay.nextInt();

        Calendar cal = Calendar.getInstance();
        userBirthYear = cal.get(Calendar.YEAR) - yearOfBirth;

        // You can also do this by using:  userBirthYear = now.getYear() - yearOfBirth;; but it is less accurate then using Calendar

        System.out.println("You are " + userBirthYear + " years old!");



    }
}
