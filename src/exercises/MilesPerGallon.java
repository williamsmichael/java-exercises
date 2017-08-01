package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        System.out.println("Let's calculate miles per gallon for your trip to this point500");

        Scanner user_input = new Scanner(System.in);

        Integer miles;
        System.out.print("Enter miles driven: ");
        miles = user_input.nextInt();

        Integer gallons;
        System.out.print("Enter the gallons of gas consumed: ");
        gallons = user_input.nextInt();

        Integer milesPerGallon;
        milesPerGallon = miles / gallons;

        System.out.println("Miles per gallon equals " + Integer.toString(milesPerGallon));

    }
}
