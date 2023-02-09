//JAVA program to create a window
//and place four labels and text fields

//creating the text fields
// text fields are are objects from the class JTextField.
// therefore it has to be declared with a reference variable of type JTextField then an instance of the object.
import javax.swing.*;
import java.awt.*;
    
public class rectangleProgramThree extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JLabel widthL, lengthL, areaL, perimeterL;
    private JTextField widthTF, lengthTF, areaTF, perimeterTF;
        
    public rectangleProgramThree() {
        setTitle("Area and Perimeter of a Rectangle");

        lengthL = 
            new JLabel("Enter the length: ", SwingConstants.RIGHT);
        widthL = 
            new JLabel("Enter the width: ", SwingConstants.RIGHT);
        areaL = 
            new JLabel("area: ", SwingConstants.RIGHT);
        perimeterL =
            new JLabel("perimeter: ", SwingConstants.RIGHT);

        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimeterTF = new JTextField(10);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,2));

        pane.add(lengthL);
        pane.add(lengthTF);
        pane.add(widthL);
        pane.add(widthTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(perimeterL);
        pane.add(perimeterTF);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        rectangleProgramThree rectObjct = new rectangleProgramThree();
    }
}
