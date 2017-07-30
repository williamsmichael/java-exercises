package exercises;

import java.util.Scanner;

// http://www.homeandlearn.co.uk/java/user_input.html

public class Hello_IO {

    public static void main(String[] args) {

        // get the user's first name'
        Scanner user_input = new Scanner(System.in);

        // assign new var to the user_input
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.next();

        // print user name
        System.out.println( "Hello " + first_name + "!");
    }
}
