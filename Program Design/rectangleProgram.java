//first java frame program!

import javax.swing.*;

public class rectangleProgram extends JFrame {
    // there are set to private because
    // we want them to be used only for this class
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public rectangleProgram() {
        setTitle("Area and Perimeter of a Rectangle");
        setSize(WIDTH, HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        rectangleProgram rectProg = new rectangleProgram();
    }
}
