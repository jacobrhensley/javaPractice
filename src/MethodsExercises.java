public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 5));
        System.out.println(subtraction(5, 2));
        System.out.println(multiplication(5, 5));
        System.out.println(multiplyRecursion(6, 3));
        System.out.println(division(25, 5));
        System.out.println(modulus(10, 2));
        System.out.println(modulus(11, 2));


    }

    public static Integer addition(int param1, int param2){
    return param1 + param2;
    }

    public static Integer subtraction(int param1, int param2){
        return param1 - param2;
        }

    public static Integer multiplication(int param1, int param2){
        return param1 * param2;
       }
    public static Integer division(int param1, int param2){
    return param1 / param2;
    }
    public static Integer modulus(int param1, int param2){
        return param1 % param2;
        }

    public static int multiplyRecursion(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        
        else {
           return num1 + multiplyRecursion(num1, num2 - 1);
        }
        
    }
}