//Introduction to Loops and Arrays!

//1: Print a word n num of times
/** 
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        System.out.println("Enter a value:");
        int value = scan.nextInt();
        scan.close();
        stringTimes(word, value);
    }
    public static String stringTimes(String str, int value) {
        String result = "";
        for (int i = 0; i < value; i++) {
            result += str;
            
        }
        System.out.println(result);
        return result;
    }
}
**/
/** 
//2: Print first three letters of a word n num of times
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        System.out.println("Enter a value:");
        int value = scan.nextInt();
        scan.close();
        frontTimes(word, value);
    }
    public static String frontTimes(String str, int value) {
        String result = "";
        if(str.length() >= 3){
            str = str.substring(0, 3);
        }

        for (int i = 0; i < value; i++) {
            result += str;
            
        }
        System.out.println(result);
        return result;
    }
}
**/

//This one's pretty complicated cuz lol im not used to the counting it's complicated
/**
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        CountXX(word);
    }
    public static int CountXX(String str) {
        int count = 0;

        for(int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
**/

/** 
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        CountXX(word);
    }
    public static boolean CountXX(String str) {
        boolean thing = true;
        int i = str.indexOf("x");
        if (i == -1 || i + 1 >= str.length()) {
            thing = false;
            System.out.println(thing);
        }    //return false;
        
        //return str.substring(i + 1, i + 2).equals("x");
        if (str.substring(i + 1, i + 2).equals("x")){
            System.out.println(thing);
        }
        return thing;
    }
}
**/
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        oddBit(word);
    }
    public static boolean oddBit(String str) {
        string result = "";
        
        for(int i = 0; i < str.length(); i+=2) {
            result += str.substring(i, i+1);
    }
        return result;
}

