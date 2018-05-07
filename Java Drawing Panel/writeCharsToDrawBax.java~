public class writeCharsToDrawBax {
  
  public static void main(String[] args) {
    
    DrawBoxChars('#', 10); 
    DrawBoxChars('%', 5);
  }
  
  public static void boxLidsCharsAndNumber(char ch, int number) {
    int i;
    for(i = 1; i <= number; i++) {
      System.out.print(ch);
    }
    System.out.println();
  } 
  
  public static void DrawBoxChars(char ch, int number) {
    int row;
    
    boxLidsCharsAndNumber(ch, number);
    
    for(row = 1; row <= number-2; row++){
      int sideRows;
      System.out.print(ch);
      
      for(sideRows = 1; sideRows <= number-2; sideRows++) {
        System.out.print(" ");
      }
      
      System.out.println(ch);
    }
    
    boxLidsCharsAndNumber(ch, number);
    //Spacing between boxes - must be within
    System.out.println();
  }//end DrawBoxesChar
}
