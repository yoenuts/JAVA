

// formatting output with printf

/**
public class Main {
    public static void main(String[] args) {
        double hours = 35.45;
        double rate = 15.00;
        double tolerance = 0.01000;

        System.out.println("Fixed decimal notation:");
        System.out.printf("hours = %.2f, rate = %.2f, pay = %.2f," + " tolerance = %.2f%n%n", hours, rate, hours * rate, tolerance);

        System.out.println("Scientific notation:");
        System.out.printf("hours = %e, rate = %e, pay = %e%n" + " tolerance = %e", hours, rate, hours * rate, tolerance);


    }
}
**/

//formatting columns
/** 
public class Main{
    public static void main(String[] args) {
        int num = 96;
        double rate = 15.50;

        System.out.println("1234567890123456789");
        System.out.printf("%5d %n", num);
        System.out.printf("%5.2f %n", rate);
        System.out.printf("%5d%6.2f %n", num,rate);
        System.out.printf("%5d %6.2f %n", num, rate);

    }
}

**/

//parsing numeric strings
//when a string contains only an int or a float it is a numeric string. Java has methods to convert numeric string into numeric form

/**
public class Main{
    public static void main(String[] args) {
        String thing = "12345";
        String thing2 = "12345";

        System.out.print(Integer.parseInt(thing) + Integer.parseInt(thing2));
    }
}
**/

//HAHHAHA ANG SAYA OK


/*
import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name and press OK.");
        JOptionPane.showMessageDialog(null, "Hello " + name, "Welcome", JOptionPane.PLAIN_MESSAGE);

        //information, warning, plain and question
    }
}
*/
//Circle Calculator
/** 
public class Main{
    public static void main(String[] args) {
        double radius;
        double area;
        double circumference;

        String radiusString;
        String outputStr;

        radiusString = JOptionPane.showInputDialog("Enter the radius: ");

        radius = Double.parseDouble(radiusString);
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        outputStr = String.format("Radius: %.2f%n", radius) +
            String.format("Area: %.2f square units%n", area) +
            String.format("Circumference: %.2f units%n", circumference);

        JOptionPane.showMessageDialog(null, outputStr, "Circle", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); 
    }
}
**/


import java.util.Scanner;
import java.io.*;
//file input and output
//using Scanner FileReader and Print Writer
public class Main{
    public static void main(String[] args) throws FileNotFoundException{

        Scanner inFile = new Scanner(new FileReader("employeeData.txt"));
        String firstName;
        String lastName;

        double hoursWorked;
        double payRate;
        double wages;

        firstName = inFile.next();
        lastName = inFile.next();
        hoursWorked = inFile.nextDouble();
        payRate = inFile.nextDouble();

        wages = hoursWorked + payRate;

        PrintWriter outFile = new PrintWriter("prog.out");

        outFile.println("The paycheck is: $" + wages);

        inFile.close();
        outFile.close();

    }
}








