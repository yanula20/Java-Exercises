import java.awt.*;

public class SetBackground {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300,300);
    panel.setBackground(Color.PINK);
    Graphics g = panel.getGraphics();
    
    g.setColor(Color.CYAN);
    g.drawRect(75, 75, 50, 50);
    
    g.setColor(Color.ORANGE);
    g.fillOval(200,75, 50, 50);
    
    g.setColor(Color.YELLOW);
    g.fillRect(75, 200, 50, 50);
    
    g.setColor(Color.BLUE);
    g.drawLine(0,0,300,300);
    
    g.setColor(Color.GREEN);
    g.drawOval(200,200, 50, 50);
   
  }


}