import java.awt.*;

public class BouncingBall_90 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics( );
        drawCircles(panel, g);
    }
    
    public static void drawCircles(DrawingPanel panel, Graphics g) {
        int x = 0;
        int y = 270;
        int deltaX = 3;
        int deltaY = -3;
        for (int i = 0; i <= 360; i++) {
            panel.sleep(50);
            g.setColor(Color.WHITE); 
            g.fillOval(x, y, 30, 30);
            g.setColor(Color.RED); 
            x = x + deltaX;
            y = y + deltaY;
            g.fillOval(x, y, 30, 30);
            if(y == 0 || y == 270)
             deltaY = -deltaY;
            if(x == 270 || x == 30)
             deltaY = -deltaY;
        }
    }
}