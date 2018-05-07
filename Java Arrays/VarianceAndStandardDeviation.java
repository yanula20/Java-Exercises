/* To compute the variance, you need to sum up:
 (temps[i] - average)2
 and then divide the sum by temps.length.  The standard deviation is the square root of the variance.*/
import java.util.*;

public class VarianceAndStandardDeviation{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    int days = -1; //default value for priming while loop
    int sumOfTemps = 0;
    int numOfDays;//used to calculate average temperature
    double averageTemp;//used to store average temperature value for VARIANCE AND STANDARD DEVIATION calculations
    // Input the number of days from the user, maybe should check if days is positive
   double varianceSum = 0;
   double standardDeviation;
    
    while(days < 0){
      System.out.print("How many days' temperatures?: ");
      days = console.nextInt();
      System.out.print("Invalid entry. ");
    }
    
    //hold days for the average temperature calculation
    numOfDays = days;
    //create an array with the length of the number of temperatures
    int[] temps = new int[days];
    
    // Input and store the temperatures in the array
    for(int i = 0; i < temps.length; i++) {
      System.out.print("Day " + (i + 1) + "'s high temp: ");
      temps[i] = console.nextInt();
    }
    
    // Calculate and print the average
    for(int i = 0; i < temps.length; i++) {
    sumOfTemps = sumOfTemps + temps[i];
    }
    
    averageTemp = sumOfTemps/numOfDays;
    //cast the avg temp calculation to a double to avoid integer math
    System.out.println("The avg temperature was: " + (double)sumOfTemps/numOfDays);
    
    //calculate variance
    for(int i = 0; i < temps.length; i++) {
    varianceSum = varianceSum + Math.pow((double)(temps[i] - averageTemp),2);
    }
    //calculation for Standard deviation is the square root of the sum of all of the variances
    standardDeviation = Math.sqrt(varianceSum);
    System.out.println("Standard deviation is " + standardDeviation);
    
  }
}