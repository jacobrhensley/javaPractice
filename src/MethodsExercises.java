public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 5));
        System.out.println(subtraction(5, 2));
        System.out.println(multiplication(5, 5));
        System.out.println(division(25, 5));


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
}