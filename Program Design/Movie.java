import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class Movie{
    public static void main(String[] args) throws FileNotFoundException{
        //**********************************************************
        // written 01/02/2023
        // Program: Movie ticket sale and donation to charity
        //This program utilizes file input/output and prompts user to input values using
        //simple JOptionPane simple Dialog box
        //Erlein got the idea from a book and had so much fun!
        // note: you will need a file "ticketPrice" containing the adult and child ticket 
        // price in decimal format, in one line seperate by a single space, for this to work.
        //**********************************************************
        //Step 1: get movie name
        String movieName;
        String inputStr;
        String outputStr;
        //Step 2: get ticket prices
        Scanner inFile = new Scanner(new FileReader("ticketPrice.txt"));
        double adultTicketPrice;
        double childTicketPrice;

        adultTicketPrice = inFile.nextDouble();
        childTicketPrice = inFile.nextDouble();
        //Step 3: get number of tickets sold
        int noOfAdultTicketSold;
        int noOfChildTicketSold;
        //Step 4: Get the percentage of the gross amount donated to charity
        double percentDonation;
        double grossAmount;
        double amountDonated;
        double netSaleAmount;
        //Step 5:
        //create a message dialog
        movieName = JOptionPane.showInputDialog("Enter the movie name:");
        inputStr = JOptionPane.showInputDialog("Enter number of Adult tickets sold:");
        noOfAdultTicketSold = Integer.parseInt(inputStr);
        inputStr = JOptionPane.showInputDialog("Enter number of Child tickets sold:");
        noOfChildTicketSold = Integer.parseInt(inputStr);
        inputStr = JOptionPane.showInputDialog("Enter the percentage of the donation:");
        percentDonation = Double.parseDouble(inputStr);

        //

        grossAmount = (adultTicketPrice * noOfAdultTicketSold) + (childTicketPrice * noOfChildTicketSold);
        amountDonated = grossAmount * percentDonation / 100;
        netSaleAmount = grossAmount - amountDonated;

        outputStr = String.format("Movie Name: %s%n", movieName) +
        String.format("Number of Tickets Sold: %d%n", noOfAdultTicketSold + noOfChildTicketSold) +
        String.format("Gross Amount: $%.2f%n", grossAmount) +
        String.format("Amount Donated: %.2f%n", amountDonated) +
        String.format("Net Sale: %.2f%n", netSaleAmount);

        JOptionPane.showMessageDialog(null, outputStr, "Movie Ticket Sale and Donation to Charity", JOptionPane.INFORMATION_MESSAGE);
        PrintWriter outFile = new PrintWriter("Movie.out");

        outFile.printf("Movie Name : %s%n", movieName);
        outFile.printf("Gross Amount : $%.2f%n", grossAmount);
        outFile.printf("The amount you donated was : $%.2f%n", amountDonated);
        outFile.printf("The amount you earned was : $%.2f%n", netSaleAmount);

        inFile.close();
        outFile.close();
        System.exit(0);
    }
}


