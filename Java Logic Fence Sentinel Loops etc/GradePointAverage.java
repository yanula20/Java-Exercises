import java.util.*;

public class GradePointAverage{
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args){
    boolean continueLoop = true;
    double gpa = 5.0;
    System.out.print("Enter your GPA (between 0.0 and 4.0");
    while(continueLoop){
      if(console.hasNextDouble()){//works for int values as well
        double input = console.nextDouble();
        if(0.0 < input && input <= 4.0){
          System.out.println("You entered " + input + " as your gpa.");
          continueLoop = false;
        }else {
         System.out.print("Error. Please, enter your GPA (between 0.0 and 4.0");
        }
      }else{
          String trash = console.next( );
          System.out.print("Enter your GPA (between 0.0 and 4.0");
        }
    }
  }
}