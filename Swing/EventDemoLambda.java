import javax.swing.*;
import java.awt.event.*; 

public class EventDemoLambda {
    
    // 1. Move 'count' up here so the lambda can modify it safely
    static int count = 0; 

    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Listener Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Clicks: 0");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        // --- THE LAMBDA MAGIC ---
        // 2. Replace the 7 lines of boilerplate with a clean arrow function
        button.addActionListener(e -> {
            count++;
            label.setText("Clicks: " + count);
            System.out.println("Event triggered by: " + e.getActionCommand()); 
        });

        frame.setVisible(true);
    }
}