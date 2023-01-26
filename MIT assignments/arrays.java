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