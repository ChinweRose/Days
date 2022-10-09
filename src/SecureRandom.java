import java.security.SecureRandom;

class Random{

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();


        for (int count = 1 ; count <= 10 ; count ++){

            int dice = random.nextInt(6) + 1;

            System.out.println(dice);

        }
    }
}