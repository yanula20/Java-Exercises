// We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

public class PrintStars2 {
  public static final int TOTAL_ROWS_FOR_UPWARD_ARROW = 10;
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("upward arrow half");
    // print six rows
    for (int row = 1; row <= 6; row++) {
      // print row stars and a newline
      for (int column = 1; column <= row; column++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    //spacing
    System.out.println();
    System.out.println("downward arrow half");
    //modified arrow pointing downward
    for (int row = 1; row <= 6; row++) {
      // print row stars and a newline
      for (int column = 6; column >= row; column--) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    //spacing
    System.out.println();
    System.out.println("Arrowhead UP, you pick the number of rows!");
    System.out.print("Enter the number of rows for your arrow: ");
    int numberOfRowsForYourArrow = CONSOLE.nextInt();
    
    //User-defined rows with 2 * row - 1, i.e. an odd number of stars
    for (int row = 1; row <= numberOfRowsForYourArrow; row++) { 
      
      /* include spacing before drawing first asterisk; spacing 
      equals numberOfRowsForYourArrow - row */
      for (int column = 1; column <= numberOfRowsForYourArrow - row; column++) {
        System.out.print(" ");
      }
      
      // print 2 * row - 1 stars and a newline
      for (int column = 1; column <= (2 * row) - 1; column++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    //spacing
    System.out.println();
    System.out.println("Arrowhead DOWN, you pick the number of rows!");
    System.out.print("Enter the number of rows for your arrow: ");
    int numberOfRowsForArrowDown = CONSOLE.nextInt();
    
    //User-defined rows with 2 * row - 1, i.e. an odd number of stars
    for (int row = 1; row <= numberOfRowsForArrowDown; row++) { 
      
      for (int column = 1; column <= row - 1; column++) {
        System.out.print(" ");
      }
      
      /* draw odd number of asterisks (2 * numberOfRowsForArrowDown - 1), 
       * but take a factor of two away on each successive row
      */
      for (int column = 1;  column <= (2 * numberOfRowsForArrowDown - 1) - 2 * (row - 1); column++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}