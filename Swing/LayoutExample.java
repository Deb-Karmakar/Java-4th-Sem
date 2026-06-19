import javax.swing.*;
import java.awt.*; // Layout Managers live in the AWT package

public class LayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Create a panel and explicitly set it to GridLayout (2 rows, 2 columns)
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 2)); 
        
        // 2. Add 4 buttons. They will automatically snap into the 2x2 grid.
        gridPanel.add(new JButton("Button 1"));
        gridPanel.add(new JButton("Button 2"));
        gridPanel.add(new JButton("Button 3"));
        gridPanel.add(new JButton("Button 4"));

        frame.add(gridPanel);
        frame.setVisible(true);
    }
}