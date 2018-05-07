import java.util.*;

public class ScannerLookAhead2{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    
    getDouble(console, "Please enter a double");
  }
  public static void getDouble(Scanner console, String str){
    System.out.print(str);
    while(!console.hasNextDouble() || console.hasNextInt()){
      String trash = console.next(); //flush buffer
      System.out.print("You did not enter a double: " + trash + ". ");
      System.out.print(str);
    }
    
    double d = console.nextDouble();
    System.out.println("Good job. You entered double: " + d);
  }
}