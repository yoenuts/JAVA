import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// ugyyu
public class beverageMachine extends JFrame {
    private JLabel headingMainL;
    private JLabel selectItem;
    private JButton sodaB, juiceB, energyB, coffeeB, exitB;
    //ButtonHandler
    private ButtonHandler pbutton = new ButtonHandler();

    //
    CashRegister theCash = new CashRegister(1000);
    Dispenser Soda = new Dispenser(40, 20);
    Dispenser Coffee = new Dispenser(20, 15);
    Dispenser energyDrink = new Dispenser(20, 25);
    Dispenser juice = new Dispenser(50, 10);

    //main method stock sum stuff
    public static void main(String[] args){
        beverageMachine machine = new beverageMachine();
    }

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
        //create listeners
        sodaB.addActionListener(pbutton);
        juiceB.addActionListener(pbutton);
        energyB.addActionListener(pbutton);
        coffeeB.addActionListener(pbutton);
        exitB.addActionListener(pbutton);

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

    public void sellProduct(Dispenser product, String productName, CashRegister cash) {
        double coinsInserted = 0;
        double price;
        double coinsRequired;
        double change = 0;
        String str;

        //check if it's not empty
        if(product.getCount() > 0){
            price = product.getProductCost();
            coinsRequired = price - coinsInserted;
            while (coinsRequired > 0) {
                str = JOptionPane.showInputDialog("To buy " + productName + " please insert " + coinsRequired);
                coinsInserted = coinsInserted + Integer.parseInt(str);
                //give change if coin inserted is greater than the cost
                if(coinsInserted > coinsRequired) {
                    change = coinsInserted - coinsRequired;
                    cash.makeChange(coinsInserted, coinsRequired);
                    str = String.format("Your change is %.2f", change);
                    JOptionPane.showMessageDialog(null, str, "Change", JOptionPane.INFORMATION_MESSAGE);
                    coinsInserted = coinsInserted - change;
                }
                coinsRequired = price - coinsInserted;
            }
            //idk why this is showing an error
            cash.acceptMoney(coinsInserted);
            product.makeSale();

            str = "Enjoy your " + productName + "!";

            JOptionPane.showMessageDialog(null, str, "Purchase Succesful", JOptionPane.PLAIN_MESSAGE);
        }
        //dispenser is empty
        else{
            str = "Sorry, " + productName + " is sold out.";
            JOptionPane.showMessageDialog(null, str, "Purchase Unsuccesful", JOptionPane.PLAIN_MESSAGE);

        }
    }

    //now i gotta create a listener for all that button UGH
     
    /**
     * InnerbeverageMachine
     */

    // formal parameter e is a reference variable to ActionEventtype The class ActionEvent
    //contains getActionCommand(YOHOO FINALLY UNDERSTAND Y THEY USE THIS)
    //used to identify which button generated the event.
    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            if(e.getActionCommand().equals("Exit")){
                System.exit(0);
            }
            else if(e.getActionCommand().equals("Coffee")){
                sellProduct(Coffee, "Coffee", theCash);
            }
            else if(e.getActionCommand().equals("Juice")){
                sellProduct(juice, "Juice", theCash);
            }
            else if(e.getActionCommand().equals("Energy Drink")){
                sellProduct(energyDrink, "Energy Drink", theCash);
            }
            else if(e.getActionCommand().equals("Soda")){
                sellProduct(Soda, "Soda", theCash);
            }

        }
        
    }
    

    


}
