import java.util.*;


public class InputOneOfTwoValues {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    boolean continueLoop = true;
    System.out.print("Enter an int equal to -999 or a double equal to 3.14.");
    while(continueLoop){
      if(console.hasNextDouble()){//applies to integers, -999 as well
        double num = console.nextDouble();
        if(num == -999){
          System.out.println("You entered -999.");
          continueLoop = false;
        }else if(num == 3.14){
          System.out.println("You entered 3.14.");
          continueLoop = false;
        }else {
          System.out.print("Sorry. Enter an int equal to -999 or a double equal to 3.14.");
        }
      }else{
        String trash = console.next();
        System.out.println("INVALID. You entered a letter.");
        System.out.print("Enter an int equal to -999 or a double equal to 3.14.");
      }
    }
  }
}