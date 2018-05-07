
import java.util.*;
public class MinInput {
    public static final Scanner console = new Scanner(System.in);
    public static void main(String[ ] args) {
        System.out.println("This program finds the minimum number after a series numbers.\n");
     
        System.out.print("How many numbers do you have? ");
        int totalNumber = console.nextInt( );
        
        //think of min input as largest number and test down
        System.out.print("Enter the first number: ");
        double min = console.nextDouble( );//invariant

        for (int i = 2; i <= totalNumber; i++) {
            System.out.print("Enter the next number: ");
            double next = console.nextDouble( );
            if (min > next) {
                min = next;
                System.out.println(min + " is the current new min...keep going!");
            }
        }

        System.out.println("The final min is " + min);
    }
}