package edu.weber.cs1400.spring2020.midtermProject;

import java.util.Scanner;

public class MidtermProject {
    public static void main(String[] args) {
        String[] courseLetterGrades = new String[10];
        String[] test = new String[]{"A", "A+", "A-", "B", "B+", "B-", "C", "C+", "C-", "D", "D+", "D-", "F"};
        int[] courseCredits = new int[10];
        double[] course4ScaleGrades = new double[10]; //I couldn't add the 4.0 because it was breaking my variable so I left it as 4

        String userGrades;
        String maxLetterGrade = "";
        String minLetterGrade = "";
        int userCredits;
        int i = 0;
        double maxScaleGrade = 0.0;
        double minScaleGrade = 0.0;
        double averageScaleGrade = 0.0;
        double totalCourseCredits = 0.0;
        double gpa = 0.0;

        while (i < 10) {
            System.out.println("Give me a letter grade, for 10 in total. Ex A+, B, etc. Press Enter after each grade");
            Scanner userInput = new Scanner(System.in);
            userGrades = userInput.nextLine();

            for (int j = 0; j < 13; ++j) {
                if (test[j].equals(userGrades.toUpperCase())) {
                    courseLetterGrades[i] = userGrades;
                    ++i;
                }
            }
        }

        i = 0;

        System.out.println(""); //spacer

        while (i < 10) {
            System.out.println("Give me a credit hours between 1 and 5, for 10 in total. Press Enter after each credit");
            Scanner userInput = new Scanner(System.in);
            userCredits = userInput.nextInt();

            if (userCredits > 0 && userCredits < 6) {
                courseCredits[i] = userCredits;
                ++i;
            } else {
                System.out.println("Invalid credit.");
            }
        }

        for (i = 0; i < 10; ++i) {
            // I'm using the 4.0 scale
            switch (courseLetterGrades[i].toUpperCase()) {
                case "A+":
                case "A":
                    course4ScaleGrades[i] = 4.0;
                    break;
                case "A-":
                    course4ScaleGrades[i] = 3.7;
                    break;
                case "B+":
                    course4ScaleGrades[i] = 3.3;
                    break;
                case "B":
                    course4ScaleGrades[i] = 3.0;
                    break;
                case "B-":
                    course4ScaleGrades[i] = 2.7;
                    break;
                case "C+":
                    course4ScaleGrades[i] = 2.3;
                    break;
                case "C":
                    course4ScaleGrades[i] = 2.0;
                    break;
                case "C-":
                    course4ScaleGrades[i] = 1.7;
                    break;
                case "D+":
                    course4ScaleGrades[i] = 1.3;
                    break;
                case "D":
                    course4ScaleGrades[i] = 1.0;
                    break;
                case "D-":
                    course4ScaleGrades[i] = 0.7;
                    break;
                case "F":
                    course4ScaleGrades[i] = 0.0;
                    break;
            }
        }

        for (i = 0; i < 10; ++i) { //finding average scale grade
            averageScaleGrade = averageScaleGrade + course4ScaleGrades[i];
        }

        averageScaleGrade = averageScaleGrade / 10;

        for (i = 0; i < 10; ++i) { //finding the max grade and min grade
            if (course4ScaleGrades[i] > maxScaleGrade) {
                maxScaleGrade = course4ScaleGrades[i]; // I'm using the 4.0 scale // finds the highest grade

                if (maxScaleGrade == 4.0) {
                    maxLetterGrade = "A";
                } else if (maxScaleGrade == 3.7) {
                    maxLetterGrade = "A-";
                } else if (maxScaleGrade == 3.3) {
                    maxLetterGrade = "B+";
                } else if (maxScaleGrade == 3.0) {
                    maxLetterGrade = "B";
                } else if (maxScaleGrade == 2.7) {
                    maxLetterGrade = "B-";
                } else if (maxScaleGrade == 2.3) {
                    maxLetterGrade = "C+";
                } else if (maxScaleGrade == 2.0) {
                    maxLetterGrade = "C";
                } else if (maxScaleGrade == 1.7) {
                    maxLetterGrade = "C-";
                } else if (maxScaleGrade == 1.3) {
                    maxLetterGrade = "D+";
                } else if (maxScaleGrade == 1.0) {
                    maxLetterGrade = "D";
                } else if (maxScaleGrade == 0.7) {
                    maxLetterGrade = "D-";
                } else if (maxScaleGrade == 0.0) {
                    maxLetterGrade = "F";
                }
            }
        }

        for (i = 0; i < 10; ++i) {
            if (course4ScaleGrades[i] < minScaleGrade) {
                minScaleGrade = course4ScaleGrades[i]; // finds the lowest grade

                if (minScaleGrade == 4.0) {
                    minLetterGrade = "A";
                } else if (minScaleGrade == 3.7) {
                    minLetterGrade = "A-";
                } else if (minScaleGrade == 3.3) {
                    minLetterGrade = "B+";
                } else if (minScaleGrade == 3.0) {
                    minLetterGrade = "B";
                } else if (minScaleGrade == 2.7) {
                    minLetterGrade = "B-";
                } else if (minScaleGrade == 2.3) {
                    minLetterGrade = "C+";
                } else if (minScaleGrade == 2.0) {
                    minLetterGrade = "C";
                } else if (minScaleGrade == 1.7) {
                    minLetterGrade = "C-";
                } else if (minScaleGrade == 1.3) {
                    minLetterGrade = "D+";
                } else if (minScaleGrade == 1.0) {
                    minLetterGrade = "D";
                } else if (minScaleGrade == 0.7) {
                    minLetterGrade = "D-";
                } else if (minScaleGrade == 0.0) {
                    minLetterGrade = "F";
                }
            }
        }

        for (i = 0; i < 10; ++i) { // calculating the total course credits
            totalCourseCredits = totalCourseCredits + courseCredits[i];
        }

        gpa = (totalCourseCredits * averageScaleGrade) / 10;

        System.out.println(""); // spacer

        System.out.println("The highest grade was a " + maxLetterGrade + ".");
        System.out.println("The lowest grade was a " + minLetterGrade + ".");

        System.out.println(""); // spacer

        System.out.println("Grades \t 4.0 scale grades \t credits");

        for (i = 0; i < 10; ++i) { //creates the table
            System.out.println(courseLetterGrades[i] + "\t\t" + course4ScaleGrades[i] + "\t\t\t\t\t" + courseCredits[i]);
        }

        System.out.println(""); // spacer

        System.out.println("The gpa is a " + gpa + ".");

    }
}

