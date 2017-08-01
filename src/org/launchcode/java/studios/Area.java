package org.launchcode.java.studios;

// Calculate area of a circle
// A = pi * r * r where pi is 3.14 and r is the radius

import java.util.Scanner;

public class Area {

    public static boolean isNumeric(String str) {

        // is a double and a positive number
        try {
            Double.parseDouble(str);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // determine if the program should ask the user to try again
        Boolean tryAgain;
        tryAgain = true;

        while (tryAgain) {

            Scanner userInput;
            String str;
            Double radius;
            Double area;

            userInput = new Scanner(System.in);
            System.out.println("Let's calculate the area of a circle");

            // get userInput
            System.out.print("Enter a radius: ");

            // take the userInput as string to test
            str = userInput.next();

            // test if str is numeric and a positive number
            if (isNumeric(str) && Double.parseDouble(str) > -1) {

                radius = Double.parseDouble(str);
                area = Math.PI * Math.pow(radius, 2);

                System.out.printf("The area of a circle of radius %s is %s\n", radius, area);

                // end the program
                tryAgain = false;

            } else {

                System.out.println("Program only accepts positive numeric numbers. Try again...\n");

            }
        }
    }
}
