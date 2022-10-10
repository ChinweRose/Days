public class Person {

    private String name;
    private int age;

    public static void main(String[] args) {

        // Just like humans(Person in this case). Everybody is a human but, with different names and information.
        Person person1 = new Person();
        person1. name = "Chinwe";
        person1. age = 30;

        Person person2 = new Person();
        person2.name = "Jane";
        person2.age = 42;


        System.out.println("I know " + person1.name + " age");
        System.out.println(person1.name + " is "+ person1.age);

        System.out.println("Just assigned a person to africa " + person2);
    }
}
