/***
 * I hate statistics class
 * This program utilizes simple GUI and what I've learned from constructors(if i learned anything) to arrange values and 
 * count how many times they appear. It would be
 * cool to create a calculator for the entire thing though but that would take ages lol
*/
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class arrangeValues extends JFrame {
    //initialize stuff starts here

    //labels and text fields 
    private JLabel labelInstructs;
    private JTextField inputCount;
    private JTextArea outputCount;
    private JButton calcButton;

    //listeners
    //private inputHandler inputHndle;
    
    //set size
    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;

    //writing Method begins here

    public arrangeValues() {


        //create labels here
        labelInstructs = new JLabel("Enter values and seperate with spaces dumb-o");

        //create textfields here
        inputCount = new JTextField(25);

        //create TextArea. This is something new that I learned. It's what shows the output
        outputCount = new JTextArea("10");

        //create a button
        calcButton = new JButton("Check");

        //create Listener

        //Create container
        Container pane = getContentPane();

        pane.add(labelInstructs, BorderLayout.NORTH);
        pane.add(inputCount);
        pane.add(calcButton, BorderLayout.EAST);

        //execution
        setTitle("Number Counter");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
/** 
    private class inputHandler implements ActionListener {
        public void ActionPerformed (ActionEvent e) {
            //is used to retrieve the text entered into an input field. This allows 
            //input to be processed.
            String inputText = e.getActionCommand();
            //we first split the input text into an array of strings
            // using spaces as the delimiter
            String[] inputValues = inputText.split(" ");

            int[] values = new int[inputValues.length];
            for(int i = 0; i < inputValues.length; i++) {
                try {
                    values[i] = Integer.parseInt(inputValues[i]);
                } catch (NumberFormatException ex)
            }

            
        }
    }
**/

    public static void main(String[] args) {
        arrangeValues Arrange = new arrangeValues();
    }
    
}