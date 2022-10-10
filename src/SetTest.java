import java.util.Scanner;
public class SetTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set mySet = new Set();

        System.out.println("What is your name?: ");
        String myName = input.nextLine();
        mySet.setName(myName);

        System.out.println("Your name is: "+ mySet.getName());

    }
}
