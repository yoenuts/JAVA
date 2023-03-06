package circle;
import java.util.*;

public class testCircle {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        Circle firstCircle = new Circle(12);
        Circle secondCircle = new Circle();
        double radius;

        System.out.println("The first circle: " + firstCircle);
        System.out.println("The second circle: " + secondCircle);

        System.out.println("Set the radius of the second circle: ");
        radius = console.nextDouble();

        secondCircle.setRadius(radius);
        //check if it works
        System.out.println("The second circle: " + secondCircle);

        //compare greater or less

        if(firstCircle.getRadius() > secondCircle.getRadius()) {
            System.out.println("The radius of the second circle is less than the first circle.");
        }
        else if(firstCircle.getRadius() == secondCircle.getRadius()){
            System.out.println("The radius of both circles is equal.");
        }
        else {
            System.out.println("The radius of the second circle is greater than the first circle.");
        }

    }
}
