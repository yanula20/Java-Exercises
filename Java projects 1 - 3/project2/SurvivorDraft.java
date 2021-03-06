import java.util.*;
import java.awt.*;

public class SurvivorDraft {
  public static void main(String[] args) {
    int i;//for the game for loop
    // Create DrawingPanel and draw a box in the panel.
    // The box is a square of this size.
    int boxSize = 760;
    DrawingPanel panel = new DrawingPanel(800, 800);
    Graphics g = panel.getGraphics();
    g.fillRect(10, 10, 10, 780); //left vertical (x = 20)<=30 no movement
    g.fillRect(10, 10, 780, 10); //top horizontal (y=20) <=30 no movement
    g.fillRect(780, 10, 10, 780); // right vertical (x = 780) >= 770
    g.fillRect(10, 780, 780, 10);//bottom horizontal (y=780) >=770
    
    // Initialize positions of runner and chaser.
    Point runner = new Point(200, 400);
    Point chaser = new Point(600, 400);
    
    // Variable for input from user to move runner.
    char keyInput = ' ';
    
    // The program should wait sleepTime ms between moves.
    int sleepTime = 100;
    
    // The runner should move moveSize (or zero) pixels each time step.
    // The chaser should move moveSize - 1 pixels each time step.
    int moveSize = 10;
    
    // Display players: Color.GREEN for the Runner and Color.RED for the Chaser.
    displayPlayers(panel, runner, chaser);
    
    // Wait one second before start of game.
    panel.sleep(1000);
    
    for(i=1; i <=300; i++){
      // Display players: Color.GREEN for the Runner and Color.RED for the Chaser.
      displayPlayers(panel, runner, chaser);
      
      // Get input from user if any.
      char newKeyInput = panel.getKeyChar();
      if (newKeyInput == 'w' || newKeyInput == 'a' || newKeyInput == 's' || newKeyInput == 'd') {
        keyInput = newKeyInput;
      } 
      
      // Erase players from the panel using Color.WHITE.
      erasePlayers(panel, runner, chaser);
      // Move the players according to parameters.
      movePlayers(runner, chaser, keyInput, boxSize, moveSize);
      // Game is over if the chaser catches up to the runner.
      
     displayPlayers(panel, runner, chaser);
     
      boolean test = collision(runner, chaser);
      if (test==true) {
        System.out.println("YOU LOST!!!");
        runner = new Point(200, 400);
        chaser = new Point(600, 400);
      }
      
      panel.sleep(sleepTime);
    }//end of game for loop 300 ticks
    
    //If game for loop reaches 300, that means no collisons have occured and the player has won.
    if(i == 300) {
      System.out.println("YOU WON!!!");
    }
  }
  
  public static boolean legalMoveTest(Point runner, Point chaser, char keyInput, int boxSize, int moveSize) {
    
    if((20 < runner.getX() && runner.getX() < boxSize+20) && (20 < runner.getY() && runner.getY() < boxSize+20)
         && (20 < chaser.getX() && chaser.getX() < boxSize+20) && (20 < chaser.getY() && chaser.getY() < boxSize+20)) {
      return true;
    }
    return false;
  }
  
  public static void moveApproved(Point runner, Point chaser, char keyInput, int boxSize, int moveSize) {
    if(keyInput == 'w') {
      runner.translate(0, -moveSize);//up
      chaser.translate(0, -moveSize-1);
    }else if(keyInput == 'a') {
      runner.translate(-moveSize, 0);//left
      chaser.translate(-moveSize-1, 0);
    }else if(keyInput == 's')  {
      runner.translate(0, moveSize);//down
      chaser.translate(0, moveSize-1);
    }else if(keyInput == 'd')  {
      runner.translate(moveSize, 0);
      chaser.translate(moveSize-1, 0);
    } else{
      runner.translate(0, 0);
      chaser.translate(0, 0);
    }
  }
  public static void movePlayers(Point runner, Point chaser, char keyInput, int boxSize, int moveSize) {
    boolean test = legalMoveTest(runner, chaser, keyInput, boxSize,moveSize);
    if(test) {
      moveApproved(runner, chaser, keyInput, boxSize,moveSize);
    }else {
      runner.translate(0, 0);
      chaser.translate(0, 0);
    }
  }
   public static void runnerDies(Point runner, DrawingPanel panel, Graphics g) {
    double x = runner.getX();
    double y = runner.getY();
    int delta = -1;
    int shrink = 40;
    for(int j = 1; j <= 10; j++) {
      shrink = shrink-j;
      
      panel.sleep(100);
      g.setColor(Color.WHITE);
      g.drawString("AAAAARGGH",(int)x,(int)y);
      g.setColor(Color.WHITE);
      g.fillRect((int)runner.getX(),(int)runner.getY(),shrink,shrink);
      
      panel.sleep(100);
      g.setColor(Color.GREEN);
      g.fillRect((int)runner.getX(),(int)runner.getY(),shrink,shrink);
      g.setColor(Color.RED);
      g.drawString("AAAAARGGH",(int)x,(int)y);

      panel.sleep(100);
      g.setColor(Color.WHITE);
      g.drawString("AAAAARGGH",(int)x,(int)y);
      g.setColor(Color.WHITE);
      g.fillRect((int)runner.getX(),(int)runner.getY(),shrink,shrink);
    }
    g.setColor(Color.RED);
    g.drawString("GAME OVER!",(int)x,(int)y);
  }
}
  public static void displayPlayers(DrawingPanel panel, Point runner, Point chaser) {
    Graphics g = panel.getGraphics();
    g.setColor(Color.GREEN);
    g.fillRect((int)runner.getX(),(int)runner.getY(),10,10);
    g.setColor(Color.RED);
    g.fillRect((int)chaser.getX(),(int)chaser.getY(),10,10);
  }
  
  public static void erasePlayers(DrawingPanel panel, Point runner, Point chaser) {
    Graphics g = panel.getGraphics();
    g.setColor(Color.WHITE);
    g.fillRect((int)runner.getX(),(int)runner.getY(),10,10);
    g.setColor(Color.WHITE);
    g.fillRect((int)chaser.getX(),(int)chaser.getY(),10,10);
  }
  
  public static boolean collision(Point runner, Point chaser) {
    double collide = Math.sqrt(Math.pow(Math.abs((chaser.getY()+5)-(runner.getY()+5)),2) + Math.pow(Math.abs((chaser.getX()+5)-(runner.getX()+5)),2));
    if(collide <= 10.0){
      return true;
    }else {
      return false;
    }
  }
}