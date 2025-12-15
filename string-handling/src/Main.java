import java.util.Scanner;
import java.util.ArrayList;
public static void main (String [] args ) {
    // Get user input in string as sentence and place each word in an array
    System.out.println("Please enter a sentence.");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println(input);
    String[] sentence = input.split(" ");
    for (int i = 0; i < sentence.length; i++) {
        System.out.println(sentence[i] + ": "+ sentence[i].length());
        }
    }



