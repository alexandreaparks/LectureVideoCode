package topic_8_gui.currency_converter_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JPanel mainPanel;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JComboBox<String> currencyComboBox; // <String> says only Strings will be in box

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter() {

        setContentPane(mainPanel);
        setPreferredSize(new Dimension(600, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton); // enter on keyboard converts currencies

        // add items to combo box
        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in the JTextField dollarsTextField
                String dollarString = dollarsTextField.getText();

                try { // try-catch blocks in case user doesn't enter a number
                    // convert to a number
                    double dollars = Double.parseDouble(dollarString);

                    // get selected currency from
                    String toCurrency = (String) currencyComboBox.getSelectedItem(); // cast to String

                    // get the exchange rate by using the key selected in the combo box
                    double exchangeRate = exchangeRates.get(toCurrency);

                    // convert to target currency
                    double convertedValue = dollars * exchangeRate;

                    // display result in euroResultLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s.",
                            dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);

                } catch (NumberFormatException nfe) {
                    // show dialog box with message
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }
            }
        });

    }
}
