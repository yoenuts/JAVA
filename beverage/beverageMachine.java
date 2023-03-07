package beverage;
import java.util.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class beverageMachine extends JFrame {
    private JLabel headingMainL;
    private JLabel selectItem;
    private JButton sodaB, juiceB, energyB, coffeeB, exitB;

    public beverageMachine() {
        //create the labels
        headingMainL = new JLabel("GC Beverage Machine", SwingConstants.CENTER);
        selectItem = new JLabel("To make a selection, click on a button.", SwingConstants.CENTER);

        //create the buttons
        sodaB = new JButton("Soda");
        juiceB = new JButton("Juice");
        energyB = new JButton("Energy Drink");
        coffeeB = new JButton("Coffee");
        exitB = new JButton("Exit");

        //create a container
        Container contain = getContentPane();
        setSize(300,300);

        contain.setLayout(new GridLayout(7,1));

        contain.add(headingMainL);
        contain.add(selectItem);
        contain.add(sodaB);
        contain.add(juiceB);
        contain.add(energyB);
        contain.add(coffeeB);
        contain.add(exitB);

        setVisible(true);
    }
    //create the selling method ofc

    public void sellProduct(Dispenser product, String productName) {
        double coinsInserted = 0;
        double price;
        double coinsRequired;
        String str;

        //check if it's not empty
        if(product.getCount() > 0){
            price = product.getProductCost();
            coinsRequired = price - coinsInserted;
        }
    }



    //now i gotta create a listener for all that button UGH
    

    public static void main(String[] args){
        beverageMachine run = new beverageMachine();
    }

    


}
