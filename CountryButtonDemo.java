/*4b. Develop a Swing program in Java to display a message “Srilanka
 *  is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).*/
package FourB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnIndia, btnSrilanka;
    JLabel label;

    public CountryButtonDemo() {
        // Create frame
        frame = new JFrame("Button Event Demo");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Create label
        label = new JLabel("Press a button");

        // Register action listener
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        // Add components to frame
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}