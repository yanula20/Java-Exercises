/* int rating = 1 + randomObject.nextInt(10); 
 * This generates a random number from 1 to 10.*/

/* int inRange = 5 + randomObject.nextInt(11); */

/* To generate a random double in some range, you need to figure 
 * out the difference between the maximum and the minimum, and you need 
 * to add the minimum.  Suppose the range is from 1.3 to 4.2  
 * The difference is 2.9, and 1.3 is the minimum.
 * double d = 1.3 + 2.9 * randomObject.nextDouble( );
 */

/* a random integer between 1 and 100 inclusive?
 a random integer between 50 and 100 inclusive?
 a random integer between 4 and 17 inclusive?
 a random GPA value between 1.5 and 4.0?
 */
import java.util.*;
import java.util.Arrays;
public class SimpleRandomNumbers{
  
  public static void main(String[] args){
    //random 1 to 100 inclusive
    Random r = new Random();
 
    printOneToHundredInclusive(r);//1 to 100
    System.out.println();//spacing
    System.out.println();//spacing
   
    printOneToFiftyInclusive(r);//1 to 50
    System.out.println();
    System.out.println();
    //4 to 17 inclusive
    Random k = new Random();
  
    printFourToSeventeenInclusive(k);
  }
  public static void printFourToSeventeenInclusive(Random k ){
    int count = 1;
    while(count <= 30){
      double four2Seventeen = 4 + 13*k.nextDouble();
      System.out.printf("%2.0f ", four2Seventeen);
      count++;
    }
  }

  public static void printOneToHundredInclusive(Random r){
    int count = 1;
 
    int [] storeNums = new int[100];
    while(count <= 100 ){
      for(int i = 0; i < storeNums.length;i++){
        int oneToHundred = r.nextInt(100) + 1;
        storeNums[i] = oneToHundred;
      }
      count++;

    }//end while loop
    System.out.print(Arrays.toString(storeNums));
  }
  
  public static void printOneToFiftyInclusive(Random r){
    int count = 0;
    while(count <= 50){
      int oneToFifty = r.nextInt(50) + 1;
      System.out.print(oneToFifty + " ");
      count++;
    }
  }
}