import java.util.*;
import java.awt.*;

public class LettersAndDigits {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.print("Enter some text for analysis,i.e. digits and letters." );
    String str = console.nextLine();
    double result = analyzeInput(str);
    System.out.println("The total digits and letters equals " + result);
  }
  
  public static double analyzeInput(String str){
    double digits = 0;
    double spaces = 0;
    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if(Character.isDigit(ch)){
        digits++;
      }else if(Character.isLetter(ch)){
         spaces++;
      }
    }
    return digits + spaces;
  }
}