package topic_8_gui.currency_converter_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JPanel mainPanel;
    private JButton convertButton;
    private JLabel eurosResultLabel;
    private double dollarsToEurosExchangeRate = 0.84;

    CurrencyConverter() {

        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in the JTextField dollarsTextField
                String dollarString = dollarsTextField.getText();

                // convert to a number
                double dollars = Double.parseDouble(dollarString); // TODO handle exceptions

                // convert to Euros
                double euros = dollars * dollarsToEurosExchangeRate;

                // display result in euroResultLabel
                String resultString = String.format("%.2f dollars is equivalent to %.2f euros.",
                        dollars, euros);
                eurosResultLabel.setText(resultString);

            }
        });

    }
}
