import java.util.*;
public class Assertions2{
  public static final  Scanner console= new Scanner(System.in);
  public static void main(String[] args){
    mystery(console);
  }
  public static int mystery(Scanner console) {
    int prev = 0;
    int count = 0;
    int next = console.nextInt();
    // Point A
    while (next != 0) { 
      // Point B 
      if (next == prev) { //never true
        // Point C
        count++;
      } 
      prev = next;//rewrite prev from 0 to s.thing else, no longer 0 b/c next cannot be 0

      next = console.nextInt(); 
      // Point D 
    }//end while
    // Point E
    System.out.println("prev " + prev);
    System.out.println("next " + next);
    return count;
  }
}
/*which of the following assertions are true at which point(s) in the code?
 Choose ALWAYS, NEVER, or SOMETIMES.
                 Point A        Point B     Point C     Point D     Point E  
  prev == 0      ALWAYS         ALWAYS       NEVER       NEVER      SOMETIMES
  next == 0      SOMETIMES      NEVER        NEVER       NEVER      SOMETIMES
  next == prev   SOMETIMES      NEVER        NEVER       ALWAYS     ALWAYS
 */