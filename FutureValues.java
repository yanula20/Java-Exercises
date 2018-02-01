/* This program has two features. 
 * First, the program computes and returns the 
 * future value of an account based on the present value of the account,
 * the interest rate, and the number of years.
 * Second, the program computes and returns the future 
 * value of an annuity based on the payment per year, 
 * the interest rate, and the number of years.
 */

/* We need this Java utility to format our compound and annuity calcualtions
 in a more user-friendly format, i.e. new DecimalFormat("$#0.00") */
import java.text.*;

// We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

public class FutureValues {
  
  // set up a class constant named CONSOLE to read from the keyboard
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    System.out.println("Lab 3 written by Donald Moore, myUTSAID: qxv177");
    
    //For compounded interest calculation, (p) present value, (r) interest, and (y) years from user input
    double p, r, y;
    
    //For Annuity calculations; variables for stored values from user input
    double annuityValue, annuityInterestRate, annuityPeriod;
    
    //request and store user input for present value (double)
    System.out.print("Please enter the present value ($): ");
    p = CONSOLE.nextDouble();
    
    //request and store user input for interest rate (double)
    System.out.print("Please enter the interest rate: ");
    r = CONSOLE.nextDouble();
    
    //request and store user input for number of years (double)
    System.out.print("Please enter the number of years: ");
    y = CONSOLE.nextDouble();
    
    //Compounded interest calculations result(s) statement
    System.out.println("Your future value of $" + p + " at a " + r + "% interest rate " + "for " + y + " years is " + moneyString(calculatedCompoundInterest(p, r, y )));
    
    //request and store user input for ANNUITY value (double)
    System.out.print("Please enter the annuity amount ($): ");
    annuityValue = CONSOLE.nextDouble();
    
    //request and store user input for ANNUITY interest rate (double)
    System.out.print("Please enter the annuity interest rate: ");
    annuityInterestRate = CONSOLE.nextDouble();
    
    //request and store user input for ANNUITY period (double)
    System.out.print("Please enter the annuity number of years: ");
    annuityPeriod = CONSOLE.nextDouble();
    
    //Annuity calculation result(s) statment
    System.out.println("Your annuity ammount of $" + annuityValue + " at rate " + annuityInterestRate + "% over a " + annuityPeriod + "-year annuity period will yield " + moneyString(calculatedAnnuity(annuityValue, annuityInterestRate, annuityPeriod)) + " dollars.");   
  }
  // Returns a String $dollars.cents rounded to the nearest cent.
  // For example, moneyString(12.3456) returns "$12.35".
  public static String moneyString(double amount) {
    DecimalFormat dollarsAndCents = new DecimalFormat("$#0.00");
    return dollarsAndCents.format(amount);
  }
  
  //method is used to calculate compounded interest
  public static double calculatedCompoundInterest(double p, double r, double y) {
    double futureValue;
    futureValue = p*(double)Math.pow(1 + r / 100, y);
    return futureValue;
  }
  
  //method uses three arguments to calculate an annuity value at a certain rate over an anuity period in years
  public static double calculatedAnnuity(double annuityValue, double annuityInterestRate, double annuityPeriod) {
    double futureAnnuityValue;
    futureAnnuityValue = annuityValue*( ((double)Math.pow(annuityInterestRate/100 + 1,annuityPeriod)-1)/(annuityInterestRate/100) ); 
    return futureAnnuityValue;
  }
}