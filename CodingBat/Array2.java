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
public int centeredAverage(int[] nums) {
    int sum = 0, count = 0;
    int largest = nums[0];
    int minimum = nums[0];
    for(int i =1;i < nums.length; i++) {
      largest = Math.max(largest, nums[i]);
      minimum = Math.min(minimum, nums[i]);
    }
    
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != largest || nums[i] != minimum) {
        sum = sum + nums[i];
        count++;
      }
    }
    
    return sum/count;
  }
**/

class Array2 {
  /**
   * @param args
   */
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

