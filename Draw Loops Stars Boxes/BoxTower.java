
import java.util.*;

public class BoxTower {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    int ht;
    int wd;
    System.out.print("Enter height: ");
    ht = CONSOLE.nextInt();
    System.out.print("\n");
    System.out.print("Enter width: ");
    wd = CONSOLE.nextInt();
    
      printPlusLine(wd);
      printTower(ht,wd);
  }
  
  public static void printPlusLine(int width) {
   
    int col;
    
    System.out.print("+");
    for(col = 2; col <= width  - 1; col++) {
      System.out.print("-");
    }
    System.out.println("+");
    
  }
  
  public static void printTower(int height, int width) {
    int row;
    int col;
    int spaces1 = (((width - 4) - 2) / 2)+1;
    int spaces = ((width - 4) - 2) / 2;
    
    
    for(row = 1; row <= height-1; row++) {
      if(row%2 == 1) {
        System.out.print("|");
        for(col = 2; col <= width - 1; col++) {
           System.out.print(" ");
        }
        System.out.println("|");
        printPlusLine(width);
      }
      if(row%2 == 0) {
        System.out.print("|");
      
          for(col = 1; col <= spaces; col++) {
            System.out.print(" ");
          }
          
          System.out.print("java");
          if(width%2 ==1) {
           spaces = spaces1;
          } else {
            spaces = spaces;
          }
          for(col = 1; col <= spaces; col++) {
            System.out.print(" ");
          }
    
        System.out.println("|");
        printPlusLine(width);
      
      }
    }
  }
}


