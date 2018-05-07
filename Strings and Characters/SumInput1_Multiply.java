import java.util.*;

public class SumInput1_Multiply {
    public static void main(String[ ] args) {
        System.out.println("This program multiplies a sequence of numbers.\n");
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to multiply? ");
        int totalNumber = console.nextInt( );
        double next = '\0';

        double product = 1.0;

        for (int i = 1; i <= totalNumber; i++) {
          System.out.print("Enter the next number: ");
          next = console.nextDouble( );
           
            product *= next;
        }

        System.out.println("\nMultiplying " + totalNumber 
                             + " times equals " + product);
    }
}