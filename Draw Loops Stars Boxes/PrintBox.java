public class PrintBox {
  public static final int BOX_HEIGHT = 10;
  public static final int BOX_WIDTH = 10;
  public static void main(String[] args) {
    printAsterisksTopBottom();
    printAsterisksSides();
    printAsterisksTopBottom();
  }
  
  
  public static void printAsterisksTopBottom() {
    int i;
    for(i = 1; i <= 10; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
  
  public static void printAsterisksSides() {
    int numberOfLinesWithSpaces = BOX_HEIGHT - 2;
    int numberOfSpaces = BOX_WIDTH - 2;
    int j;
    int k;
    for(j = 1; j <= numberOfLinesWithSpaces; j++) {
      System.out.print("*");
      for(k = 1; k <= numberOfSpaces; k++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
  }
}