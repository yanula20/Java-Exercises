import java.util.*;

public class PrintSquares22 {
  
  // set up a class constant named CONSOLE to read from the keyboard
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  //main method
  public static void main(String[] args) {
    int squareStart;
    int squareEnd;
    int count;
    //Request user input for the start of the square range
    System.out.print("Enter a start number for the SQUARES RANGE: ");
    squareStart = CONSOLE.nextInt();
    
    //Request user input for the end of the square range
    System.out.print("Enter an end range for the SQUARES RANGE: ");
    squareEnd = CONSOLE.nextInt();
    
    //for loop initialized with user's squareStart and test <= to user's squareEnd
    for (count = squareStart; count <= squareEnd; count++) {
      System.out.println("The square root of " + count + " is equal to " + count * count + "!");
    }
  }
}