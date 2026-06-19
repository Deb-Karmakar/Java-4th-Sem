import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Color Change");

        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        red.setBounds(30, 50, 80, 30);
        green.setBounds(120, 50, 80, 30);
        blue.setBounds(210, 50, 80, 30);

        red.addActionListener(e -> f.getContentPane().setBackground(Color.RED));

        green.addActionListener(e -> f.getContentPane().setBackground(Color.GREEN));

        blue.addActionListener(e -> f.getContentPane().setBackground(Color.BLUE));

        f.add(red);
        f.add(green);
        f.add(blue);

        f.setSize(350, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}