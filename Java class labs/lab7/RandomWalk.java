//drawLine(int x1, int y1, int x2, int y2) draws a line between (x1,y1) and (x2,y2)

//We need a Java utility (the Scanner class) for keyboard input.
import java.util.*;

//import of Java utility for graphics packages
import java.awt.*;

//RandomWalk java program
public class RandomWalk {
  
  // set up a class constant named CONSOLE to read from the keyboard 
  public static final Scanner console = new Scanner(System.in);
  
  // class constant for matchesChoice method
  public static final String BLUE = "blue";
  
  // class constant for matchesChoice method
  public static final String RED = "red";
  
  //RandomWalk program's main method
  public static void main(String[] args){
    System.out.println("Lab 7 written by Donald Moore, ABC123: qxv177");
    int radius = 0;
    boolean test = false;//default value
    String color = " ";//default value, empty string
    
    //method provideds explanation of how the RandomWalk java program works
    getIntro();
    
    /*This while loop continues to prompt the user for a VALID radius as long as the radius entered
     is less than 50 or greater than 400.*/
    while(radius < 50 || radius > 400){
      System.out.print("Choose a radius between 50 - 400 for the circle: ");
      radius = console.nextInt();
    }
    
    /* this while loop continues to prompt the user until he/she selects one of the colors offered (red or blue)
     * The check for a VALID color is accomplished by sending the user's answer to the matchesChoice method*/
    console.nextLine();//flush buffer
    while(test == false){
      System.out.print("Choose a color, red or blue for the circle");
      color = console.nextLine();//default color = "green";
      test = matchesChoice(color,BLUE) || matchesChoice(color,RED);
    }
    
    //this method prints the user's input 
    printUserValues(color, radius);
    
    //this method draws the circle
    drawCircle(color, radius);
  }
  
  //this method prints basic info about the Random Walk program
  public static void getIntro() {
    System.out.println("This program uses a DrawingPanel to animate a random walk which begins at the center of a circle,");
    System.out.println("and repeats in 1 of 4 randomly chosen directions. The random walk continues until ");
    System.out.println("our drunkard stumbles outside of the circle.  Each step will be randomly chosen from one pixel up, ");
    System.out.println("one pixel down, one pixel left, or one pixel right (this kind of random walk is ");
    System.out.println("called the \"drunkard's walk\". The random walk will be drawn on a Graphics object.");
    System.out.println();//spacing
  }
  
  //this method determines the user's choice of the color for the circle
  public static boolean matchesChoice(String color, String choice) {
    choice = "blue";//class constant
    if(color.trim().equals("blue")){
      return true;
    }else if (color.trim().equals("Blue")){
      return true;
    }else if (color.trim().equals("B")){
      return true;
    }else {
      choice = "red";//class constant
      if(color.trim().equals("red")){
        return true;
      }else if(color.trim().equals("Red")) {
        return true;
      }else if(color.trim().equals("R")) {
        return true;
      }else {
        return false;
      }
    }
  }
  
  /* Method draws a circle based on user's chosen color and chosen radius size. 
   * After method draws circle, the startStumbling() method is called with three parameters:
   * the panel, graphics object, and the radius. 
   */
  public static void drawCircle(String color, int radius) {
    DrawingPanel panel = new DrawingPanel(500,500);
    Graphics g = panel.getGraphics();
    if(color.equals("blue") || color.equals("Blue") || color.equals("B") ) {
      g.setColor(Color.BLUE);
      g.drawOval(250-radius,250-radius,2*radius, 2*radius);
      startStumbling(panel, g, radius);
    }else{
      g.setColor(Color.RED);
      g.drawOval(250-radius,250-radius,2*radius, 2*radius);
      startStumbling(panel, g, radius);
    }
  }
  
  //this method prints the user's validated choices for radius and color.
  public static void printUserValues(String color, int radius) {
    System.out.println("You have chosen a " + color + " circle with a radius: " + radius + " (pixels).");
  }
  
  /* this method starts the 'drunkard's walk' via a while loop that tests whether the 
   * distance from the center of the circle and the drunkard's location is less than 
   * or equal to radius of the circle. When the drunkard's location and the circle radius
   are equal the loop stops indicating that the drunkard has reached the edge of the circle.*/
  public static void startStumbling(DrawingPanel panel, Graphics g, int radius) {
    int x = 250;
    int y = 250;
    int a;
    int b;
    int stumble = '\0';
    int count = 0;
    int drunkardsLocationFromCircleCenter = 0;
    
    //random object created for use in determining drunkard's stumble directions
    Random rand = new Random();
    
    //while loop continues until the drunkard has left the circle
    while(drunkardsLocationFromCircleCenter < radius ){
      stumble = rand.nextInt(4);
      count++;
      panel.sleep(1);
      if(stumble == 0){ //top
        a = x;
        x = x + 0;
        b =  y;
        y = y + -1;
        g.drawLine(a,b,x,y);
      }else if(stumble == 1) { //right
        a = x;
        x = x + 1;
        b =  y;
        y = y + 0;
        g.drawLine(a,b,x,y);
      }else if(stumble == 2) {//bottom
        a = x;
        x = x + 0;
        b =  y;
        y = y + 1;
        g.drawLine(a,b,x,y);
      }else{//left
        a = x;
        x = x + - 1;
        b =  y;
        y = y + 0;
        g.drawLine(a,b,x,y);
      }
      /* this method serves as the test calculation for the while loop. The calculation is simply a distance
       * formula between two points where the first point is the center of the drunkard's circle and the second 
       * point is the drunkard's current location. This test calculation is at the bottom of the while loop
       * to ensure that calculations are conducted after 1 of four possible moves (u, d, l or right).
       * The loop continues until the determines that distance formula returns a result that is GREATER than the 
       * user's input radius. A greater distance means that the drunkard has left the radius of the circle.
       * 
       */
      drunkardsLocationFromCircleCenter = (int)Math.sqrt((int)Math.pow(250-x,2) + (int)Math.pow(250-y,2) );
    } System.out.println("Our hero stumbled " + count + " times!");
  }
}

