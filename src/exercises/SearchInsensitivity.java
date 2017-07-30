package exercises;

import java.util.Scanner;

public class SearchInsensitivity {

    public static void main(String[] args) {

        String sentence;
        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Let's check if a word is in a body of text");

        Scanner user_input = new Scanner(System.in);

        String search;
        System.out.print("Enter a word to search: ");
        search = user_input.next();

        if(sentence.toLowerCase().contains(search.toLowerCase())) {

            System.out.println(true);

        } else {

            System.out.println(false);

        }

    }
}
