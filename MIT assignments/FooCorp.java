
/**
 Summary of Rules:
 - Hours Worked * Base Pay <= 40 Hours
 - HW * Base Pay * 1.5   40<HW<60 hours
 - print error for base pay below $8, print error for over 60 hours
 */
import java.util.Scanner;

public class FooCorp {
    public static void main(String[] args) {
        double base_pay;
        double workhours;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello, "+name);
        
        do{
            System.out.println("What is Employee's Base Pay?(Min. of $8)");
            base_pay = scan.nextDouble();
        }while(base_pay < 8);

        do{
            System.out.println("Enter number of hours: ");
            workhours = scan.nextDouble();
        }while(workhours < 40 || workhours > 60);

        scan.close();

        fooCorp(workhours,base_pay);
    }

    public static double fooCorp(double hours, double pay) {
        double result = hours * pay;
        if(hours > 40){
            result = hours * (pay * 1.5) ;
        }

        System.out.println("Pay your Employee: $" +result);
        return result;
    }
}
