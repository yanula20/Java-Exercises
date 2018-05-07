import java.lang.*;

/* Write a function that returns the fractional part of a double */

public class FractionalPart {
  public static void main(String[] args) {
    System.out.println("The fractional part of 10.876 is " + fractionalPart(10.876));
    System.out.println("The fractional part of 456.234 is " + fractionalPart(456.234));
  }
  
  public static double fractionalPart(double number) {
    return number - Math.floor(number);
  }
}