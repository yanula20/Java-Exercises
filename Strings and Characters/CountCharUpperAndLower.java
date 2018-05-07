import java.util.*;

public class CountCharUpperAndLower {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String string = getUserInput(console);
    int lowerCase = getLowerCase(string);
    int upperCase = getUpperCase(string);
    System.out.println();
    reportResults(lowerCase, upperCase);
  }
  
  public static String getUserInput(Scanner console) {
    System.out.print("Enter a line of text: ");
    String string = CONSOLE.nextLine( );
    return string;
  }
  
  public static int getLowerCase(String string) {
    int lowerCaseCount = 0;
    for(int i = 0; i < string.length(); i++) {
      if((string.trim().charAt(i) == string.trim().toLowerCase().charAt(i)) 
        && string.trim().charAt(i) != ' ') {
        lowerCaseCount++;
      }
    } return lowerCaseCount;
  }
  
  
  public static int getUpperCase(String string) {
    int upperCaseCount = 0;
    for(int i = 0; i < string.length(); i++) {
      if(string.trim().charAt(i) == string.trim().toUpperCase().charAt(i)
        && string.trim().charAt(i) != ' ') {
        upperCaseCount++;
      }
    } return upperCaseCount;
  }
  
  public static void reportResults(int lowerCase, int upperCase) {
    System.out.println("You have have " + lowerCase + " lowercase letters and " + upperCase 
                         + " uppercase letters.");
  }
}

