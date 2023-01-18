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
/** 
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = new String(scan.nextLine());
        scan.close();
        oddBit(word);
    }
    public static String oddBit(String str) {
        String result = "";
        
        for(int i = 0; i < str.length(); i+=2) {
            result += str.substring(i, i+1);
        }
        
        System.out.println(result);
        return result;
    }
}

**/
/** 
import java.util.Scanner;

public static String stringSplosion(String str) {
    String add = "";
    for(int i = 0; i <= str.length(); i++) {
        add = add + str.substring(0, i);
    }
    System.out.println(add);
    return add;
        

}

**/

//Introducing .charAt method

/**public String stringYak(String str) {
  String test = "";
  for(int i = 0; i < str.length(); i++){
    if(i+2<str.length()&& str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
      i = i+2;
    }
    else {
      test = test + str.charAt(i);
    }
  }
  
  return test;
} */

/** 
public int array667(int[] nums) {
    int count = 0;
    for(int i = 0; i<nums.length - 1; i++) {
      if(nums[i] == 6 && nums[i+1] == 6 || nums[i+1] == 7) {
        count++;
        //i = i + 1;
      }
    }
    return count;
}
**/
/**
public boolean has271(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++) {
    if(nums[i + 1] == nums[i]+ 5 && Math.abs(nums[i+2] - (nums[i] - 1)) <= 2) return true;
  }
  return false;
}
 */
/**
 // length always starts at 1, so when need last value from an array, must be length - 1.
 public boolean commonEnd(int[] a, int[] b) {
  if(a[a.length -1] == b[b.length - 1] || a[0] == b[0]) return true;
  return false;
}
 */
