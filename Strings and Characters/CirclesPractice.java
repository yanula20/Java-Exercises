import java.awt.*;

public class CirclesPractice {
  public static void main(String[] args) {
    int x = 195;
    int y = 195;
    int deltaX = -5;
    int deltaY = -5;
    int w = 10;
    int h = 10;
    int deltaW = w;
    int deltaH = h;
    int i = 1;
    
    DrawingPanel panel = new DrawingPanel(400, 400);
    Graphics g = panel.getGraphics();
    for(i = 1; i <= 15; i++) {
      if(i == 15) {
        g.setColor(Color.WHITE);
        g.drawOval(x,y,w,h);
        i = 1;
        x = 195;
        y = 195;
        deltaX = -5;
        deltaY = -5;
        w = 10;
        h = 10;
        deltaW = w;
        deltaH = h;
      }else {
        panel.sleep(300);
        g.setColor(Color.WHITE);
        g.drawOval(x,y,w,h);
        g.setColor(Color.RED);
        x = x + deltaX;
        y = y + deltaY;
        w = w + deltaW;
        h = h + deltaH;
        g.drawOval(x,y,w,h);
      }
    }
  }
}
