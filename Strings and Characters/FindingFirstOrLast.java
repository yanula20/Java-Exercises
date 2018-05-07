import java.util.*;
public class FindingFirstOrLast {
  public static final Scanner console = new Scanner(System.in);
  public static void main(String[ ] args) {
    getIntro();
    String textFromUser = getUserText(console);
    char firstDigit = textFirstDigit(textFromUser);
    char digitLast = textLastDigit(textFromUser);
    char firstEvenDigit = textFirstEvenDigit(textFromUser);
    char firstLower = textFirstLowerCase(textFromUser); 
    char firstUpper = textFirstUpperCase(textFromUser); 
    reportResults(firstDigit, digitLast, firstEvenDigit, firstLower);
    reportResults2(firstUpper); 
  }
  
  public static void getIntro() {
    System.out.println("This program finds the maximum of a sequence of numbers.\n");
  }
  
  public static String getUserText(Scanner console) {
    System.out.print("Please enter a line of text to examine.");
    String text = console.nextLine();
    return text;
  }
  
  public static char textFirstDigit(String textFromUser) {
    char zero = '0';
    for(int i = 0; i < textFromUser.length(); i++) {
      char c = textFromUser.charAt(i);
      if(Character.isDigit(c)) {//boolean returns true
        return c;
      } 
    }
    return zero;
  }
  public static char textLastDigit(String textFromUser) {
    char zero = '\0';
    for(int i = textFromUser.length()-1; i >= 0; i--) {
      
      char c = textFromUser.charAt(i);
      if(Character.isDigit(c)) {//boolean returns true
        return c;
      } 
    }
    return zero;
  }
  
  public static char textFirstEvenDigit(String textFromUser) {
    char zero = '\0';
    for(int i = 0; i < textFromUser.length(); i++) {
      char c = textFromUser.charAt(i);
      if(Character.isDigit(c) && (c%2 == 0)) {
        return c;
      }
    }
    return zero;
  }
  
  public static char textFirstLowerCase(String textFromUser) {
    char zero = '\0';
    for(int i = 0; i < textFromUser.length(); i++) {
      char c = textFromUser.charAt(i);
      if(c == textFromUser.toLowerCase().charAt(i)) {
        return c;
      }
    }
    return zero;
  }
  
  public static char textFirstUpperCase(String textFromUser) {
    char zero = '0';
 
    for(int g = 0; g < textFromUser.length(); g++) {
      char c = textFromUser.charAt(g);
  
      if(c == textFromUser.toUpperCase().charAt(g)) {
        
        return c;
      }
    }
    return zero;
  }
  
  
  public static void reportResults(char firstDigit, char digitLast, char firstEvenDigit, char firstLower) {
    
    System.out.println("The first digit was " + firstDigit + " (0 means no digits)");
    System.out.println("The last digit was " + digitLast + " (0 means no digits)");
    System.out.println("The first even digit was " + firstEvenDigit + " (0 means even digits)");
    System.out.println("The first lowercase " + firstLower + " (0 means no lowercase)");
  }
  
  public static void reportResults2(char firstUpper) {
     System.out.println("The first uppercase " + firstUpper + " (0 means no uppercase)");
  }
}