import java.awt.*;

public class OutlineExample1 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 200);
        Graphics g = panel.getGraphics(); 

        // inner red fill
        g.setColor(Color.RED);
        g.fillRect(121, 11, 98, 148);

        // black outline 
        g.setColor(Color.BLACK); 
        g.drawRect(120, 10, 100, 150);
    }
}