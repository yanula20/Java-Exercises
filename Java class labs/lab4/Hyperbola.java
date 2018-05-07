/* This program uses the java DrawPanel (512 x 512) to create two hyperbolas.
 The hyperbola in the lower left-hand corner has grid lines separated by 32 
 pixels, and the hyperbola in the upper right-hand corner has grid 
 lines separated by 8 pixels.
 */

//import of Java graphics packages
import java.awt.*;

//main program Hyperbola.java
public class Hyperbola {
  
  // class constant: the width and height of the DrawingPanel.
  public static final int PANEL_SIZE = 512;
  
  //Hyperbola.java program's main method
  public static void main(String[] args) {
    System.out.println("Lab 4 written by Donald A. Moore, UTSAID: qxv177");
    
    //declare integer i, for two loops of the same scope
    int i;
    //create new drawing panel and store instance in panel object
    DrawingPanel panel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
    Graphics g = panel.getGraphics();
    
    //for loop draws the lower-left hyperbola in the DrawPanel
    for(i = 0; i <= PANEL_SIZE; i+=32) {
      g.drawLine(0, i, i, PANEL_SIZE);
    }
    
    //for loop draws the upper-right hyperbola in the DrawPanel
    for(i = 0; i <= PANEL_SIZE; i+=8) {
      g.drawLine(i, 0, PANEL_SIZE, i);
    }
  }
}