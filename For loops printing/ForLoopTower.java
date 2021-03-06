/* +---+
 * \   /
 * /   \
 * \   /
 * /   \
 * \   /
 * /   \
 * +---+
 */
import java.util.*;

public class ForLoopTower {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    drawTower();
  }
  
  public static void drawTower() {
    int rows;
    int cols;
    
    System.out.print("Enter tower columns: ");
    int towerColumns = CONSOLE.nextInt();
    
    System.out.print("Enter tower rows: ");
    int towerRows = CONSOLE.nextInt();
    
    //tower top
    for(cols = 1; cols <= towerColumns; cols++) {
      System.out.print("+");
      
      for(cols = 2; cols <= towerColumns - 1; cols++) {
        System.out.print("-");
      }
      System.out.print("+\n");
    }
    
    for(rows = 2; rows <= towerRows - 1; rows++) {
      if(rows % 2 == 0) {
        System.out.print("\\");
        for(cols = 2; cols <= towerColumns - 1; cols++) {
          System.out.print(" ");
        }
        System.out.print("/\n");
      } else {
        System.out.print("/");
        for(cols = 2; cols <= towerColumns - 1; cols++) {
          System.out.print(" ");
        }
          System.out.print("\\\n");
      }

    }//end rows for loop
    
    //bottom of tower
    for(cols = 1; cols <= towerColumns; cols++) {
      System.out.print("+");
      for(cols = 2; cols <= towerColumns - 1; cols++) {
        System.out.print("-");
      }
      System.out.print("+\n");
    } //end bottom tower
  }//end drawTower()
}//end main program ForLoopTower

