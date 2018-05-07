import java.util.*;

public class ScannerLookAhead{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    getInt(console, "Please enter an integer");
    getDouble(console, "Please enter a double");
  }
  
  public static void getInt(Scanner console, String str){
    System.out.print(str);
    while(!console.hasNextInt()){
      String trash = console.next(); //flush buffer
      System.out.println("You did not enter an int: " + trash);
      System.out.print(str);
    }
    int keeper = console.nextInt();
    System.out.println("Good job. You entered int: " + keeper);
  }
  
  public static void getDouble(Scanner console, String str){
    System.out.print(str);
    while(!console.hasNextDouble()){
      String trash = console.nextLine(); //flush buffer
      System.out.println("You did not enter a double: " + trash);
      System.out.print(str);
    }
    
    double d = console.nextDouble();
    System.out.println("Good job. You entered double: " + d);
  }
}