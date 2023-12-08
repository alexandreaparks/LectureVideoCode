package topic_8_gui.movie_gui_app;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// TODO stopped final video at 15:20

public class MovieGUI extends JFrame { // don't forget this!
    private JPanel mainPanel;
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;

    // constructor
    MovieGUI() {
        setContentPane(mainPanel);
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


    }

    private void updateOpinion() {
        String movieName = movieTitleTextField.getText();
        int rating = ratingSlider.getValue();
        boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

        String template = "You rated %s %d stars. You %s see again";

        String seeAgainString = "would";
        if (!seeAgain) {
            seeAgainString = "would not";
        }

        String opinion = String.format(template, movieName, rating, seeAgainString);

        movieOpinionLabel.setText(opinion);
    }

}
