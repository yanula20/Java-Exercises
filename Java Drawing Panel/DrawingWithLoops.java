/* Method Description
drawLine(int x1, int y1, int x2, int y2) draws a line between (x1,y1) and (x2,y2)
drawOval(int x, int y, int width, int height) draws an oval that fits within the specified rectangle
drawRect(int x, int y, int width, int height) draws a rectangle with upper-left corner at (x,y)
drawString(String text, int x, int y) prints the text string with lower-left corner at (x,y)
fillOval(int x, int y, int width, int height) fills an oval that fits within the specified rectangle
fillRect(int x, int y, int width, int height) fills a rectangle with upper-left corner at (x,y)
setColor(Color color) */
import java.awt.*;


public class DrawingWithLoops {
  public static void main(String[] args) {
    
    DrawingPanel panel = new DrawingPanel(300, 300);
    Graphics g = panel.getGraphics();
    g.setColor(Color.RED); 
    for (int i = 0; i < 10; i++) {
      g.fillOval(0 + 30 * i, 270 - 30 * i, 30, 30);
    }
  }
}

