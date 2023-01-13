//Introduction to Loops and Arrays!

//1: Print a word n num of times

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
