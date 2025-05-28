import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        // Create the frame for the login window
        JFrame f = new JFrame("Login Details");
        f.setLayout(null);  // Use null layout for absolute positioning
        
        // Create the text field for username
        JTextField tf = new JTextField();
        tf.setBounds(120, 20, 150, 30); // Set bounds for the text field

        // Create the password field for password
        JPasswordField pf = new JPasswordField();
        pf.setBounds(120, 60, 150, 30); // Set bounds for the password field

        // Create the labels for username and password
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 100, 30); // Position label for username
        
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 60, 100, 30); // Position label for password
        
        // Create the login and cancel buttons
        JButton b = new JButton("Login");
        b.setBounds(120, 100, 100, 30); // Set bounds for the login button
        
        JButton u = new JButton("Cancel");
        u.setBounds(230, 100, 100, 30); // Set bounds for the cancel button

        // Add components to the frame
        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(pf);
        f.add(b);
        f.add(u);

        f.setLayout(new FlowLayout());

        // Action listener for login button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the username and password entered by user
                String s1 = tf.getText();
                String s2 = new String(pf.getPassword()); // Convert password to string
                
                // Show a success message
                JOptionPane.showMessageDialog(f, "Login successful\nUsername: " + s1 + "\nPassword: " + s2);
            }
        });

        // Action listener for cancel button
        u.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear the text field and password field
                tf.setText("");
                pf.setText("");
            }
        });

        // Set frame properties
        f.setSize(400, 200);  // Set the frame size
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the program when the window is closed
        f.setVisible(true);  // Make the frame visible
    }
}