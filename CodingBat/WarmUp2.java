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

