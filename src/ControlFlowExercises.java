import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        System.out.println("printing numbers 5-15 using a do while loop");
        int i = 5;
        do {
            System.out.println(i);
            i++;
        }while(i<=15);

        System.out.println("printing numbers 100-0 in increments of 5 using a do while loop");
        int x = 100;
        do{
            System.out.println(x);
            x -= 5;
        } while(x>=0);

System.out.println("printing numbers from 2 squared that are less than 1,000,000 using a do while loop");
        double y = 2;
        do{
            System.out.println(y);
            y = Math.pow(y, 2);
        } while(y < 1000000);

        System.out.println("printing FizzBuzz challenge using a for loop");
        for(int a = 0; a <= 100; a++){
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(a % 3 == 0){
                System.out.println("Fizz");
            } else if(a % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(a);
            }
        }


        System.out.println("Were going to print a number chart holding a sequence of numbers and their values squared and cubed");
        System.out.print("what number would you like to go up to?: ");
        int number = input.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int c = 1; c <= number; c++){

           System.out.printf("%-7s| %-8s| %-6s\n", c, c * c, c * c * c);
        }

        System.out.println("Were going tellyou what your grade is in the lettering scheme");
        System.out.print("what is your current grade 0-100?: ");
        int grade = input.nextInt();
        if (grade >= 90 && grade <= 100){
            
                System.out.println("Your alphabetical grade is: A");

        }else if (grade >= 80 && grade <= 89){
           System.out.println("Your alphabetical grade is: B");
    
        }else if (grade >= 70 && grade <= 79){
            
          System.out.println("Your alphabetical grade is: C");
        
        }else{
            System.out.println("Your alphabetical grade is: F");
        }
    }
}