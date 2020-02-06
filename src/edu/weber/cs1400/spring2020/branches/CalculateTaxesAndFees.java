package edu.weber.cs1400.spring2020.branches;

import java.util.Scanner;

public class CalculateTaxesAndFees {
    public static void main(String[] args) {

        Scanner stdInput = new Scanner(System.in);
        System.out.println("What year is your vehicle?");
        int yearOfCar;
        yearOfCar = stdInput.nextInt();
        System.out.println("What is your vehicle type? (Motorvehicles, Motorcycles, Snowmobiles, Watercraft, Trailers, or Campers)");
        String typeOfCar;
        typeOfCar = stdInput.next();
        int tax;

        if(yearOfCar <= 1985 ) {
            if(typeOfCar.equals("Motorvehicles")) {
                System.out.println("Flat Fee is $20.");
            }
            else if(typeOfCar.equals("Motorcycles") || typeOfCar.equals("Trailers")) {
                System.out.println("Flat Fee is $10.");
            }
            else if(typeOfCar.equals("Snowmobiles") || typeOfCar.equals("Campers")) {
                System.out.println("Flat Fee is $15.");
            }
            else if(typeOfCar.equals("Watercraft")) {
                System.out.println("Flat Fee is $25.");
            }
            else {
                System.out.println("Invalid vehicle.");
            }

        }
        else if(yearOfCar >= 1986 && yearOfCar < 2000) {
            if (typeOfCar.equals("Motorvehicles")) {
                tax = (yearOfCar - 1985) * 5 + 20;
                System.out.println("Flat Fee is " + tax + ".");
            } else if (typeOfCar.equals("Motorcycles") || typeOfCar.equals("Trailers")) {
                tax = (yearOfCar - 1985) * 5 + 10;
                System.out.println("Flat Fee is " + tax + ".");
            } else if (typeOfCar.equals("Snowmobiles") || typeOfCar.equals("Campers")) {
                tax = (yearOfCar - 1985) * 5 + 25;
                System.out.println("Flat Fee is " + tax + ".");
            } else if (typeOfCar.equals("Watercraft")) {
                tax = (yearOfCar - 1985) * 5 + 25;
                System.out.println("Flat Fee is " + tax + ".");
            } else {
                System.out.println("Invalid vehicle.");
            }
        }
         else if(yearOfCar >= 2000 && yearOfCar < 2020) {
                if(typeOfCar.equals("Motorvehicles")) {
                    tax = (yearOfCar - 1985) * 7 + (20 * 2);
                    System.out.println("Flat Fee is " + tax + ".");
                }
                else if(typeOfCar.equals("Motorcycles") || typeOfCar.equals("Trailers")) {
                    tax = (yearOfCar - 1985) * 7 + (10 * 2);
                    System.out.println("Flat Fee is " + tax + ".");
                }
                else if(typeOfCar.equals("Snowmobiles") || typeOfCar.equals("Campers")) {
                    tax = (yearOfCar - 1985) * 7 + (25 * 2);
                    System.out.println("Flat Fee is " + tax + ".");
                }
                else if(typeOfCar.equals("Watercraft")) {
                    tax = (yearOfCar - 1985) * 7 + (25 * 2);
                    System.out.println("Flat Fee is " + tax + ".");
                }
                else {
                    System.out.println("Invalid vehicle.");
                }
        }
    }
}
