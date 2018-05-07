import java.util.*;

public class ArrayAverageMethod_Temperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Input the number of days from the user.
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt( );
        while(days < 0){
         System.out.print("INVALID. How many days' temperatures? ");
         days = console.nextInt( );
        }

        // Declare and create an array, maybe should check if days is positive
        int[ ] temps = new int[days];
  
        // Input and store the temperatures in the array
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temps[i] = console.nextInt( );
        }
       
       double result = averageTemp(temps);
       System.out.println("The avg temp was: " + result);
    }//end main
    
    public static double averageTemp(int[] temps){
        // Calculate and print the average
        double average;
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
       average = (double)sum /temps.length; 
       return average;
       
    }
   
}
