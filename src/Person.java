public class Person {
    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }
    // returns the person's name
    public String getName() {
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println(this.name+" says suh dude!");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Getter");
        System.out.println(p1.getName());
        p1.setName("Bro Safari");
        p1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //this is true because string comparisons on same string
//        System.out.println(person1 == person2); //this is different because no object comparison function is defined, and person1 and person2 are references to different objects

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //is equal because referencing the same object

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName()); //should be same name here because assigned the reference to the same object on person2
        person2.setName("Jane"); //sets name for both person1 and person2 since they are referencing the same object
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
