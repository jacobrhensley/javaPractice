import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bob is is a lackadaisical teenager\nSay something to Bob or ask him a question!");

        String statement = input.nextLine();

        if(statement.endsWith("?")){
            System.out.println("Bob: Sure");
        }else if(statement.endsWith("!")){
            System.out.println("Bob: Whoa, chill out!");
        }else if(statement.isEmpty()){
            System.out.println("Bob: Fine. Be that way!");
        }else System.out.println("Bob: Whatever.");
    }
}