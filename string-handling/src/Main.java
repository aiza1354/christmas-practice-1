import javax.management.StringValueExp;
import java.util.Scanner;
public static void main (String [] args ) {
    // Get user input in string as sentence and place each word in an array
    /*System.out.println("Please enter a sentence.");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    System.out.println(input);
    String[] sentence = input.split(" ");
    for (int i = 0; i < sentence.length; i++) {
        System.out.println(sentence[i] + ": "+ sentence[i].length());
        }*/

    /* String Manipulation

    StringBuilder myString = new StringBuilder("this is the best time to study");
    myString.append(myString);
    // input value is "this is the best time to study"
    // print Length of input
    System.out.println(myString.length());
    // print position of time
    System.out.println(myString.indexOf("time"));
    // print substring of study
    System.out.println(myString.substring(25,30));
    System.out.println(myString.substring(12,21));


    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a word,phrase or sentence.");
    String input1 = scanner.nextLine();
    System.out.println("Please type another word,phrase or sentence.");
    String input2 = scanner.nextLine();
    StringBuilder newString = new StringBuilder();
    newString.append(input1);
    newString.append(input2);
    System.out.println(newString);
    System.out.println(input1 + input2);

    // Character to integer
    char myChar = '0';
    int code1 = (int) myChar;
    System.out.println(code1);

    // Integer to Character
    int myInt = 65;
    char myChar  = (char) myInt;
    System.out.println(myChar);

    // String to integer !!!
    String string1 = "56467456747647";
    int int1 = Integer.parseInt(string1);
    System.out.println(int1);

    // Integer to String !!!
    int int1 = 1235;
    int int2 = 2;

    System.out.println( int1 +  int2);
    String string1 = String.valueOf(int1) ;
    System.out.println(string1 + int2);

    // String to float !!! 😘
    String string1 = "1.5";
    Double double1 = Double.parseFloat(string1);
    System.out.println(float1);

    // Float to String
    double float1 = 2.3;
    String string1 = String.valueOf(float1);
    System.out.println(string1);

    // Date/Time to String
    Date date1 = new Date("16/12/2015");
    String string1 = String.valueOf(date1);
    System.out.println(string1);

    // String to Date/Time;
    String string1 = "29/05/2009";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Parse the string into a LocalDate object
    LocalDate date = LocalDate.parse(string1, formatter);
    System.out.println(date);*/


    // XOR
    /*int a = 5;
    int b = 3;
    int result = a ^ b;
    System.out.println(result); // Outputs 6

    // Given an array where every number appears twice except for one, find the single number.
    int[] nums = {1, 2, 1, 2,5};
    int result = 0;
    for (int i : nums) {
        result ^= i; // XOR everything
    }
        System.out.println(result);

    final String colour = "red";
    String colour1 = "pink";

    // colour = colour1;


    System.out.println(colour);
    System.out.println(colour1);*/

    // MATHSSSS :DDDD
    Double decimal1 = 0.6;
    System.out.println(Math.round(decimal1));
}








