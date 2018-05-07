import java.util.*;

public class CountDigits {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    getIntro();
    String stringUser = promptString("Enter a line of text: ");
    int results = countDigits(stringUser);
    printResults(results);
  }
  public static void getIntro() {
    System.out.println("This program counts the number\n of integers in a line of text\n via user input.");
    System.out.println();
    System.out.println();
  }
  public static String promptString(String text) {
    System.out.print(text);
    String string = CONSOLE.nextLine( );
    return string;
  }
  public static int countDigits(String string) {
    int count = 0;
    for( int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);
      if(string.charAt(i)!= ' ' && Character.isDigit(c)) {
        count++;
      }
    } 
    return count;
  }
  
  public static void printResults(int results) {
    System.out.println("Your text contained " + results + " digits.");
  }
}

