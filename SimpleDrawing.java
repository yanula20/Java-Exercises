import java.awt.*;

public class SimpleDrawing {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300,200);
    Graphics g = panel.getGraphics();
    
    //Rect are drawn relative to top-left corner
    g.setColor(Color.BLACK);
    g.drawRect(50,25,200,150);
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