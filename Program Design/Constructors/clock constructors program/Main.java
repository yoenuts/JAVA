/**
 * Clock
 */
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        Clock myClock = new Clock(5,4,13);
        Clock yourClock = new Clock();

        System.out.println("My clock time: ");
        myClock.printTime();
        System.out.println();

        System.out.println("Your clock time: ");
        yourClock.printTime();
        System.out.println();

        int hours, minutes, seconds;

        System.out.println("Set myClock time: ");
        hours = scan.nextInt();
        minutes = scan.nextInt();
        seconds = scan.nextInt();

        myClock.setTime(hours, minutes, seconds);

        System.out.println("Set yourClock time: ");
        hours = scan.nextInt();
        minutes = scan.nextInt();
        seconds = scan.nextInt();

        yourClock.setTime(hours, minutes, seconds);

        System.out.println("My new clock time: ");
        myClock.printTime();
        System.out.println();
        System.out.println("Your new clock time: ");
        yourClock.printTime();
        
        System.out.println();

        myClock.incrementHours();

        System.out.println("Your new clock time after incrementing hours2: ");
        myClock.printTime();

        myClock.incrementMinutes();

        System.out.println();
        System.out.println("Your new clock time after incrementing mins: ");
        myClock.printTime();




    }

}
