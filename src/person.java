class Person {

    public static void main(String[] args){
        Person Jacob = new Person();

        Jacob.setName("Jacob");

        Jacob.sayHello();

            // Person person1 = new Person();
            // person1.setName("John");

            // Person person2 = person1;
            // System.out.println(person1 == person2);


            // System.out.println(person1.getName());
            // System.out.println(person2.getName());
            // person2.setName("Jane");
            // System.out.println(person1.getName());
            // System.out.println(person2.getName());

            // Person person2 = new Person();
            // person2.setName("John");
            // System.out.println(person1.getName().equals(person2.getName()));
            // System.out.println(person1 == person2);
    }


    private String Name;

    public String getName(){
        return this.Name;
        }
        
        public void setName(String name){
        this.Name = name;
        }
        public void sayHello(){
        System.out.println("Hello " + this.getName() + "! Nice to meet you!");
        }

}
