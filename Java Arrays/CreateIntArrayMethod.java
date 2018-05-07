import java.util.*;
import java.util.Arrays;

public class CreateIntArrayMethod{
  //class constant for acquiring user input from Scanner
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    // Input the number of days from the user.
    System.out.print("How many days' temperatures? ");
    int days = console.nextInt( );
    while(days < 0){
      System.out.print("INVALID. How many days' temperatures? ");
      days = console.nextInt( );
    }
    
    int[] createdArray = createArrayOfTemps(days);
    System.out.println(Arrays.toString(createdArray));
    
    double avgTemp = calculateAverageTemp(createdArray);
    System.out.println("The average temperature was " + avgTemp);
  }//end main
  
  //note: return type will be char for function when string is segmented for the array
  public static int[ ] createArrayOfTemps(int days) { 
    //create an array of length days 
    int[] temps = new int[days];
    //store temp values in a zero-indexed array
    for(int i = 0; i < temps.length; i++){
      System.out.print("Day " + (i+1) + "'s high temp: ");
      temps[i] = console.nextInt();
    }
    return temps;
  }
  
  public static double calculateAverageTemp(int[] createdArray){
    double sumOfTemps = 0.0;
    double avgTemp;
    for(int temp : createdArray){
      sumOfTemps = sumOfTemps + temp;
    }
    avgTemp = sumOfTemps / (double) createdArray.length;
    return avgTemp;
  }//calculateAverageTemp()
  
}