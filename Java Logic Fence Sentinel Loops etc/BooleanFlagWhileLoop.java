
import java.util.*;

public class BooleanFlagWhileLoop {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    boolean continueLoop = true;
    double num = -1;  // need to declare num outside the loop
    
    while (continueLoop) {
    System.out.print("Enter a nonnegative number: ");
      while (!console.hasNextDouble( )) {
        console.next(); //flush buffer
        System.out.print("Enter a nonnegative number: ");
      }
      num = console.nextDouble();
      if (num >= 0) {
        System.out.println("Great! You entered a positive double.");
        continueLoop = false;
      }else {
        System.out.println("Error. You entered a negative number!");
        continueLoop = true;
      }
    }
    double root = Math.sqrt(num);
    System.out.print("The square root of " + num + " is " + root);
  }
}