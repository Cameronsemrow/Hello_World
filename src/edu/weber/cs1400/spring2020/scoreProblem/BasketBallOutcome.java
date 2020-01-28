package edu.weber.cs1400.spring2020.scoreProblem;

import java.util.Scanner;

public class BasketBallOutcome {
    public static void main(String[] args) {
        //Second Challenge
        int ourScore;
        int otherScore;

        Scanner ourTeam = new Scanner(System.in);

        System.out.println("What was the score for our team?");
        ourScore = ourTeam.nextInt();

        Scanner otherTeam = new Scanner(System.in);

        System.out.println("What was the score for the other team?");
        otherScore = otherTeam.nextInt();


        if(ourScore > 100 && ourScore > otherScore){
            System.out.println("Fans: Redeem your ticket stub for a free order of French fries at Yummy Burgers.");
        }
    }
}
