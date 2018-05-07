public class writeCharsToDrawBax {
  
  public static void main(String[] args) {
    
    DrawBoxSidesChars('#', 10); 
    DrawBoxSidesChars('%', 5);
  }
  
  public static void boxLidsCharsAndNumber(char ch, int number) {
    int i;
    for(i = 1; i <= number; i++) {
      System.out.print(ch);
    }
    System.out.println();//must start new line after lid and botton of box is drawn
  } 
  
  public static void DrawBoxSidesChars(char ch, int number) {
    int row;
    
    boxLidsCharsAndNumber(ch, number);
    
    // -2 b/c of lid and bottom of box
    for(row = 1; row <= number-2; row++){
      int sideRows;
      System.out.print(ch);
      
      for(sideRows = 1; sideRows <= number-2; sideRows++) {
        System.out.print(" ");
      }
      
      System.out.println(ch);
    }
    
    boxLidsCharsAndNumber(ch, number);
    
    //Spacing between boxes - must be within method
    System.out.println();
  }//end DrawBoxesChar
}
