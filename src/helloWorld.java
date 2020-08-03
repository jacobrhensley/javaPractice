
public class helloWorld {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Hello, World!");
        System.out.println("Helloooooo, World!");

        // Exercise 2
        int myFavoriteNumber = 48;
        System.out.println(myFavoriteNumber);

        String myString = "This is my string! leave it alone!";
        System.out.println(myString);

        Long myNumber = 123L;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

        int z = 4;
        z += 5;
        System.out.println(z);

        int a = 3;
        int b = 4;
        b *= a;
        System.out.println(b);

        x = Integer.MAX_VALUE;
        x++;
        System.out.println("MAXVAL + 1 " + x);
    }
}