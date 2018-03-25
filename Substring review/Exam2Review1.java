import java.util.*;
import java.awt.*;
/*
 * Count the number of lower case letters.
 Count the number of digits.
 Count the number of digits and letters.
 Count the number of blanks.
 */
public class Exam2Review1 {
  public static final Scanner console = new Scanner (System.in);
  public static void main(String[] args){
  double result = getInput(console, "Input some text for analysis to find digits.");
  System.out.println("You had " + result + " digits in your text");
  
  double result1 = countSpaces(console, "Input some text for analysis to find spaces.");
  System.out.println("You had " + result1 + " spaces in your text");
  }
  public static int getInput(Scanner console, String string) {
    int digits = 0;
    System.out.print(string);
    String str = console.nextLine();
    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if(Character.isDigit(ch)){
        digits++;
      }
    } return digits;
  }
  
  public static int countSpaces(Scanner console, String string) {
    int spaces = 0;
    System.out.print(string);
    String str = console.nextLine();
    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if(ch == ' '){
        spaces++;
      }
    } return spaces;
  }
}