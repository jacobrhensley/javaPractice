public class person {
    
    public String firstName;
    public String lastName;
    
    public String sayHello() {
       return String.format("Hello from %s %s!", firstName, lastName);
    }
    
    public static void main(String[] args) {
        person rick = new person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"
    }
}