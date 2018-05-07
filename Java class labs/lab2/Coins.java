/* This program has two features. 
 * The first feature requests four (4) user 
 * inputs for number of quarters, dimes, nickels, and pennies.  
 * The four values, which are the number of coins for each denomination,
 * are then calculated as an output value in dollars.
 * The second feature takes user input, which is a number (in cents), and then calculates
 * the corresponding number of quarters, dimes, nickels and pennies needed to add up to 
 * the original amount input by the user.
 */

/* This is Java's java.util package which allows us to take user
input via Scanner (Scanner is part of this package) */
import java.util.*;

//Java program Coins.java with two features
public class Coins {
  
  //This statement creates the class constant CONSOLE
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  /* This is the main method that calls the two functions which 
  represent the two features of the program */
  public static void main(String[] args) {
    System.out.println("Lab 2 written Donald A. Moore, myUTSAID: qxv177");
    allCoinsInput();
    userEntryNumberOfCents();
  }
  
  /* This method takes user input for number 
   * of quarters, then calculates that amount 
   * for the user as an output in dollars.
   */
  public static void quarters( ) {
    System.out.print("Enter the number of quarters: ");
    int numberOfQuarters = CONSOLE.nextInt( );
    double quartersAmount = numberOfQuarters * 0.25;
    System.out.println(numberOfQuarters + " quarter(s) amounts to $" + quartersAmount);
    System.out.println();
  }
  
  /* This method takes user input for number 
   * of dimes, then calculates that amount 
   * for the user as an output in dollars.
   */
  public static void dimes( ) {
    System.out.print("Enter the number of dimes: ");
    int numberOfDimes = CONSOLE.nextInt( );
    double dimesAmount = numberOfDimes * 0.10;
    System.out.println(numberOfDimes + " dime(s) amounts to $" + dimesAmount);
    System.out.println();
  }
  
  /* This method takes user input for number 
   * of nickels, then calculates that amount 
   * for the user as an output in dollars.
   */
  public static void nickels( ) {
    System.out.print("Enter the number of nickels: ");
    int numberOfNickels = CONSOLE.nextInt( );
    double nickelsAmount = numberOfNickels * 0.05;
    System.out.println(numberOfNickels + " nickel(s) amounts to $" + nickelsAmount);
    System.out.println();
  }
  
  /* This method takes user input for number 
   * of pennies, then calculates that amount 
   * for the user as an output in dollars.
   */
  public static void pennies( ) {
    System.out.print("Enter the number of pennies: ");
    int numberOfPennies = CONSOLE.nextInt( );
    double penniesAmount = numberOfPennies * 0.01;
    System.out.println(numberOfPennies + " pennies amount to $" + penniesAmount);
    System.out.println();
  }
  
  /* This method calls four methods for each of the coin denominations.
   * The four methods take the user's input
   * for number of coins per denomination and, then, calculates each amount
   * for the user as an ouput.
   */
  public static void allCoinsInput() {
    quarters();
    dimes();
    nickels();
    pennies();  
  }
  
  /* This method takes user input in cents, then calculates 
   * the equivalent change that the user would receive in quarters, 
   * nickels, dimes, and pennies. 
   */
  public static void userEntryNumberOfCents() {
    //user input number of cents
    System.out.print("Enter the number of cents: ");
    int numberOfCents = CONSOLE.nextInt();
    
    /* use interger division for number of quarters, use mod
    * to calculate the remaining cents for the dime calculation */
    int numberOfQuarters = numberOfCents / 25;
    int remainderForDimesCalculation = numberOfCents % 25;
    
    /* use interger division for number of dimes, use mod
    * to calculate the remaining cents for the nickel calculation */
    int numberOfDimes = remainderForDimesCalculation / 10;
    int remainderForNickelsCalculation = remainderForDimesCalculation % 10;
    
    /* use interger division for number of nickels, use mod
    * to calculate the remaining cents for the pennies calculation */
    int numberOfNickels = remainderForNickelsCalculation / 5;
    int remainderForPenniesCalculation = remainderForNickelsCalculation % 5;
    
    //Above, the remainderForPenniesCalculation variable stores the number of pennies
    int numberOfPennies = remainderForPenniesCalculation;
     
    System.out.println();
    System.out.println("You will receive " + numberOfQuarters + " quarter(s)!");
    System.out.println("You will receive " + numberOfDimes + " dime(s)!");
    System.out.println("You will receive " + numberOfNickels + " nickel(s)!");
    System.out.println("You will receive " + numberOfPennies + " pennies!");
  }
}