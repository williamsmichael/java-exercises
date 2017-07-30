package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        System.out.println("Let's calculate miles per gallon for your trip to this point500");

        Scanner user_input = new Scanner(System.in);

        Integer miles;
        System.out.print("Enter miles driven: ");
        miles = Integer.parseInt(user_input.next());

        Integer gallons;
        System.out.print("Enter amount of gas consumed (gallons): ");
        gallons = Integer.parseInt(user_input.next());

        Integer milesPerGallon;
        milesPerGallon = miles / gallons;

        System.out.println("Miles per gallon equals " + Integer.toString(milesPerGallon));

    }
}
