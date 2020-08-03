import java.util.Scanner;

public class toaster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIm glad youre here. So you say you've been having some doubts on your identity and you feel like you might be a toaster?");
        System.out.println("\nI have a few questions to ask you to help us determine the severity of the problem......");

        System.out.print("Do you/ have you ever actually toasted anything? \n(y/n): ");

        String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("y")){
                System.out.printf("hmm this is unususal\n");
                System.out.printf("\nDo you have a power cable coming out of your butt to plug into the wall with?\n (y/n): ");
                String answer2 = scan.nextLine();
                if(answer2.equalsIgnoreCase("y")){
                    System.out.println("This is very concerning... We might have to check that out... One last question...");
                    System.out.printf("\nHave you ever actually had a slice of bread inserted into you?\n (y/n): ");
                    String answer3 = scan.nextLine();
                    if(answer3.equalsIgnoreCase("y")){
                        System.out.println("OK, either you're one sick dude or YOU MIGHT BE A F*%&ING TOASTER!");
                    } 
                    if(answer3.equalsIgnoreCase("n")){
                        System.out.println("THEN YOURE NOT A F*%&ING TOASTER!");
                    }

                }
                if(answer2.equalsIgnoreCase("n")){
                    System.out.println("THEN YOURE NOT A F*%&ING TOASTER!");
                }
            }
            if(answer.equalsIgnoreCase("n")){
                System.out.println("THEN YOURE NOT A F*%&ING TOASTER!");
            }
    }
}