import java.util.*;

public class CharAt_WithStrings {
 
  public static void main(String[] args) {
    String s = "yes";
    char c0 = s.charAt(0);
    char c1 = s.charAt(1);
    char c2 = s.charAt(2);
    System.out.println(c0);  // prints y
    System.out.println(c1);  // prints e
    System.out.println(c2);  // prints s
    /* char c3 = s.charAt(3); */   // causes an error
  }
}

