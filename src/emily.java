import java.util.Scanner;

public class emily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello! And welcome to the console!\n\nI have a question for you and I need you to answer!");

        System.out.print("What is your name? : ");

        String name = scan.nextLine();
            if(name.equalsIgnoreCase("Emily")){
                System.out.printf("%s! That is a beautiful name! You got a boyfrannn?\n", name.toUpperCase());
            } else{
                System.out.printf("%s... You sound super irrelivant. Get out of my console!\n", name.toUpperCase());
            }
        
    }
}