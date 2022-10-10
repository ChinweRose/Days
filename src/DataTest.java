import java.util.Scanner;
public class DataTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Data myData = new Data();

        System.out.println("What is your name");
        String myName = input.nextLine();
        myData.setName(myName);
    }
}
