
/* 1)create an array of positive integers of any length
 * 2) fill the array to desired length with while loop and count++
 * 3) outside while loop that runs while count > 2
 4) use a nested for loop to increment a variable for array range inclusively
 - use if statement to find counts 2 or greater means repeats
 - select that index and fill it with random*/

import java.util.*;
import java.util.Arrays;
public class RandomNumbersManipulationExercise{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    getInt(console, "Select the maximim for a 1 to max Random integer range");
  }
  
  public static void getInt(Scanner console, String str) {
    System.out.print(str);
    int maxRange1 = console.nextInt();
    Random r = new Random();
    int random = r.nextInt(maxRange1) + 1;
    int[] array = new int[maxRange1];
    int count = 3;
    int i;
    while(count > 2) {
      //fill array completely
      for(i = 0; i < array.length; i++){
        random = r.nextInt(maxRange1) + 1;
        array[i] = random;
      }
      //check for repeats and tally count
      for(int j = 1; j <= array.length; j++){//matches 1 to max, i.e. 1 to 7
        for(i = 0; i < array.length; i++){//array indices
          if(array[i] == j){
          count++;
          }
          
       
          while(count >=2 && random != j){
           random = r.nextInt(maxRange1) + 1;
           array[i] = random = j;
          System.out.print(j + " > " + count + " " );
          count--;
          }
      }//1 only
    }//1 then 2, then 3
    System.out.println(Arrays.toString(array));
   
  }
}
}