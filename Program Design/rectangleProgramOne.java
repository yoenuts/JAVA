//first java frame program!
//NOTES

//1.) program contains one class, rectangleProgram
//2.) it has constructor rectangleProgram
//3.) created this class based on JFrame therefore this program is a subclass of the super class JFrame.
//4.)
import javax.swing.*;

public class rectangleProgramOne extends JFrame {
    // there are set to private because
    // we want them to be used only for this class
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public rectangleProgramOne() {
        setTitle("Area and Perimeter of a Rectangle");
        setSize(WIDTH, HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        rectangleProgramOne rectProg = new rectangleProgramOne();
    }
}
