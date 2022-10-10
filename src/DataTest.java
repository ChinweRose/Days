import java.util.Scanner;
public class DataTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Data myData = new Data();

        System.out.println("What is your name? ");
        String myName = input.nextLine();
        myData.setName(myName);

        System.out.println("Welcome," + myData.getName());
        System.out.println();

        System.out.println("Enter your grade: ");
        int myGrade = input.nextInt();
        myData.setGrade(myGrade);

        System.out.println("Your grade is: " + myData.getGrade());
    }
}
