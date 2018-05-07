/*
 * The Character class has many useful functions for operating on chars.  
 * These methods are called by putting Character. in front and including 
 * the char as a parameter
 * isDigit(ch) boolean returns true if ch is a digit
 * isLetter(ch) boolean returns true if ch is in 'A' to 'Z' or 'a' to 'z'
 * isLowerCase(ch) boolean returns true if ch is a lowercase letter
 * isUpperCase(ch) boolean returns true if ch is an uppercase letter
 * toLowerCase(ch) char returns the lowercase version of ch
 * toUpperCase(ch) char returns the uppercase version of ch
 * 
 */

import java.util.*;

public class CharPrintedByInt {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print( (char)32 + ",");
    for(int i = 33; i <= 126; i++) {
     System.out.print(", " + (char)(i)  );
    }System.out.println("\n");
  }
}