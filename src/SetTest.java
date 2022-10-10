import java.util.Scanner;
public class SetTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set mySet = new Set();

        System.out.println("What is your name?: ");
        String myName = input.nextLine();
        mySet.setName(myName);

        System.out.println("Your name is: "+ mySet.getName());
        System.out.println();

        System.out.println("How old are you? ");
        int myAge = input.nextInt();
        mySet.setAge(myAge);

        System.out.println("You are age: " + mySet.getAge());
        System.out.println();

    }
}
