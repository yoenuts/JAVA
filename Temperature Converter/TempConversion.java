

//****02/11/2023
//Java program to convert celsius to fahrenheit and fahrenheit to celsius.
// I will be guided by the code from book but i will try to write most of these 
// on my own since i'd already written someting similar in the past.honestly still kept looking 
// to copy variable names cuz i dont wanna end up confusing parts and having
// different names truly aggravates that. goodluck ig!
//***** */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversion extends JFrame{
    //label and text field
    private JLabel celsiusL, fahrenheitL;
    private JTextField celsiusTF, fahrenheitTF;

    //listeners
    private celsiusHandler celsiusHndlr;
    private fahrenheitHandler fahrenheitHndlr;

    //formula
    //celsius = (5.0 / 9.0) * (fahrenheit - 32)
    //fahrenheit = (9.0/ 5.0) * (celsius + 32)
    //this part i copied off entirely cuz duh
    private static final double CTOF = (5.0 / 9.0);
    private static final double FTOC = (9.0 / 5.0);
    private static final double OFFSET = 32;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 80;
    //starts here
    public TempConversion() {
        //create labels here
        celsiusL = new JLabel("Celsius:", SwingConstants.RIGHT);
        fahrenheitL = new JLabel("Fahrenheit:", SwingConstants.RIGHT);

        //create text fields
        celsiusTF = new JTextField(15);
        fahrenheitTF = new JTextField(15);

        //create listener for celsius
        celsiusHndlr = new celsiusHandler();
        celsiusTF.addActionListener(celsiusHndlr);

        //create listener for fahrenheit
        
        fahrenheitHndlr = new fahrenheitHandler();
        fahrenheitTF.addActionListener(fahrenheitHndlr);

        //create container ofc
        Container pane = getContentPane();
        // Set layout
        pane.setLayout(new GridLayout(1,4));

        pane.add(celsiusL);
        pane.add(celsiusTF);
        pane.add(fahrenheitL);
        pane.add(fahrenheitTF);

        // Set title 
        setTitle("Temperature Conversion");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
    
    private class fahrenheitHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double celsius, fahrenheit;

            fahrenheit = Double.parseDouble(fahrenheitTF.getText());
            celsius = CTOF * (fahrenheit - OFFSET);
            celsiusTF.setText(String.format("%.2f", celsius));

        }
    }

    private class celsiusHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double celsius, fahrenheit;

            celsius = Double.parseDouble(celsiusTF.getText());
            fahrenheit = FTOC * (celsius + OFFSET);
            fahrenheitTF.setText(String.format("%.2f", fahrenheit));
            
        }
    }

    public static void main(String[] args) {
        TempConversion convert = new TempConversion();
    }
}
