class Person {

    public static void main(String[] args){
        Person Jacob = new Person();

        Jacob.setName("Jacob");

        Jacob.sayHello();
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
