package edu.weber.cs1400.spring2020.loops;

import java.util.Scanner;

public class DomainNames {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int i;
        int placeOfPeriod = 0;
        int numOfPeriods = 0;
        String coreGTlD1 = ".com";
        String coreGTlD2 = ".net";
        String coreGTlD3 = ".org";
        String coreGTlD4 = ".info";

        System.out.println("Give me a domain name: (Enter to exit)");
        String userDomain = userInput.nextLine();

        while (userDomain.length() > 0) {

            for (i = 0; i < userDomain.length(); ++i) {
                if (userDomain.charAt(i) == '.') {
                    ++numOfPeriods;
                    placeOfPeriod = i;
                }
            }

            if (numOfPeriods == 1 && placeOfPeriod != 0) {
                if (userDomain.toLowerCase().endsWith(coreGTlD1)) {
                    System.out.println("this domain name consists of a second-level domain followed by a core gTLD.");
                } else if (userDomain.toLowerCase().endsWith(coreGTlD2)) {
                    System.out.println("this domain name consists of a second-level domain followed by a core gTLD.");

                } else if (userDomain.toLowerCase().endsWith(coreGTlD3)) {
                    System.out.println("this domain name consists of a second-level domain followed by a core gTLD.");

                } else if (userDomain.toLowerCase().endsWith(coreGTlD4)) {
                    System.out.println("this domain name consists of a second-level domain followed by a core gTLD.");

                } else {
                    System.out.println("this domain name doesn't consist of a second-level domain followed by a core gTLD.");
                }
            } else {
                System.out.println("This either has no periods, too many, or no second-level domain.");
            }


            System.out.println("Give me a domain name: (Enter to exit)");
            userDomain = userInput.nextLine();
            numOfPeriods = 0;

        }
    }
}
