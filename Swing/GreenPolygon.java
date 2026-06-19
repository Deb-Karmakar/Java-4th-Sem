import javax.swing.*;
import java.awt.*;

public class GreenPolygon extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x[] = {100, 150, 200, 150};
        int y[] = {100, 50, 100, 150};

        g.setColor(new Color(0, 255, 0)); // RGB for green
        g.fillPolygon(x, y, 4);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Green Polygon");
        f.add(new GreenPolygon());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}