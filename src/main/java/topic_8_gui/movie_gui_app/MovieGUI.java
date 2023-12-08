package topic_8_gui.movie_gui_app;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame { // don't forget this!
    private JPanel mainPanel;
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    // constructor
    MovieGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 400)); // do this before packing
        pack(); // fit components into window
        setVisible(true); // so we can see window
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers();

    }

    private void configureEventHandlers() {
        // update opinion when rating slider is changed
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider.getValue() + " stars"; // get slider value
                sliderValueLabel.setText(valueLabelText); // set label to slider value
                updateOpinion(); // call this to see what updates were made and update opinion label
            }
        });

        // update opinion when would see again check box is checked/unchecked
        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });

        // update opinion as movie text field is typed in
        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // ignore this one
                // called when something about text is changed - font, font size
            }
        });

        // close window when Quit button is clicked
        // also ends program because of setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // if user says OK on the confirm Dialog box, dispose() JFrame
                int quit = JOptionPane.showConfirmDialog(MovieGUI.this,
                        "Are you sure you want to quit?", "Quit",
                        JOptionPane.YES_NO_OPTION);

                if (quit == JOptionPane.OK_OPTION) {
                    dispose(); // get rid of this current JFrame
                }
            }
        });

    }

    private void updateOpinion() {

        String movieName = movieTitleTextField.getText().strip(); // .strip() removes whitespace

        if (movieName.isEmpty()) { // if movie name is cleared or empty, set label back to original text
            movieOpinionLabel.setText("Movie opinion");
            return; // leave method, don't run anymore code
        }

        int rating = ratingSlider.getValue();
        boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

        String template = "You rated %s %d stars. You %s see again";

//        String seeAgainString = "would";
//        if (!seeAgain) {
//            seeAgainString = "would not";
//        }

        // alternative - ternary operator, shortcut for setting values based on a condition
        String seeAgainString = (seeAgain) ? "would" : "would not";


        String opinion = String.format(template, movieName, rating, seeAgainString);

        movieOpinionLabel.setText(opinion);
    }

}
