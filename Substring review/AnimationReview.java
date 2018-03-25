import java.awt.*;

public class AnimationReview {
  
  public static void main(String[] args){
    
    DrawingPanel panel = new DrawingPanel(600,600);
    Graphics g = panel.getGraphics();
    
    someAnimation(panel, g);
    someAnimation1(panel, g);
    someCircles(panel, g);
    usingKeys(panel,g);
    Point don = new Point(30,400);
    g.fillRect((int)don.getX(),(int)don.getY(),5,5);
    System.out.println("xcoord for point don is " + don.getX() + " " + "ycoord is " + don.getY());
   
  }
  
  public static void someAnimation(DrawingPanel panel, Graphics g) {
    int x = 280;
    int y = 0;
    int deltaY = 1;
    int deltaX = 1;
    for(int i=0; i<=300; i++) {//20 + 300 - 20
      panel.sleep(30);
      g.setColor(Color.WHITE);//starting position of ball is white
      g.fillOval(x,y,20,20);//starting position of ball is white
      
      g.setColor(Color.RED);//color the ball red, don't show it yet
      x = x + deltaX;//move red ball
      y = y + deltaY;//move red ball
      g.fillOval(x,y,20,20);//show red ball
    }
  }
  

      public static void usingKeys(DrawingPanel panel, Graphics g) {
  
      for(int r = 0; r<=5;r++) {
      char newKeyChar = panel.getKeyChar();//first test for while loop
      while(newKeyChar == '\0') {//ask about '\0'
      g.setColor(Color.RED);
      g.drawString("Enter w, s, a, or d", 50,50);
      newKeyChar = panel.getKeyChar();//update for while loop test
      }
      char key = newKeyChar;
     
        if(key == 'w'){
          g.setColor(Color.GREEN);
          g.drawString("W", 50,150);
           panel.sleep(2000);
          g.setColor(Color.WHITE);
          g.drawString("W", 50,150);
          newKeyChar = ' ';
        }else if(key == 's') {
          g.setColor(Color.GREEN);
          g.drawString("S",  50,150);
         panel.sleep(2000);
          g.setColor(Color.WHITE);
           g.drawString("S",  50,150);
           newKeyChar = ' ';
        }else if(key == 'a') {
          g.setColor(Color.GREEN);
          g.drawString("A", 50,150);
           panel.sleep(2000);
          g.setColor(Color.WHITE);
          g.drawString("A", 50,150);
          newKeyChar = ' ';
        }else if(key == 'd') {
          g.setColor(Color.GREEN);
          g.drawString("D",50,150);
           panel.sleep(2000);
          g.setColor(Color.WHITE);
          g.drawString("D",  50,150);
          newKeyChar = ' ';
        }else{
          g.setColor(Color.GREEN);
          g.drawString("Not a valid key!",50,150);
          panel.sleep(2000);
          g.setColor(Color.WHITE);
          g.drawString("Not a valid key!",50,150);
          newKeyChar = ' ';
        }
      
    }
    
    }
  
  public static void someAnimation1(DrawingPanel panel, Graphics g) {
    int x = 580;
    int y = 330;
    int deltaX = -1;
    
    for(int i = 0;i<=280;i++) {
      panel.sleep(30);
      g.setColor(Color.WHITE);
      g.fillRect(x,y,20,20);
      g.setColor(Color.GREEN);//color rectangle, don't fill or show it yet
      x = x + deltaX;
      g.fillRect(x,y,20,20);
    }
  }
  
  public static void someCircles(DrawingPanel panel, Graphics g) {
    for(int i = 0; i<=5; i++) {
      g.setColor(Color.BLUE);
      g.drawOval(280-i*10,280-i*10,50+i*20,50+i*20);
    }
  }
}