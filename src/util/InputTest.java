package util;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        
        System.out.println("the string you entered is: " + input.getString());

        System.out.println("Did you enter 'y'? : " + input.yesNo());

        System.out.println("That is within the range! you entered: " + input.getInt(1, 10));

        System.out.println("You entered the whole number: " + input.getInt());

        System.out.println("That is within the range! you entered: " + input.getDouble(1, 10));

        System.out.println("You entered the decimal number: " + input.getDouble());
    }

}
