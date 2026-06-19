import javax.swing.*; // Import the Swing library

public class MyFirstGUI {
    public static void main(String[] args) {
        
        // 1. Create the main window (JFrame)
        JFrame frame = new JFrame("My First Java App");
        frame.setSize(400, 300); // Width, Height in pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stop program when window is closed
        
        // 2. Create an invisible container (JPanel) to hold our stuff
        JPanel panel = new JPanel();
        
        // 3. Create our UI components
        JLabel welcomeLabel = new JLabel("Welcome to the App!");
        JTextField nameInput = new JTextField(15); // 15 columns wide
        JButton submitButton = new JButton("Click Me");
        
        // 4. Add the components to the panel (like putting elements inside a <div>)
        panel.add(welcomeLabel);
        panel.add(nameInput);
        panel.add(submitButton);
        
        // 5. Add the panel to the main frame and make it visible
        frame.add(panel);
        frame.setVisible(true); // Always do this last!
    }
}