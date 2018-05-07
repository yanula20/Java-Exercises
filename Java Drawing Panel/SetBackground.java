//(x,y,w,h)
import java.awt.*;
/* Method Description
drawLine(int x1, int y1, int x2, int y2) draws a line between (x1,y1) and (x2,y2)
drawOval(int x, int y, int width, int height) draws an oval that fits within the specified rectangle
drawRect(int x, int y, int width, int height) draws a rectangle with upper-left corner at (x,y)
drawString(String text, int x, int y) prints the text string with lower-left corner at (x,y)
fillOval(int x, int y, int width, int height) fills an oval that fits within the specified rectangle
fillRect(int x, int y, int width, int height) fills a rectangle with upper-left corner at (x,y)
setColor(Color color) */

public class SetBackground {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300,300);
    panel.setBackground(Color.PINK);
    Graphics g = panel.getGraphics();
    
    g.setColor(Color.CYAN);
    g.drawString("Donny",75, 75);
    g.setColor(Color.CYAN);
    g.drawRect(75, 75, 50, 50);
    
    g.setColor(Color.BLACK);
    g.drawString("Moore",200,75);
    g.setColor(Color.ORANGE);
    g.fillOval(200,75, 50, 50);
    
    g.setColor(Color.BLACK);
    g.drawString("was",75,200);
    g.setColor(Color.YELLOW);
    g.fillRect(75, 200, 50, 50);
    
    g.setColor(Color.BLUE);
    g.drawLine(0,0,300,300);
    
    g.setColor(Color.GREEN);
    g.drawString("here!",200,200);
    g.setColor(Color.GREEN);
    g.drawOval(200,200, 50, 50);
   
  }


}