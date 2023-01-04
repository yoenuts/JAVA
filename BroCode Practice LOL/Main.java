//These are practice codes from youtube and various sources//

/*Types, Variables and Operators*/
/** 
class swap{
    public static void main(String[] args){
        String x = "water";
        String y = "KoolAid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
*/

//I/o hackerrank
/** 
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

**/
//I/o 2 hackerrank
/** 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastLine = scanner.nextInt();
        double secondLine = scanner.nextDouble();
        scanner.nextLine();
        String firstLine = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + firstLine);
        System.out.println("Double: " + secondLine);
        System.out.println("Int: " + lastLine);
    }
}
**/ 

//Java GUI
/**
import javax.swing.JOptionPane;

public class Main {
 
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are " + age + " years old.");

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg)"));
        JOptionPane.showMessageDialog(null,"You weigh " + weight + " kg");
    }
} 

**/

//random values
/** 
import java.util.Random;

public class Main {
 
    public static void main(String[] args) {
        //create an instance//
        Random rand = new Random();
        //pseudo random

        int x = rand.nextInt(6) + 1;
        //double y = rand.nextDouble();
        //boolean z = rand.nextBoolean();

        System.out.println(x);
    }
} 

**/