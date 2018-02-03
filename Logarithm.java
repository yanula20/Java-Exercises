import java.lang.*;

public class Logarithm {
  public static void main(String[] args) {
    System.out.println("The logarithm of 10 base 2 equals " + logarithmCalculation(10));
    System.out.println("The logarithm of 8 base 2 equals " + logarithmCalculation(8));
  }
  
 
  /* log 2 8 = y is the same as 2 to what power = 8
   * 2^y = 8
   * log(2^y) = log(8)
   * y*log(2) = log(number) > log power rule
   * y = log(number)/log(2) > dividelog(2) by both sides
   */
  public static double logarithmCalculation(int number) {
    double result = Math.log(number)/Math.log(2);
    return result;
  }
}