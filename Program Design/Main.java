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