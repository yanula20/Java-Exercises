import java.util.*;

public class FindLargestNumber {
  
  public static void main(String[] args) {
    char largestDigit;
    Scanner console = new Scanner(System.in);
    programIntro();
    String text = getUserText(console);
    String stringSearch = createStringOfDigits(text);
    if(stringSearch.equals("")) {
     System.out.println("No digits were found in your entry.");
    } else {
      largestDigit = findLargestDigitInString(stringSearch);
      reportResults(largestDigit);
    }
  }
  
  public static void programIntro() {
    System.out.println("This program finds the largest digit within text entered by the user");
  }
  
  public static String getUserText(Scanner console) {
    System.out.print("Enter text with digits in any number of places.");
    String text = console.nextLine();
    return text;
  }
  
  public static String createStringOfDigits(String text) {
    String zero = "";
    char c;
    String stringOfDigits = "";
    for(int i = 0; i < text.length(); i++) {
      c = text.charAt(i);
      if(Character.isDigit(c)) {
        stringOfDigits = stringOfDigits + c;
      } 
    }if(!stringOfDigits.equals(zero)) {
      return stringOfDigits;
    }else {
      return zero;
    }
  }
  
  public static char findLargestDigitInString(String stringSearch) {
    char digit;

    char result = '\0';//invariant; largest digit seen so far
   
    for(int i = 0; i < stringSearch.length(); i++) {
      digit = stringSearch.charAt(i);
     
      if((int)digit > result){
         result = digit;
      } 
    }
    return result;
  }
  
  public static void reportResults(char largestDigit) {
    System.out.println("The largest digit in your text was " + largestDigit + "!");
  }
}