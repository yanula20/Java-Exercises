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
public class RandomGPA{
  
  public static void main(String[] args){
    //a random GPA value between 1.5 and 4.0?
    //4.0 - 1.5 = 2.5
    Random r = new Random();
    double aRandomGPA = 1.5 + 2.5*r.nextDouble();
    printRandomGPAs(aRandomGPA, r);
  }
  
  public static void printRandomGPAs(double aRandomGPA, Random r){
    int count = 1;
    while(count < 20){
      aRandomGPA = 1.5 + 2.5*r.nextDouble();
      System.out.printf("% 3.2f",aRandomGPA);
      count++;
    }
  }  
}