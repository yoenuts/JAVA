
//Theae are my solution to Coding Bat. I'm not necessarily sure if the syntax is correct since I havent gotten so far as to dive into proper syntax for functions.
/**public class WarmUp {
    public static int diff21(int n){
        if(n > 21){
            return (21 - n) * 2;
        }
        else{
            return 21 - n;
        }
    }
}**/

//practicing functions and stuff
/**
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = scan.nextInt();
        scan.close();
        nearHundred(n);
    }
    public static boolean nearHundred(int value){
        if ((Math.abs(100 - value) <= 10) || (Math.abs(200 - value) <= 10)) {
            System.out.println("Yo");
            return true;
        }
        else{
            System.out.println("Mama");
            return false;
        }
    }
}
**/
/** 
// at this point i dont et why i have to include return just so i can print out 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        notString(word);
    }

    public static String notString(String str){
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            System.out.println(str);
            return str;
        }
        System.out.println("not "+str);
        return "not" +str;
    }
}
**/
/** 
import java.util.Scanner;
public class WarmUp{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        frontBack(word);
    }
    //exchange the first and last letters
    public static String frontBack(String str) {
        if (str.length() < 2){
          System.out.println(str);
          return str;
        }
        else {
            str = str.substring(str.length() - 1) + str.substring(1, str.length()- 1) + str.substring(0, 1); 
            System.out.println(str);
            return str;
        }
    }
}   
**/

import java.util.Scanner;
public class WarmUp{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        front3(word);
    }
    //exchange the first and last letters
    public static String front3(String str) {
        String first = str.substring(0, str.length());
        if (str.length() >= 3){
            first = str.substring(0, 3);
        }

        System.out.println(first + first + first);
        return first + first + first;

    }
} 