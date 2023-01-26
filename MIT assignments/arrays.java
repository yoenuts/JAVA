//because im lazy, I shalt copy paste the function codes and not make it an executable function LOL
/** 
//this on eis pretty self explanatory
public int sum2(int[] nums) {
    int sum = 0;
    
    for(int i = 0; i < nums.length; i++) {
      if(nums.length > 2) {
        sum = nums[0] + nums[1];
        break;
      }
      sum += nums[i];
    }
    return sum;
  }
**/

/**
public int[] reverse3(int[] nums) {
  int[] Array = new int [3];
  int i = 0, j = nums.length;
  while(j>0){
    Array[i] = nums[j - 1];
    i++;
    j--;
  }
  
  return Array;
}
 */
/* 
 //this is my solution. i though about using math max but somehow didnt cuz i thought i'd need to implement a loop?

 public int[] maxEnd3(int[] nums) {
    int[] Array = new int [3];
    for(int i = 0; i < nums.length; i++) {
      if(nums[0] > nums[nums.length - 1]) {
        Array[i] = nums[0];
      }
      else {
        Array[i] = nums[nums.length - 1];  
      }
    }
    
    return Array;
  }
// this part is their solution
  public int[] maxEnd3(int[] nums) {
    int max = Math.max(nums[0], nums[2]);
    nums[0] = max;
    nums[1] = max;
    nums[2] = max;
    return nums;
    
    // Solution notes: you could write if-logic to figure out
    // which element is the biggest, but here we use Math.max()
    // to solve that part nicely.
  }
*/