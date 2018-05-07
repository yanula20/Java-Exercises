import java.util.*;

public class Assertions1{
  public static void main(String[] args){
  mystery(1,7);
  }
  public static void mystery(int x, int y) {
      int z = 0;
      // Point A 
      while (x >= y) { 
        // Point B
        x = x - y;
        // Point C
        z++; 
        // Point D
      }
      // Point E
      System.out.println(z);
    }
}
/*which of the following assertions are true at which point(s) in the code?
  Choose ALWAYS, NEVER, or SOMETIMES. 
              Point A     Point B     Point C     Point D     Point E  
  x < y          S        NEVER       SOMETIMES   SOMETIMES   ALWAYS
  x == y         S        SOMETIMES   SOMETIMES   SOMETIMES   NEVER
  z == 0         A        ALWAYS      ALWAYS      NEVER       SOMETIMES
  */