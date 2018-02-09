public class PrintBoxes {
  public static void main(String[] args) {
    drawBoxesWithDimensions(10,5);
    drawBoxesWithDimensions(6,30);
  }
  
  public static void writeStars(int w) {
    int i;
    for(i = 1; i <= w; i++) {
      System.out.print("*");
    }
  }
  
  public static void drawBoxesWithDimensions(int h, int w) {
    int i;
  
    writeStars(w);
    System.out.println();
    
    //draw box sides
    for(i = 1; i <= h - 2; i++) {
      int b;
      System.out.print("*");
      
        /*WARNING:it is a mistake to use i as the initialization variable below b/c i would have been 
        in the same scope as i-initializer in outer for loop */
        for(b = 1; b <= w-2; b++) {
          System.out.print(" ");
        }
        
      System.out.println("*");
    }
   
    writeStars(w);
    //Spacing between boxes
    System.out.println();

  }//end drawBoxesWithDimensions
}