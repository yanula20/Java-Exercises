/* Use == to test equality of chars.  Use the equals method to test equality of Strings. */

import java.util.*;

public class CharVsStringComaprison {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    char c = 'y';
    String s = c + "es";
    System.out.println(c == 'y');         // prints true
    System.out.println(s == "yes");       // prints false!
    System.out.println(s.equals("yes"));  // prints true
    System.out.println(s.equals("ye"));  // prints false
  }
}
