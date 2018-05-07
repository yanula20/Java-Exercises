
import java.awt.*;
public class SpiralTwo {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400,400);
    Graphics g = panel.getGraphics();
    g.setColor(Color.BLUE);
    
    drawArcs(g,panel);
  }
  // g.drawOval(175-i*10, 175-i*10, 50 + 20*i, 50 + 20*i);
  public static void drawArcs(Graphics g, DrawingPanel panel) {
    int i;
    
    for(i = 1; i < 11; i++) {
      int b = -1;
      if(i%2 == 1) {
        g.drawArc(175-(i + 1)*10, 175-i*10, 50 + 20*i, 50 + 20*i, 0, 180*(int)Math.pow(b,i));
      } else {
        g.drawArc(175-i*10, 175-i*10, 50 + 20*i, 50 + 20*i, 0, 180*(int)Math.pow(b,i));
      }
    }
  }
}