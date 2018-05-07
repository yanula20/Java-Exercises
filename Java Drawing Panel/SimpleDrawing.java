/* Method Description
drawLine(int x1, int y1, int x2, int y2) draws a line between (x1,y1) and (x2,y2)
drawOval(int x, int y, int width, int height) draws an oval that fits within the specified rectangle
drawRect(int x, int y, int width, int height) draws a rectangle with upper-left corner at (x,y)
drawString(String text, int x, int y) prints the text string with lower-left corner at (x,y)
fillOval(int x, int y, int width, int height) fills an oval that fits within the specified rectangle
fillRect(int x, int y, int width, int height) fills a rectangle with upper-left corner at (x,y)
setColor(Color color) */
import java.awt.*;

public class SimpleDrawing {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300,200);
    Graphics g = panel.getGraphics();
    
    //Rect are drawn relative to top-left corner
    g.setColor(Color.BLACK);
    g.drawRect(50,25,200,150);//x,y, w,l
    //Rect are drawn relative to top-left corner
    g.setColor(Color.GREEN);
    g.fillRect(50,25,200,150);
    //Ovals are drawn within box of dim. (150 x 150 below) relative to top-left
    g.setColor(Color.RED);
    g.fillOval(75,25,150,150);
    g.setColor(Color.YELLOW);
    g.drawLine(50,25,250,175);
    g.setColor(Color.YELLOW);
    g.drawLine(50,175,250,25);
    g.setColor(Color.MAGENTA);
    g.drawString("Donald Moore",25,12);
  }
}