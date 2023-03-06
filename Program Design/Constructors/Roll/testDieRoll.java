package Roll;
import java.util.*;

public class testDieRoll{
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        rollDie firstDie = new rollDie();
        rollDie secondDie = new rollDie();

        System.out.println("Die 1: " + firstDie);
        System.out.println("Die 2: " + secondDie);

        System.out.println("RICKROLL " + "die 1: " + firstDie.Roll());
        System.out.println("RICKROLL " + "die 2: " + secondDie.Roll());

        System.out.println("After rolling " + "die 1: " + firstDie.Roll());
        System.out.println("After rolling " + "die 2: " + secondDie.Roll());

        System.out.println("The sum of both dice rolled is: " + (firstDie.getNum() + secondDie.getNum()));
    }
}