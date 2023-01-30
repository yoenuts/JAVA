//Theae are my solution to Coding Bat. I'm not necessarily sure if the syntax is correct since I havent gotten so far as to dive into proper syntax for functions.
/** 
public class WarmUp {
    public int diff21(int n){
        if(n > 21){
            return (21 - n) * 2;
        }
        else{
            return 21 - n;
        }
    }
}
**/


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

/**
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
**/

//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

/***
import java.util.Scanner;
public class WarmUp{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        Deldel(word);
    }
    //exchange the first and last letters
    public static String Deldel(String str) {
        if(str.length() >= 4 && str.substring(1, 4).equals("del")) {
            System.out.println(str.substring(0, 1) + str.substring(4));
            return str.substring(0, 1) + str.substring(4);
        }
        System.out.println(str);
        return str;
    }
} 

**/


//simple return the highest value program
/**
public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 values");
        System.out.println("Enter 1st value: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd value: ");
        int b = scan.nextInt();
        System.out.println("Enter 3rd value: ");
        int c = scan.nextInt();
        scan.close();
        intMax(a, b, c);

    }

    public static int intMax(int a, int b, int c) {
        int max;
        if(a > b) {
          max = a;
        }
        else {
          max = b;
        }
        
        if (c > max) {
          max = c;
        }
        System.out.println(max);
        return max;
        /**
        if(a > b && c <= a){
          return a;
        }
        if(b > a && c <= b){
       
      }   return b;
        }
        return c;
        **/
    }
/*** 

public class WarmUp{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        endUp(word);
    }
    //capitalize the last three letters
    public static String endUp(String str) {
        String front, back;
        if(str.length() >= 3) {
          back = str.substring(str.length() - 3, str.length());
          front = str.substring(0, str.length() - 3);
          return front + back.toUpperCase();
        }
        return str.toUpperCase();
    }
    
    //other way of doing so
      /**
       public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end
        
        return front + back.toUpperCase();
**/


/**
public boolean or35(int n) {
  if (n % 3 == 0 || n % 5 == 0){
    return true;
  }
  return false;
}
// return (n % 3 == 0) || (n % 5 == 0);
**/

/**public boolean in3050(int a, int b) {
    return ((a >= 30 || a <= 40) && (b >= 30 || b <= 40)) || (a >= 40 || a <= 50 && b >= 40 || b <= 50);
  }**/

import java.util.Scanner;
class Array2{
  Public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type a name:");
    String input = scan.nextLine();
    scan.close();
    System.out.println(input);
  }
}