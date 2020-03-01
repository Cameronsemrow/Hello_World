package edu.weber.cs1400.spring2020.arrays;

import java.util.Scanner;

public class InternetDomainNames {
    public static void main(String[] args) {
        String[] coreGenericTopLevelDomain = new String[]{".com", ".info", ".net", ".org"};
        String[] restrictedTopLevelDomain = new String[]{".biz", ".name", ".pro"};

        boolean validDomain = false;
        String input;
        int numOfPeriods = 0;
        int placeOfPeriod = 0;
        int i;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Give me a domain name. (Enter -1 to exit)");
        input = userInput.nextLine();

        while (!input.equals("-1")) {
            for (i = 0; i < input.length(); ++i) {
                if (input.charAt(i) == '.') {
                    ++numOfPeriods;
                    placeOfPeriod = i;
                }
            }
            if (numOfPeriods == 1 && placeOfPeriod != 0) {
                i = 0;
                while (i < 4) {

                    if (input.endsWith(coreGenericTopLevelDomain[i])) {
                        System.out.println("This is a domain name that consists of a second-level domain followed by a core gTLD.");
                        validDomain = true;
                        break;
                    }
                    ++i;
                }
                i = 0;
                while (i < 3){
                    if (input.endsWith(restrictedTopLevelDomain[i])) {
                        System.out.println("This is a domain name that consists of a second-level domain followed by a restricted top-level domain.");
                        validDomain = true;
                        break;
                    }
                    ++i;
                }
                if (!validDomain) {
                    System.out.println("This is not a valid core gTLD or restricted top-level domain.");
                }
            } else {
                System.out.println("This is not a valid second-level domain.");
            }


            System.out.println("Give me a domain name. (Enter -1 to exit)");
            input = userInput.nextLine();
            numOfPeriods = 0;
            validDomain = false;

        }
    }
}
