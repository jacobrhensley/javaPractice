package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    String getString(){
        System.out.println("Type something: ");
        return scanner.nextLine();
    }

    boolean yesNo(){
        System.out.println("Select y/n");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y") ? true : false;
    }

    int getInt(int min, int max){
        System.out.println("Give me a number between " + min + " and "  + max);
        int answer = Integer.parseInt(scanner.nextLine());
        if(answer > max || answer < min){
            System.out.println("Outside of the range, try again");
            return getInt(min, max);
        }
        return answer;
    }

    int getInt(){
        System.out.println("Give me any whole number");
        int answer = Integer.parseInt(scanner.nextLine());
        return answer;
    }

    Double getDouble(int min, int max){
        System.out.println("Give me a decimal number between " + min + " and "  + max);
        Double answer = Double.parseDouble(scanner.nextLine());
        if(answer > max || answer < min){
            System.out.println("Outside of the range, try again");
            return getDouble(min, max);
        }

        return answer;
    }

    Double getDouble(){
        System.out.println("Give me a decimal number");
        Double answer = Double.parseDouble(scanner.nextLine());
        return answer;
    }

}
