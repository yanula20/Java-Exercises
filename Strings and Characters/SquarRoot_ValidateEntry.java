import java.util.*;

public class SquarRoot_ValidateEntry{
  
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    getIntro();
    getUserInput();
  }
  public static void getIntro() {
    System.out.println("This program calculates the square root of a number based on user input.");
    System.out.println("Program validates input to ensure that non-negative numbers are used.");
    System.out.println();
  }
  
  public static void getUserInput() {
    double numberFromUser = 1.0;
    boolean noExp = false;
    while(noExp == false) {
      System.out.println("Please enter a VALID value for square root calc.");
      try {
        numberFromUser = CONSOLE.nextDouble();//fires when false, code checked
        noExp = true;
      } catch(IllegalArgumentException e) {
        System.err.println("Illegal negative number:" +  e.getMessage());
        CONSOLE.nextLine();
      } catch (InputMismatchException e) {
        System.err.println("Input mismatch: " + e.getMessage());
        CONSOLE.nextLine();
      }
    }
    
    //use default value
    System.out.println();
    double finalAnswer = calculateSquareRoot(numberFromUser);
    printResults(finalAnswer); 
    
  }
  
  public static double calculateSquareRoot(double numberFromUser) {
    return Math.sqrt(numberFromUser);
  }
  
  public static void printResults(double finalAnswer) {
    System.out.printf("The square root of the number you entered is %3.2f\n", finalAnswer);
  }
}

