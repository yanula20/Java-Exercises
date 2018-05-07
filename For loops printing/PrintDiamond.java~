import java.util.*;

public class PrintDiamond {
  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("  ** ");
    System.out.println(" **** ");
    System.out.println("******");
    System.out.println("******");
    System.out.println(" **** ");
    System.out.println("  ** ");
    
    System.out.print("Enter an even number for the diamond height: ");
    int height = CONSOLE.nextInt();
    int width = height;

    drawDiamondTop(height, width);
    drawDiamondBottom(height, width);
  }
  
  public static void drawDiamondTop(int height, int width) {
    int row;
    int col;
    for(row = 1; row <= height / 2; row++){
     
      for(col = 1; col <= width/2 - row; col++) {
        System.out.print(" ");
      }
      
      //stars
      for(col = 1; col <= row*2; col++) {
        System.out.print("*");
      }System.out.print("\n");
    }
  }
  
  public static void drawDiamondBottom(int height, int width) {
    int row;
    int col;
    for(row = 1; row <= height / 2; row++) {
      //spaces
      for(col = 1; col <= row - 1; col++) {
        System.out.print(" ");
      }
      //stars
      for(col = 1; col <= width - (row-1)*2; col++) {
        System.out.print("*");
      }System.out.print("\n");
    }
  }
}