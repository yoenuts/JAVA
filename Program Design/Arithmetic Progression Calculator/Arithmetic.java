
/**
 Program by Erlein Nicole

 -- This was inspired by my math class earlier. It's honestly such a tedious process to go about
 plugging values and stuff, I didnt have a calculator so I figured i'd much rather write a program for this and all future series 
 hheheh #hacks

 **/
// This is a simple program that tests my knowledge on previous topics. I'll want to customize this with jframe
// in the future

/**
 * Arithmetic
 */

import javax.swing.JOptionPane;
import java.util.*;
public class Arithmetic {

    public static void main(String[] args) {

        // Allow user to choose from finding a missing term or Adding up terms.
        int menu;
        // The following Strings will be input/Output variables
        String outputStr;
        String inputStr;
        // if user chooses to find the missing term
        int caseA;
        int missingTerm;

        //variables
        double firstTerm = 0;
        double commonDifference = 0;
        double secondTerm = 0;
        double valueOFn = 0;
        double arithmeticTerm = 0;
        double sumOfTerms = 0;

        //main menu
        outputStr = "Welcome! This is my Arithmetic Progression Calculator";
        JOptionPane.showMessageDialog(null, outputStr, "Main Menu", JOptionPane.PLAIN_MESSAGE);
        inputStr = JOptionPane.showInputDialog("Enter 1 to find Arithmetic Term \n Enter 2 to find the sum of Arithmetic terms.");
        menu = Integer.parseInt(inputStr);

        switch(menu) {
            case 1: 
            outputStr = "You have selected \"Find the Arithmetic term\"";
            JOptionPane.showMessageDialog(null, outputStr, "Arithmetic Term", JOptionPane.INFORMATION_MESSAGE);
            inputStr = JOptionPane.showInputDialog("Enter 1 if there is a missing variable, Enter 2 to proceed.");
            caseA = Integer.parseInt(inputStr);
            //missing variable?
            if(caseA == 1) {
                inputStr = JOptionPane.showInputDialog("Select \n 1 = common difference \n 2 = first term \n 3 = for missing n \n ");
                missingTerm = Integer.parseInt(inputStr);
                switch(missingTerm) {
                    case 1: 
                    //missing common difference
                    inputStr = JOptionPane.showInputDialog("To solve for the common difference, Enter the first term: ");
                    firstTerm = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter the second term value: ");
                    secondTerm = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter N: ");
                    valueOFn = Double.parseDouble(inputStr);

                    commonDifference = (secondTerm - firstTerm) / (valueOFn - 1);
                    outputStr = String.format("The value of the Common difference between these terms is %.2f", commonDifference);
                    JOptionPane.showMessageDialog(null, outputStr, "Common Difference", JOptionPane.INFORMATION_MESSAGE);
                    break;

                    case 2:
                    //first term
                    inputStr = JOptionPane.showInputDialog("To solve for the first term, Enter the common difference: ");
                    commonDifference = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter the  a sub n value: ");
                    secondTerm = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter N: ");
                    valueOFn = Double.parseDouble(inputStr);

                    firstTerm = secondTerm - (valueOFn - 1) * commonDifference;
                    outputStr = String.format("The value of the First term is %.2f", firstTerm);
                    JOptionPane.showMessageDialog(null, outputStr, "First Term", JOptionPane.INFORMATION_MESSAGE);
                    break;

                    case 3:
                    //missing n
                    inputStr = JOptionPane.showInputDialog("To solve for N, Enter the first term: ");
                    firstTerm = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter the common diffence between terms: ");
                    commonDifference = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter a sub n: ");
                    secondTerm = Double.parseDouble(inputStr);
        
                    valueOFn = ((secondTerm - firstTerm) / commonDifference) + 1;
                    outputStr = String.format("The value of N is %.2f", valueOFn);
                    JOptionPane.showMessageDialog(null, outputStr, "Value of N", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }

            //proceed to find arithmetic term
            else if(caseA == 2) {

                inputStr = JOptionPane.showInputDialog("To solve for the missing term, Enter the first term: ");
                firstTerm = Double.parseDouble(inputStr);
                inputStr = JOptionPane.showInputDialog("Enter the common diffence between terms: ");
                commonDifference = Double.parseDouble(inputStr);
                inputStr = JOptionPane.showInputDialog("Enter N: ");
                valueOFn = Double.parseDouble(inputStr);

                arithmeticTerm = firstTerm + (valueOFn - 1) * commonDifference;
                outputStr = String.format("The value of a sub n is %.2f", arithmeticTerm);
                JOptionPane.showMessageDialog(null, outputStr, "Arithmetic Term", JOptionPane.INFORMATION_MESSAGE);
                
            }
            break;
            //
            case 2:
            //Sum of arithmetic terms
            outputStr = "You have selected \"Sum of Arithmetic Terms\"";
            JOptionPane.showMessageDialog(null, outputStr, "Sum of Arithmetic Terms", JOptionPane.INFORMATION_MESSAGE);
            inputStr = JOptionPane.showInputDialog("Enter 1 to solve for missing variable given the Sum of Terms \n Enter 2 if N, First and Last term given \n Enter 3 if N, First term and common difference are given.");
            caseA = Integer.parseInt(inputStr);

            if(caseA == 1) {
                // A missing variable
                inputStr = JOptionPane.showInputDialog("1 = missing N \n 2 = missing first term \n 3 = missing common difference \n");
                missingTerm = Integer.parseInt(inputStr);
                switch(missingTerm) {
                     
                    case 1 : // missing N
                    inputStr = JOptionPane.showInputDialog("To solve for N, Enter the first term: ");
                    firstTerm = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter Sum of Terms: ");
                    sumOfTerms = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter Last Term: ");
                    secondTerm = Double.parseDouble(inputStr);

                    valueOFn = (2 * sumOfTerms) / (firstTerm + secondTerm);
                    outputStr = String.format("The value of N is %.2f ", valueOFn);
                    JOptionPane.showMessageDialog(null, outputStr, "Value of N", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                    case 2 : // missing first term
                    inputStr = JOptionPane.showInputDialog("To solve for the missing first term, Enter the the common difference: ");
                    commonDifference = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter Sum of Terms: ");
                    sumOfTerms = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter N: ");
                    valueOFn = Double.parseDouble(inputStr);

                    firstTerm = (sumOfTerms / valueOFn) - (((commonDifference * valueOFn) - commonDifference) / 2);
                    outputStr = String.format("The first term is %.2f", firstTerm);
                    JOptionPane.showMessageDialog(null, outputStr, "First term", JOptionPane.INFORMATION_MESSAGE);
                    break;

                    case 3: //missing Common Difference
                    inputStr = JOptionPane.showInputDialog("To solve for the missing common difference, Enter the sum of terms: ");
                    sumOfTerms = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter first term: ");
                    firstTerm = Double.parseDouble(inputStr);
                    inputStr = JOptionPane.showInputDialog("Enter N: ");
                    valueOFn = Double.parseDouble(inputStr);

                    commonDifference = (2 * sumOfTerms - (2 * firstTerm * valueOFn)) / ((valueOFn * valueOFn) - valueOFn);
                    outputStr = String.format("The common difference is %.2f", commonDifference);
                    JOptionPane.showMessageDialog(null, outputStr, "Common Difference", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            // Sum of terms solution 1
            else if(caseA == 2) {
                inputStr = JOptionPane.showInputDialog("To solve for Sum of Terms, Enter Last Term: ");
                secondTerm = Double.parseDouble(inputStr);
                inputStr = JOptionPane.showInputDialog("Enter first term: ");
                firstTerm = Double.parseDouble(inputStr);
                inputStr = JOptionPane.showInputDialog("Enter N: ");
                valueOFn = Double.parseDouble(inputStr);

                sumOfTerms = (valueOFn / 2) * (firstTerm + secondTerm);
                outputStr = String.format("The sum of terms is %.2f", sumOfTerms);
                JOptionPane.showMessageDialog(null, outputStr, "Sum of Terms", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            //sum of terms solution 2
            else if(caseA == 3){
                inputStr = JOptionPane.showInputDialog("To solve for Sum of Terms, Enter common difference: ");
                commonDifference = Double.parseDouble(inputStr);
                inputStr = JOptionPane.showInputDialog("Enter first term: ");
                firstTerm = Double.parseDouble(inputStr);
                inputStr = JOptionPane.showInputDialog("Enter N: ");
                valueOFn = Double.parseDouble(inputStr);

                sumOfTerms = (valueOFn / 2) * ((2*firstTerm) + ((valueOFn - 1) * commonDifference));
                outputStr = String.format("The sum of terms is %.2f", sumOfTerms);
                JOptionPane.showMessageDialog(null, outputStr, "Sum of Terms", JOptionPane.INFORMATION_MESSAGE);
                
            }
            break;
        }

        System.exit(0);
    }
}