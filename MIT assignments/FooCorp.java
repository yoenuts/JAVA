
/**
 Summary of Rules:
 - Hours Worked * Base Pay <= 40 Hours
 - HW * Base Pay * 1.5   40<HW<60 hours
 - print error for base pay below $8, print error for over 60 hours
 */

import java.util.Scanner;

public class FooCorp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("Enter number of hours worked:");

        double workhours = scan.nextInt();
        while(workhours > 60.0) {
            System.out.println("You're overworking them pay million dollars. Try Again.");
            break;
        }
 
        System.out.println("What is Employee's Base Pay?");

        double base_pay = scan.nextDouble();
        while(base_pay < 8.0) {
            System.out.println("Modern day slavery?! Try again.");
            break;
        }

        scan.close();

        FooCorp(workhours,base_pay);
    }

    public static double FooCorp(double hours, double pay) {
        double result = hours * pay;
        if(hours > 40){
            result = hours * (pay * 1.5) ;
        }
        System.out.println("Pay your Employee: $" +result);
        return result;
    }
}
