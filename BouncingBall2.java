import java.awt.*;

public class BouncingBall2 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300, 300);
    Graphics g = panel.getGraphics( );
    drawCircles(panel, g);
  }
  
  public static void drawCircles(DrawingPanel panel, Graphics g) {
    int x = 0;
    int y = 270;
    int deltaX = 1;
    int deltaY = 3;
    double a;
    for(a = 1; a <= 2 ; a++) {
      deltaY = -deltaY;//-3 boundes up in y-direction first loop, +3 down second loop
      for (int i = 0; i <= 90; i++) {
        panel.sleep(50);
        g.setColor(Color.WHITE); 
        g.fillOval(x, y, 30, 30);
        g.setColor(Color.RED); 
        x = x + deltaX;
        y = y + deltaY;
        g.fillOval(x, y, 30, 30);
      }
    }
  }
}