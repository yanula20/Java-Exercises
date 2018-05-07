import java.util.*;

public class SumInputCumulativeCountOtherNumbers {
    public static void main(String[ ] args) {
        System.out.println("This program adds a sequence of numbers.\n");
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        int totalNumber = console.nextInt( );


        double sum = 0.0;
        int negatives = 0;
        int prime = 0;
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= totalNumber; i++) {
          System.out.print("Enter the next number: ");
          double next = console.nextDouble( );
           
          sum += next;
          if( next < 0) {
            negatives++;
          }
          if(Math.abs(next)%2 == 1 ) {
            odd++;
          
          }
          if(Math.abs(next)%2 == 0) {
            even++;
          }
          
        }

        System.out.println("\nsum is " + sum);
        System.out.println("\nNumber of odd numbers: " + odd);
        System.out.println("\nNumber of even numbers: "  + even);
        System.out.println("\nNumber of negatives: "  + negatives);
       
    }
}