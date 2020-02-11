package edu.weber.cs1400.spring2020.loops;

import java.util.Scanner;

public class MenuItems {
    public static void main(String[] args) {
        System.out.println("Choose an item from the list below:");
        System.out.println("___________________________________");
        System.out.println("1. Hot dog");
        System.out.println("2. Hamburger");
        System.out.println("3. Cheeseburger");
        System.out.println("4. Veggie Burger");
        System.out.println("5. Nachos");

        int userNum;

        Scanner options = new Scanner(System.in);
        userNum = options.nextInt();

        while (true){

            if (userNum > 0 && userNum < 6) {
                if(userNum == 1){
                    System.out.println("You chose a Hot dog, that's $2.50.");
                    break;
                }
                else if(userNum == 2){
                    System.out.println("You chose a Hamburger, that's $3.99.");
                    break;
                }
                else if(userNum == 3){
                    System.out.println("You chose a Cheeseburger, that's $4.99.");
                    break;
                }
                else if(userNum == 4){
                    System.out.println("You chose a Veggie Burger, that's $1.15.");
                    break;
                }
                else if(userNum == 5){
                    System.out.println("You chose a Nachos, that's $3.50.");
                    break;
                }
            }
            else {
                System.out.println("That is an invalid option, run again.");
                userNum = options.nextInt();

            }
        }
    }
}
