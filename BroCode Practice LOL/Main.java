/**
import java.util.Scanner;
public class Main{
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

