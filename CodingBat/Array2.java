import java.security.PublicKey;

/** 
//first problem solved!
class Array2{
    public static void main {
        int[] array;
    }

    public int bigDiff(int[] nums) {
        int largest = nums[0];
        int minimum = nums[0];
        for(int i =1;i < nums.length; i++) {
          largest = Math.max(largest, nums[i]);
          minimum = Math.min(minimum, nums[i]);
        }
        
        return largest - minimum;
    }
}
**/

//second problem
/**
class Array2 {
  public static void main(String[] args){
    String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[] symbol ={"Clover", "Diamond", "Heart", "Spade"};

    String[] deck = new String[52];

    for(int i = 0; i < 13; i++) {
      for(int j = 0; j < 4; j++) {
        deck[i + 13*j] = rank[i] + symbol[j];
      }
    }

    for(int i = 0; i < 52; i++) {
      System.out.print(deck[i] + "");
      System.out.println();
    }
  }
}
*/
/* 
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
*/

//hehe got a star for this
public boolean no14(int[] nums) {
  int one = 0;
  int four = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) {
      one++;
    }
    if(nums[i] == 4) {
      four++;
    }
  }
  
  if(one >= 1 && four >= 1) return false;
  
  return true;
}

//didnt get a star but atleast i didnt forget to use Math.abs method here

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  
  for(int i = 0; i < nums1.length; i++) {
    if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2){
      count++;
    }
  }
  
  return count;
}


