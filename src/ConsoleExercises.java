import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");;

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.\n", pi);


        System.out.println("Enter an integer: ");

        int number = scanner.nextInt();

        System.out.println("You entered the number: " + number);

        System.out.println("Please enter 3 words");


        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("Thank you!");
        System.out.printf("you entered the words: %s, %s, and %s.\n", word1, word2, word3);

        System.out.println("Please enter a sentance.");

        String sentence = scanner.next();

        System.out.printf("The sentance you have entered is: %s\n", sentence);

    }
}