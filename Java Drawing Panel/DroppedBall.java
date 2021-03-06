import java.awt.*;

public class DroppedBall {
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(400,500);
    Graphics g = panel.getGraphics();
    for(int j =1; j <=5; j++) {
      ballDown(panel, g, j);
      compressBall(panel, g);
      decompressBall(panel, g);
      ballUp(panel, g, j);
    }
  }
  
  public static void ballDown(DrawingPanel panel, Graphics g, int j ) {
    int x = 150;
    int y = (j-1)*100;//top of ball trajectory
    int deltaX = 1;
    int deltaY = 1;//moves ball from trajectory to start of compression
    for(int i = 1; i <= 400 - (j-1)*100; i++) {//1 deltas x 20 x 4 x 5 = 400 out of 500 in y dir
      panel.sleep(10);
      g.setColor(Color.WHITE);
      g.drawOval(150,y,100,100);
      g.setColor(Color.RED);
      y = y + deltaY;
      g.drawOval(150,y,100,100);
    } 
  }
  
  public static void ballUp(DrawingPanel panel, Graphics g, int j) {
    int x = 150;
    int y = 400;//bottom of up trajectory
    int deltaY = -1;
      for(int i = 1; i <= 400 - j*100; i++) {
        panel.sleep(10);
        g.setColor(Color.WHITE);
        g.drawOval(x,y,100,100);
        g.setColor(Color.RED);
        y = y + deltaY;
        g.drawOval(x,y,100,100);
      }
  }
  
  public static void compressBall(DrawingPanel panel, Graphics g) {
    int x = 150;
    int y = 400;
    int w = 100;
    int h = 100;
    //compress 50 on the left and right
    int deltaX = -5; 
    int deltaY = 2*5;
    int deltaWidth = 2*5;
    int deltaHeight = -deltaY;//DO NOT double or x2, only scrunch the top
    System.out.println("compress: " + x + " " + y);
    
    for(int i = 1; i <= 5; i++) {
      panel.sleep(25);
      g.setColor(Color.WHITE);
      g.drawOval(x,y,w,h);
      g.setColor(Color.RED);
      x = x + deltaX;
      y = y + deltaY;
      w = w + deltaWidth;
      h = h + deltaHeight;
      g.drawOval(x,y,w,h);
    }
  }
  
  public static void decompressBall(DrawingPanel panel, Graphics g) {
    int x = 125; //-5 * 5 iterations
    int y = 450;
    int w = 150;
    int h = 50;
    //compress 50 on the left and right
    int deltaX = 5; 
    int deltaY = -5;
    int deltaWidth = -5*2;
    int deltaHeight = 5;
    for(int i = 1; i <= 5; i++) {
      panel.sleep(25);
      g.setColor(Color.WHITE);
      g.drawOval(x,y,w,h);
      g.setColor(Color.RED);
      x = x + deltaX;
      y = y + deltaY;
      w = w + deltaWidth;
      h = h + deltaHeight;
      g.drawOval(x,y,w,h);
    }
    System.out.println(x + " " + y);
    System.out.println(h + " " + w);
    g.setColor(Color.WHITE);
    g.drawOval(150,425,100,75);
  }
}