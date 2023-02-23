/**
 * A menu driven program demonstrating the scope of identifiers within a class
 */

import java.util.*;



public class Conversion {
    static Scanner scan = new Scanner(System.in);
    static final double CONVERSION = 2.54;
    
    public static void main(String[] args) {
        int choice;
        int inches;
        int centimeters;
        showChoices();
        choice = scan.nextInt();
        System.out.println();


        switch(choice){
            case 1: 
            System.out.println("Enter value in to convert to cm: ");
            inches = scan.nextInt();
            inchesToCm(inches);
            break;
            case 2:
            System.out.println("Enter value in to convert to cm: ");
            centimeters = scan.nextInt();
            cmToInches(centimeters);
            break;
            case 3:
            break;
        }
    }
    
    public static void showChoices() {
        System.out.println("Enter--");
        System.out.println("1: To convert from in to cm");
        System.out.println("2: To convert from cm to in");
        System.out.println("3: Exit Program");
    }

    public static /*int*/void inchesToCm(int in){
        //return (int) (in * CONVERSION);
        in = (int) (in * CONVERSION);
        System.out.println(in);
    }

    public static void cmToInches(int cm){
        cm = (int) (cm/CONVERSION);
        System.out.println(cm);
    }
}