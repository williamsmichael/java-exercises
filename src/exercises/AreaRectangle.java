package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Let's calculate the area of a rectangle");

        Integer length;
        System.out.print("Enter the length: ");
        length = Integer.parseInt(user_input.next());

        Integer width;
        System.out.print("Enter the width: ");
        width = Integer.parseInt(user_input.next());

        Integer area;
        area = length * width;

        String answer;
        System.out.println("The area is " + Integer.toString(area));




    }
}
