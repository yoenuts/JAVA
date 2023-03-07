import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// the complete program for this rectangle shit!!!!

/**
 * RectangleProgram
 */
public class RectangleProgram extends JFrame {
    private JLabel lengthL, widthL, areaL, perimeterL;
    private JTextField lengthTF, widthTF, areaTF, perimeterTF;
    private JButton calculateB, exitB;

    private CalculateButton cbhandler;
    private ExitButton ebhandler;

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public RectangleProgram() {

        //create the goddamn labels
        lengthL = new JLabel("Enter the length:", SwingConstants.RIGHT);
        widthL = new JLabel("Enter the width:", SwingConstants.RIGHT);
        areaL = new JLabel("Area: ", SwingConstants.RIGHT);
        perimeterL = new JLabel("Perimeter: ", SwingConstants.RIGHT);

        //create text fields
        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimeterTF = new JTextField(10);

        //create button
        calculateB = new JButton("Calculate");
        cbhandler = new CalculateButton();
        calculateB.addActionListener(cbhandler);
        
        //create exit button 
        exitB = new JButton("Exit");
        ebhandler = new ExitButton();
        exitB.addActionListener(ebhandler);
        
        //create container
        Container pane = getContentPane();
        //set layout
        pane.setLayout(new GridLayout(5,2));


        // add panes
        pane.add(lengthL);
        pane.add(lengthTF);
        pane.add(widthL);
        pane.add(widthTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(perimeterL);
        pane.add(perimeterTF);
        pane.add(exitB);
        pane.add(calculateB);

        //set size
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CalculateButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double length, width, area, perimeter;
            
            length = Double.parseDouble(lengthTF.getText());
            width = Double.parseDouble(widthTF.getText());
            area = length * width;
            perimeter = 2 * (length + width);

            areaTF.setText("" + area);
            perimeterTF.setText("" + perimeter);


        }
    }

    private class ExitButton implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        RectangleProgram rectprog = new RectangleProgram();
    }
    
}