/*50 left side ( 150 | 150)  50 right side; 400 is my box width, 400 is panel width;
 * 200 center, -25 to get my (50 x 50 circle box) 175, 175 top left 
 * 10 circles, move top left 1/10th of 175 toward top left by subtraction
 * top left grows by 10 up and left, must double dimensions to account for other half of box
 * which contains circle
 * 
 */
import java.awt.*;
public class Circles {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400,400);
    Graphics g = panel.getGraphics();
    g.setColor(Color.BLUE);
    g.drawRect(50,50,300,300);
    cocentricCircles(g);
  }
  
  public static void cocentricCircles(Graphics g) {
    int i;
   
    for(i = 0; i < 10; i++) {
      
      g.drawOval(175-i*10, 175-i*10, 50 + 20*i, 50 + 20*i);
    }
  }
}