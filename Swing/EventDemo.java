import javax.swing.*;
import java.awt.event.*; // ⚠️ Important: Events live in this package!

public class EventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Listener Demo");
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Clicks: 0");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        // --- THE MAGIC HAPPENS HERE ---
        // We tell the button to listen for an action
        button.addActionListener(new ActionListener() {
            int count = 0; // Keep track of clicks
            
            // This method runs automatically when the button is clicked by using anonymous class
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Clicks: " + count);
                
                // e (the Event Object) contains info about the click!
                System.out.println("Event triggered by: " + e.getActionCommand()); 
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}