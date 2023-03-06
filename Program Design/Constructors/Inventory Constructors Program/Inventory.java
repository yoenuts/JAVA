public class Inventory {

    String name;
    double price;
    int itemNo;
    int itemsInStock;

    public Inventory() {
        name = "";
        price = 0.0;
        itemNo = -1;
        itemsInStock = 0;
    }

    public Inventory(String name) {
        this.name = name;
        this.price = 0.0;
        this.itemNo = -1;
        this.itemsInStock = 0;
    }

    public Inventory(String name, double cost, int iNum) {
        this.name = name;
        this.price = cost;
        this.itemNo = iNum;
        this.itemsInStock = 0;
    }

    public Inventory(String name, double cost, int iNum, int stock) {
        this.name = name;
        this.price = cost;
        this.itemNo = iNum;
        this.itemsInStock = stock;
    }

    
}
