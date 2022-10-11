public class Init {
    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.printf("%5s%8s%n", "index" , "Value");

        for(int counter = 1 ; counter < array.length ; counter ++)
            System.out.printf("%5d%8d%n", counter , array[counter] );
    }
}
