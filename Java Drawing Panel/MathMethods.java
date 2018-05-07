public class MathMethods {
  public static void main(String[] args) {
    double abs = Math.abs(-1.23);
    System.out.println("Absolute value of -1.23 is " + abs);
    System.out.println("Math.pow(a,b) calculates a^b, ex. 4^7 equals " +  getMathPower(4, 7));
    System.out.println("Math.pow(a,b) calculates a^b, ex. 10^-2 equals " +  getMathPower(10, -2));
    System.out.println("Math.round(#.###), Math.round(Math.PI) + Math.round(Math.E) equals " + getMathRounded(Math.PI, Math.E));
    System.out.println("Math.round(#.###), Math.round(2.34567) + Math.round(7.65) equals " + getMathRounded(2.34567, 7.65));
    System.out.println("Rouned > Math.ceil(6.022) + Math.floor(15.9994)), is equivalent to adding. " + Math.ceil(6.022) + " + " +  Math.floor(15.9994) + " = " + getMathRounded(Math.ceil(6.002), Math.floor(15.9994)));
    System.out.println("Math.abs(Math.min(-3, -5)) evaluates to " + Math.abs(Math.min(-3, -5)) + ".");
    System.out.println("Which Method would evaluate negative number to zero?");
    System.out.println("Math.max(-num, 0) should evaluate negative numbers to 0, ex Math.max(-3,0) equals " + Math.max(-3, 0));
  }
  
  //note: return type is double with int formal arguments
  public static double getMathPower(int number, int power) {
    return Math.pow(number,power);
  }
  
  public static double getMathRounded(double num1, double num2) {
    return Math.round(num1) + Math.round(num2);
  }
}





/*Math.pow(10, -2)
 Math.sqrt(121.0) - Math.sqrt(256.0)
 Math.round(Math.PI) + Math.round(Math.E)
 Math.ceil(6.022) + Math.floor(15.9994)
 Math.abs(Math.min(-3, -5))
 */

