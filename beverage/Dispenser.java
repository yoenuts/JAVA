package beverage;

public class Dispenser {
    
    private int numberOfItems;
    private double cost;

    public Dispenser() {
        numberOfItems = 50;
        cost = 30;
    }

    public Dispenser(int setNoItem, double setCost) {
        if(setNoItem >= 0) {
            numberOfItems = setNoItem;
        }
        else {
            numberOfItems = 50;
        }

        if(setCost >= 0) {
            cost = setCost;
        }
        else{
            cost = 30;
        }
    }

    public int getCount() {
        return numberOfItems;
    }

    public double getProductCost() {
        return cost;
    }

    public void makeSale(){
        numberOfItems--;
    }


}
