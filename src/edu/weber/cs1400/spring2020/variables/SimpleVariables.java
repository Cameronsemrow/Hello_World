package edu.weber.cs1400.spring2020.variables;

import java.util.Scanner;

public class SimpleVariables {
    public static void main(String[] args) {




        //char type
        char aCharacterType = '&';

        // arithmetic expression
        // type conversion / type casting


        // constant
        final double SPEED_OF_LIGHT = 299792458.0;
        double propagationDelay;
        double cableLength = 12.0;
        propagationDelay = cableLength / SPEED_OF_LIGHT;

        System.out.println(propagationDelay);
        final int MAX_NUMBER_OF_STUDENT = 30;

        // increment and decrement operator, only for int type
        int numberApples = 10;
        //++ add the value by 1
        numberApples++; //postfix increment
        ++numberApples; //prefix increment
        //-- minuses the inter by 1
        numberApples--;
        --numberApples;

        // String
        String animal = "catcatcatcow";
        // the following two are not the same type
        String aStr = "a";
        char aChar = 'a';
        System.out.println("Last Character: " + animal.charAt(animal.length() - 1));

        String anotherAnimal = "dog";
        String bothAnimals = animal + anotherAnimal;
        bothAnimals = bothAnimals + 5;
        System.out.println(bothAnimals);

        // user input
        Scanner stdInput = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter first and last name: ");

        firstName = stdInput.next();
        lastName = stdInput.next();

        System.out.println("Hello " + firstName + " " + lastName);
        //System.out.println(lastName + ", " + firstName);

        //height
        Scanner height = new Scanner(System.in);
        String feet;
        String in;

        System.out.println("" + firstName + ", what is your height in feet and inches? (input them like 6 2 or like 7 8.4)");

        feet = height.next();
        in = height.next();

        System.out.println("You are " + feet + " feet and " + in + " inches tall!");

        //age

        int parentsAge = 40;
        int userAge;

        userAge = parentsAge - 21;

        System.out.println("You are " + userAge + " years old.");

        //phone #

        final double CONTSTANT_PHONE_NUM = 0000000000;
        double userPhoneNum;

        userPhoneNum = CONTSTANT_PHONE_NUM + 2086541235 - 65;

        System.out.println("Your phone # is " + userPhoneNum);








    }
}
