import java.util.*;

public class CharAt_WithStrings1 {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter a line of text: ");
    String string = CONSOLE.nextLine( );
    //<, not <= ensures that we don't go out of range since length() is 1 more than last index i
    for( int i = 0; i < string.length(); i++) {
     System.out.println(string.charAt(i) + " is the char at index " + i);
    }
  }
}

