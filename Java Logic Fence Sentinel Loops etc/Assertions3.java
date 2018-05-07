import java.util.*;
public class Assertions3{
  public static final  Scanner console= new Scanner(System.in);
  public static void main(String[] args){
    pow(7,8);
  }
// This method assumes y >= 0, and returns x^y.
  public static int pow(int x, int y) {
    int prod = 1;
    // Point A Y >0: YS,        Y even?: YS
    while (y > 0) {
      // Point B Y > 0: YA     Y even?: YS
      if (y % 2 == 0) {
        // Point C Y > 0: YA     Y even?: YA b/c of if statement
        x = x * x;
        y = y / 2; //b/c of integer math and to break out of loop: Y > 0: YS       
        // Point D    Y even?: YS, integer div, even and 0 due to integer div
      } else {
        // Point E Y > 0: Y > 0: YA, becasue of while loop and before decrementing Y even?: YN b/c of else
        prod = prod * x; 
        y--;
        // Point F to break out of loop y < 0 must occur sometmies: Y > 0: YS    Y even?: YS starts odd, subtract 1
      }
    }//end while loop
    /* Point G if Y = O, YN, if Y > 0 enters loop and becomes Y < 0 to breakout: YN  Y even?: can be 0, 
    but Y< 0 for loop breakout YN */
    return prod;
  }
}
/*which of the following assertions are true at which point(s) in the code?
 Choose ALWAYS, NEVER, or SOMETIMES.
             Point A     Point B     Point C     Point D     Point E     Point F     Point G  
 y > 0       SOMETIMES   ALWAYS      ALWAYS      SOMETIMES   ALWAYS      SOMETIMES   NEVER
 y % 2 == 0  SOMETIMES   SOMETIMES   ALWAYS      SOMETIMES   NEVER       SOMETIMES   NEVER
 */