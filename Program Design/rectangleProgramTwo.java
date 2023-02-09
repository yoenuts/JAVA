//Container and Labels within the container

import javax.swing.*;
import java.awt.*;

public class rectangleProgramTwo extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JLabel lengthL, widthL, areaL, perimeterL;

    public rectangleProgramTwo() {
        setTitle("Area and Perimeter of a Rectangle");

        lengthL = 
            new JLabel("Enter the length: ", SwingConstants.RIGHT);
        widthL = 
            new JLabel("Enter the width: ", SwingConstants.RIGHT);
        areaL = 
            new JLabel("Enter the area: ", SwingConstants.RIGHT);
        perimeterL =
            new JLabel("Enter the perimeter: ", SwingConstants.RIGHT);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,1));

        pane.add(lengthL);
        pane.add(widthL);
        pane.add(areaL);
        pane.add(perimeterL);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //statement creates object rect of type rP2
        rectangleProgramTwo rectObject = new rectangleProgramTwo();
    }

}