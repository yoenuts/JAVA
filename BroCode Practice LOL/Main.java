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

import javax.swing.JOptionPane;

public class Main {
 
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Student Name");
        JOptionPane.showMessageDialog(null,name);

        String program = JOptionPane.showInputDialog("Program:");
        JOptionPane.showMessageDialog(null,progam);

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter ID Number"));
        JOptionPane.showMessageDialog(null,number);
    }
} 



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
//hackerrank if else//
/** 
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int hack = scan.nextInt();

        if(hack % 2 == 0){
            if(hack >= 6 && hack <= 20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
        
        scan.close();
    }
}
**/

//practicing functions and stuff
/**
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = scan.nextInt();
        scan.close();
        nearHundred(n);
    }

    public static boolean nearHundred(int value){
        if ((Math.abs(100 - value) <= 10) || (Math.abs(200 - value) <= 10)) {
            System.out.println("Yo");
            return true;
        }
        else{
            System.out.println("Mama");
            return false;
        }
    }
}

**/
/** 
// at this point i dont et why i have to include return just so i can print out 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        notString(word);
    }

    public static String notString(String str){
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            System.out.println(str);
            return str;
        }
        System.out.println("not "+str);
        return "not" +str;
    }

    public static void main(String[ args]) {
      String Chris = "Chris";
    
      System.out.print("Hello" + Chris);
      System.out.println();
    }
    
}
**/