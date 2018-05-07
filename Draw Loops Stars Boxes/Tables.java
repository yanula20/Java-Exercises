/* This Tables.java program has two features/methods. 
 * In the first method, the user enters a base and the maximum value for x, an exponent for b.  
 * The table is printed showing the results for different values of x, from 0 to x's maximum value.
 * The second method takes user input for a max numerator (n) and a max denominator (d) and, then,
 * prints a tabled result of n % d for different values of n and d. Note: values of n and d are 
 * printed from 1 to their max (user-entered) values.
 */

// We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

//Tables.java program with two features
public class Tables {
  
  // set up a class constant named CONSOLE to read from the keyboard
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  //main method
  public static void main(String[] args) {
    System.out.println("Project 1 written by Donald Moore, myUTSAID: qxv177");
    
    //Feature 1: method call to create the Powers of a Number table
    createPowersOfNumberTable ();
    
    //Feature 2: method call to create the Remainders table
    createRemaindersTable();
  }
  
  //Main method for feature 1, create the Powers of a Number table
  public static void createPowersOfNumberTable () {
    int base;
    int maxExponent;
    int exponent;
    
    //Statement to request and store user input for the base in 'base' variable
    System.out.print("Enter the base: ");
    base = CONSOLE.nextInt();
    
    //Statement to request and store user input for the exponent(s) in 'maxExponent' variable
    System.out.print("Enter the maximum exponent: ");
    maxExponent = CONSOLE.nextInt();
    
    System.out.print("The base is " + base + " and the exponent is " + maxExponent + "\n");
    
    //Print the TITLE of the table using the 'base' variable above
    System.out.println("\t" + "Powers of " + base + "\n");
    
    //Print HEADERS for the table's columns
    System.out.println("\t" + "x" + "\t" + base + "^x");
    
    //Hard-code first row of table since any base to exponent 0 = 1;
    System.out.println("\t" + 0 + "\t" + 1);
    
    for( exponent = 1;  exponent <= maxExponent;  exponent++) {
      System.out.print("\t" +  exponent);
      System.out.println("\t" + (int)Math.pow(base, exponent));
    }
    //vertical spacing between tables
    System.out.println();
  }//end createPowersOfNumberTable
  
  //Main method for feature 2, create the Remainders table
  public static void createRemaindersTable() {
    int maxNumerator;
    int maxDenominator;
    int n; //for table header
    int columnOneNumerator; //used in the outside for loop  
    int denominatorPlusIncremented; //used in nested for loop
    
    /* Statement to request and store user input 
     * for the numerator in the 'maxNumerator' variable
     */
    System.out.print("Enter the maximum numerator: ");
    maxNumerator = CONSOLE.nextInt();
    
    /* Statement to request and store user input 
     for the denominator in the 'maxDenominator' variable
     */
    System.out.print("Enter the maximum denominator: ");
    maxDenominator = CONSOLE.nextInt();
    
    System.out.println("The maximum numerator is " + maxNumerator + " and the maximum denominator is " + maxDenominator + "\n");
    
    //Print the TITLE of the Remainders 
    System.out.println("Remainders \n");
    
    //Print first portion of the Remainders table column header, output: "n"
    System.out.print("\tn");
    
    //Print the remaining portions of the Remainders header, output: "n%1", "n%2", "n%3", etc.
    for(n = 1; n <= maxDenominator; n++) {
      System.out.print("\t" + "n%" + n);
    }
    System.out.println();
    
    /* For loop that runs from 1 to maxNumerator. This loop only prints
     * the numerator for each row under the "n" column.
     */
    for(columnOneNumerator = 1; columnOneNumerator <= maxNumerator; columnOneNumerator++) {
      
      System.out.print("\t" + columnOneNumerator);
      
      /* Nested loop performs all remainder calculations for the each columnOneNumerator
       * by using all denominators ranging from 1 to maxDenominator */
      for(denominatorPlusIncremented = 1; denominatorPlusIncremented <= maxDenominator; denominatorPlusIncremented++) {
        
        //remainder calculations for each row
        System.out.print("\t" + columnOneNumerator % denominatorPlusIncremented);
      }
      System.out.println();
    }
  }//end createRemaindersTable
}