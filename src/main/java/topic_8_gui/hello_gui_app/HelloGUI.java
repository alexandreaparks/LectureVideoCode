package topic_8_gui.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame { // tell HelloGUI that it's a JFrame
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    // constructor
    HelloGUI() {
        setContentPane(mainPanel); // telling JFrame that main container is the mainPanel
        setPreferredSize(new Dimension(500, 500)); // change size of form
        pack(); // pack all components in
        setVisible(true); // make sure we can see the JFrame
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // stops program from running when JFrame is closed

        // add event listener to button
        clickMeButton.addActionListener(new ActionListener() {
            // entire class definition with a method
            // when button is clicked, new Action Listener object is created
            // and actionPerformed method will be called
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here - this will run when button is clicked

                // change label to say this when the button is clicked
                myFirstLabel.setText("Hello GUI Programmers!");
            }
        });
    }
}
