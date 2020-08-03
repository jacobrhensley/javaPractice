import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

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

        System.out.println("Please enter a sentance.\n");
        String sentence = scanner.next();
        System.out.printf("The sentance you have entered is: %s\n\n", sentence);

        System.out.println("Let's figure out the area of the room you're in!\n");
        System.out.print("About what is the width of your room in feet? : ");
        int width = scanner.nextInt();
        System.out.print("About what is the legnth of your room in feet? : ");
        int length = scanner.nextInt();
        int area = length * width;

        System.out.printf("The area of your room is about %s square feet!\n", area);
    }
}