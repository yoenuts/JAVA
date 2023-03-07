package beverage;

// in GC the vending machines finally work and a program is needed to make it
//function properly. The machine sells coffee, soda, juice and energy drink.

// Instructions:
// Show student different products to be sold
// let them make a selection
// show students what they selected because they are dumb-o
// Accept money
// Release item

// Components:
// Cash register, Storage for the items and the entire machine itself

/**
 * Beverage Machine
 */
public class CashRegister {
    private double cashOnHand;
    private double change;

    public CashRegister() {
        cashOnHand = 500;
    }
    
    public CashRegister(double cashIn){ 
        if(cashIn >= 0) {
            cashOnHand = cashIn;
        }
        else {
            cashOnHand = 500;
        }

    }

    public double currentBalance() {
        return cashOnHand;
    }

    public void acceptMoney(double amountIn) {
        cashOnHand = cashOnHand + amountIn;
    }

    public void makeChange(double amountIn, double cost) {
        change = amountIn - cost;
        cashOnHand = cashOnHand - change;
    }

}