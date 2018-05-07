
import java.awt.*;
public class Spiral {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400,400);
    Graphics g = panel.getGraphics();
    g.setColor(Color.BLUE);
    
    drawArcs(g,panel);
  }
  // g.drawOval(175-i*10, 175-i*10, 50 + 20*i, 50 + 20*i);
  public static void drawArcs(Graphics g, DrawingPanel panel) {
    int i;
    
    for(i = 1; i < 20; i++) {
      int b = -1;
      if(i%2 == 0) {
        /* relationship between starting box size 10 and top left (x,y)
          when varying size of spiral */
        /* note relationship between side growth factor 10i and top-left factor i*5 is half!*/
         g.drawArc(195-i*5, 195-i*5, 10 + 10*i, 10 + 10*i, 0, 180*(int)Math.pow(b,i));
      } else {
         g.drawArc(195-(i + 1)*5, 195-i*5, 10 + 10*i, 10 + 10*i, 0, 180*(int)Math.pow(b,i));
      }
    }
  }
}