package beverage;
import java.util.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


// ugyyu
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
            while (coinsRequired > 0) {
                str = JOptionPane.showInputDialog("To buy " + productName + " please insert " + coinsRequired);
                coinsInserted = coinsInserted + Integer.parseInt(str);
                coinsRequired = price - coinsInserted;
                //give change if coin inserted is greater than the cost
                if(coinsInserted > coinsRequired) {
                    run
                }
            }
        }
    }



    //now i gotta create a listener for all that button UGH
    
    //main method stock sum stuff
    public static void main(String[] args){
        CashRegister cashRegister = new CashRegister(1000);
        Dispenser Soda = new Dispenser(40, 20);
        Dispenser Coffee = new Dispenser(20, 15);
        Dispenser energyDrink = new Dispenser(20, 25);
        Dispenser juice = new Dispenser(50, 10);
        beverageMachine run = new beverageMachine();
    }

    


}
