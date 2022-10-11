public class Numbers {

    public static void main(String[] args) {

        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.printf("%4s%8s%n", "Index" , "Values");


        for (int counter = 0; counter < array.length; counter++)

            System.out.printf("%3d%8d%n" , counter , array[counter] );
    }
}
