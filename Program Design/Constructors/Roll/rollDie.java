package Roll;

public class rollDie {
    //set default constructor
    private int num;

    rollDie() {
        num = 1;
    }

    public int Roll() {
        num = (int) ((Math.random() * 6) + 1);
        return num;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        //return String.format("You rolled %d ", num);
        return " " + num;
    }


}
