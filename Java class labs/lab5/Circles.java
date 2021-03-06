
//We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;
//import of Java graphics packages
import java.awt.*;

public class Circles {
  
// set up a class constant named CONSOLE to read from the keyboard  
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Lab 5 written by Donald Moore, UTSAID: qxv177");

    DrawingPanel panel = new DrawingPanel(400,300);
    Graphics g = panel.getGraphics();
    
    //method call that prints information about the Circle program
    printProgramInfo();
    
    //Request user input for green circle 1, x,y, and radius 
    System.out.print("Enter the radius of green circle 1: ");
    int radiusGreenCircle1 = CONSOLE.nextInt();
    System.out.print("Enter the x-coordinate of green circle 1: ");
    int xGreenCircle1 = CONSOLE.nextInt();
    System.out.print("Enter the y-coordinate of green circle 1: ");
    int yGreenCircle1 = CONSOLE.nextInt();
    
    //Request user input for red circle 2, x,y, and radius 
    System.out.print("Enter the radius of red circle 2: ");
    int radiusRedCircle2 = CONSOLE.nextInt();
    System.out.print("Enter the x-coordinate of red circle 2: ");
    int xRedCircle2 = CONSOLE.nextInt();
    System.out.print("Enter the y-coordinate of red circle 2: ");
    int yRedCircle2 = CONSOLE.nextInt();
    
    //Request user input for yellow circle 3, x,y, and radius 
    System.out.print("Enter the radius of yellow circle 3: ");
    int radiusYellowCircle3 = CONSOLE.nextInt();
    System.out.print("Enter the x-coordinate of yellow circle 3: ");
    int xYellowCircle3 = CONSOLE.nextInt();
    System.out.print("Enter the y-coordinate of yellow circle 3: ");
    int yYellowCircle3 = CONSOLE.nextInt();
    
    //method call to compare the sizes of two circles - Green vs Red
    int result1 = compareRadiuses(radiusGreenCircle1, radiusRedCircle2);
    if(result1 == -1) {
      System.out.println("The green circle is smaller than the red circle.");
    }else if(result1 == 0) {
      System.out.println("The green circle is equal to the red circle.");
    }else {
      System.out.println("The green circle is greater than the red circle.");
    }
    
    //method call to compare the sizes of two circles - Red vs Yellow
    int result2 = compareRadiuses(radiusRedCircle2, radiusYellowCircle3);
    if(result2 == -1) {
      System.out.println("The red circle is smaller than the yellow circle.");
    }else if(result2 == 0) {
      System.out.println("The red circle is equal to the yellow circle.");
    }else {
      System.out.println("The red circle is greater than the yellow circle.");
    }
    
    //method call to compare the sizes of two circles - Green vs Yellow
    int result3 = compareRadiuses(radiusGreenCircle1, radiusYellowCircle3);
    if(result3 == -1) {
      System.out.println("The green circle is smaller than the yellow circle.");
    }else if(result3 == 0) {
      System.out.println("The green circle is equal to the yellow circle.");
    }else {
      System.out.println("The green circle is greater than the yellow circle.");
    }
    
    //method call to check whether two circles intersect - Green vs Red
    int intersectionOne = circleInstersectionCheck(radiusGreenCircle1, xGreenCircle1, yGreenCircle1, 
                                                   radiusRedCircle2, xRedCircle2, yRedCircle2);
    if(intersectionOne == 1) {
      System.out.println("The green circle intersects with the red circle.");
    } else {
      System.out.println("The green circle does not intersect with the red circle.");
    }
    
    //method call to check whether two circles intersect - Red vs Yellow
    int intersectionTwo = circleInstersectionCheck(radiusRedCircle2, xRedCircle2, yRedCircle2, 
                                                   radiusYellowCircle3, xYellowCircle3, yYellowCircle3);
    if(intersectionTwo == 1) {
      System.out.println("The red circle intersects with the yellow circle.");
    } else {
      System.out.println("The red circle does not intersect with the yellow circle.");
    }
    
    //method call to check whether two circles intersect - Green vs Yellow
    int intersectionThree = circleInstersectionCheck(radiusGreenCircle1, xGreenCircle1, yGreenCircle1,
                                                     radiusYellowCircle3, xYellowCircle3, yYellowCircle3);
    if(intersectionThree == 1) {
      System.out.println("The green circle intersects with the yellow circle.");
    } else {
      System.out.println("The green circle does not intersect with the yellow circle.");
    }
    
    //Green - method to check whether circle is completely outside, completely inside, or partially outside of DrawPanel
    int checkPanelGreen = panelChecker(xGreenCircle1, yGreenCircle1, radiusGreenCircle1);
    if(checkPanelGreen == 1) {
      System.out.println("The green circle is completely inside the panel.");
    }else if(checkPanelGreen == 0) {
      System.out.println("The green circle is partially outside of the panel.");
    }else if(checkPanelGreen == -1) {
      System.out.println("The green circle is completely outside the panel.");
    }
    
    //Red - method to check whether circle is completely outside, completely inside, or partially outside of DrawPanel
    int checkPanelRed = panelChecker(xRedCircle2, yRedCircle2, radiusRedCircle2);
    if(checkPanelRed == 1) {
      System.out.println("The red circle is completely inside the panel.");
    }else if(checkPanelRed == 0) {
      System.out.println("The red circle is partially outside of the panel.");
    }else if(checkPanelRed == -1) {
      System.out.println("The red circle is completely outside the panel.");
    }
    
    //Yellow - method to check whether circle is completely outside, completely inside, or partially outside of DrawPanel
    int checkPanelYellow = panelChecker(xYellowCircle3, yYellowCircle3, radiusYellowCircle3);
    if(checkPanelYellow == 1) {
      System.out.println("The yellow circle is completely inside the panel.");
    }else if(checkPanelYellow == 0) {
      System.out.println("The yellow circle is partially outside of the panel.");
    }else if(checkPanelYellow == -1){
      System.out.println("The yellow circle is completely outside the panel.");
    }
    
    //draw the yellow circle, note: side of bounding box of circle is twice the radius and top-left x,y uses radius
    g.setColor(Color.YELLOW);
    g.fillOval(xYellowCircle3 - radiusYellowCircle3, yYellowCircle3 - radiusYellowCircle3, 2*radiusYellowCircle3, 2*radiusYellowCircle3);
    //draw the red circle, note: side of bounding box of circle is twice the radius and top-left x,y uses radius
    g.setColor(Color.RED);
    g.fillOval(xRedCircle2 - radiusRedCircle2, yRedCircle2 - radiusRedCircle2, 2*radiusRedCircle2, 2*radiusRedCircle2 );
    //draw the green circle, note: side of bounding box of circle is twice the radius and top-left x,y uses radius
    g.setColor(Color.GREEN);
    g.fillOval(xGreenCircle1 - radiusGreenCircle1, yGreenCircle1 - radiusGreenCircle1 , 2*radiusGreenCircle1, 2*radiusGreenCircle1);
  }//end main
  
  //Method provides a description of what the Circle program does
  public static void printProgramInfo() {
    System.out.println("Ask the user for information to draw three circles");
    System.out.println("in a DrawingPanel.  Print size comparison information about"); 
    System.out.println("the circles based on their radii. Print information about whether"); 
    System.out.println("the circles intersect with eachother"); 
    System.out.println();
  }
  
  //Method performs calculation to compare the sizes of two circles
  public static int compareRadiuses(int radius1, int radius2) {
    if(radius1 < radius2) {
      return -1;
    }else if(radius1 == radius2) {
      return 0;
    }
    else
      return 1;
  }//compareRadiuses
  
  //Method performs calculation to determine whether two circles intersect or not
  public static int circleInstersectionCheck(int radius1, int x1, int y1, int radius2, int x2, int y2) {
    int r1 = (x1 - x2);
    int r2 = (y1 - y2);
    int result = (int)Math.pow(r1, 2) + (int)Math.pow(r2, 2);
    int radiusDistance = (int)Math.sqrt(result);
    int radiusSum = radius1 + radius2;
    if(radiusDistance <= radiusSum){
      //return 1, an intersection
      return 1;
    } 
    else 
      //return 0, non-intersection
      return 0;
    
  }//circleInstersectionCheck
  
  public static int panelChecker(int xCoord, int yCoord, int radius) {
    /* CASE 1: COMPLETELY INSIDE panel, treat radius like hands of clock, 
     * measure distances against all four panel walls (Left, Top, Right, Bottom)
     * in succession, note: xCoord = radius means completely outside
     */
    if( (0 < xCoord && 400 > xCoord && 0 < yCoord && 300 > yCoord) &&  
       (xCoord - 0 >= radius && yCoord - 0 >= radius 
          && 400 - xCoord >= radius && 300 - yCoord >= radius) ) {
      return 1;
      /* CASE 2: OVERLAP FROM INSIDE panel AND x,y CAN be on the panel walls, i.e. top =(+x,0) ||
       * left = 0,+y ||  right = (400, +y) || bottom = (+x, 300) */
    } else if( (0 <= xCoord && 400 >= xCoord && 0 <=  yCoord && 300 >= yCoord ) &&
              ( (xCoord - 0 < radius) || (400 - xCoord < radius) 
                 || (yCoord - 0 < radius) || (300 - yCoord < radius) ) ) {
      return 0;
      /* CASE 3: OVERLAP OUTSIDE left, on wall is possible, left = (0,+y) */
    } else if(0 - xCoord < radius && (0 <= yCoord && yCoord <= 300 && 0 >= xCoord)) {
      return 0;
      /* CASE 4: OVERLAP OUTSIDE top, on wall is possible, top =(+x,0) */
    }  else if(0 - yCoord < radius && (0 <= xCoord && xCoord <= 400 && 0 >= yCoord) ) {
      return 0;
      /* CASE 5: OVERLAP OUTSIDE right, on wall is possible, right = (400, +y) */
    }  else if(xCoord - 400 < radius && (0 <= yCoord && yCoord <= 300 && 400 <= xCoord)) {
      return 0;
      /* CASE 6: OVERLAP OUTSIDE bottom, on wall is possible, bottom = (+x, 300) */
    } else if(yCoord - 300 < radius && (0 <= xCoord && xCoord <= 400 && 300 <= yCoord)) {
      return 0;
      /*CASE 7: TOP LEFT CORNER, distance from box corner = sqrt [(abs(xCoord - 0))^2 + (abs(yCoord - 0))^2] and 
       *  must be within radius length. */
    } else if( xCoord < 0 && yCoord < 0 &&  (int)Math.sqrt( (int)Math.pow(Math.abs(xCoord - 0), 2 ) + (int)Math.pow(Math.abs(yCoord - 0), 2)) < radius ){
      
      return 0;
      /*CASE 8: TOP RIGHT CORNER, distance from box corner = sqrt [(abs(xCoord - 400))^2 + (abs(yCoord - 0))^2] and 
       *  must be within radius length. */
    }else if( 400 < xCoord && yCoord < 0 && (int)Math.sqrt( (int)Math.pow(Math.abs(xCoord - 400), 2 ) + (int)Math.pow(Math.abs(yCoord - 0), 2)) < radius ) {
      return 0;
      /*CASE 9: BOTTOM LEFT CORNER, distance from box corner = sqrt [(abs(xCoord - 0))^2 + (abs(yCoord - 300))^2] and 
       *  must be within radius length. */ 
    }else if(300 < yCoord && xCoord < 0 && (int)Math.sqrt( (int)Math.pow(Math.abs(xCoord - 0), 2 ) + (int)Math.pow(Math.abs(yCoord - 300), 2)) < radius  ) {
      return 0;
      /*CASE 10: BOTTOM RIGHT CORNER, distance from box corner = [(abs(xCoord - 400))^2 + (abs(yCoord - 300))^2] and 
       *  must be within radius length. */  
    }else if(300 < yCoord && 400 < xCoord && (int)Math.sqrt( (int)Math.pow(Math.abs(xCoord - 400), 2 ) + (int)Math.pow(Math.abs(yCoord - 300), 2)) < radius) {
      return 0;
    }else
      return -1;
  }
}