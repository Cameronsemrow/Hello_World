package edu.weber.cs1400.spring2020.midtermProject;

import java.util.Scanner;

public class MidtermProject {
    public static void main(String[] args) {
        String[] courseLetterGrades = new String[10];
        String[] test = new String[]{"A", "A+", "A-", "B", "B+", "B-", "C", "C+", "C-", "D", "D+", "D-", "F"};
        int[] courseCredits = new int[10];

        String userGrades;
        int userCredits;
        int i = 0;

        while (i < 10) {
            System.out.println("Give me a letter grade, for 10 in total. Ex A+, B, etc. Press Enter after each grade");
            Scanner userInput = new Scanner(System.in);
            userGrades = userInput.nextLine();

            for (int j = 0; j < 13; ++j) {
                if (test[j].equals(userGrades)) {
                    courseLetterGrades[i] = userGrades;
                    ++i;
                }
            }
        }

        i = 0;

        while (i < 10) {
            System.out.println("Give me a Credit between 1 and 5, for 10 in total. Press Enter after each credit");
            Scanner userInput = new Scanner(System.in);
            userCredits = userInput.nextInt();

            if (userCredits > 0 && userCredits < 6) {
                courseCredits[i] = userCredits;
                ++i;
            }
        }


    }
}
