import java.util.*;

public class CountCharInAString {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    getIntro();
    getUserInput();
  }
  
   public static void getIntro() {
    System.out.println("This program counts the number of occurences");
    System.out.println("of a character in a text.");                 
    System.out.println("The text is input by the user.");
    System.out.println("The character is also entered by the user.");
    System.out.println();

  }
  public static void getUserInput() {
    System.out.print("Enter a line of text: ");
    String string = CONSOLE.nextLine( );
    System.out.print("Enter a character:  ");
    char ch = CONSOLE.next().charAt(0);
 
    System.out.println();
    int count = countCharacters(string, ch);
    printResults(count, ch);
  }
  

  public static int countCharacters(String string, char ch) {
    int count = 0;
    //<, not <= ensures that we don't go out of range since length() is 1 more than index i
    for( int i = 0; i < string.length(); i++) {
      if(string.charAt(i) == ch) {
        count++;
      }
    } return count;
  }
  
  public static void printResults(int count, char ch) {
    System.out.println("Your character " + ch + " was found " + count + " times in the string.");
  }
}

