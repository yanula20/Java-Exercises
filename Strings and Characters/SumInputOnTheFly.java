import java.util.*;

public class SumInputOnTheFly {
    public static void main(String[ ] args) {
        System.out.println("This program adds a sequence of numbers as user inputs next.\n");
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        int totalNumber = console.nextInt( );
       

        double sum = 0.0;

        for (int i = 1; i <= totalNumber; i++) {
           System.out.print("Enter the next number: ");
           double next = console.nextDouble( );
           sum += next;
           System.out.println("The sum right now is: " + sum);
           
        }

        System.out.println("\nWe've added " + totalNumber + " times and our total sum is " + sum);
    }
}