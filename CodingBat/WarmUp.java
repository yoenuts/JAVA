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
