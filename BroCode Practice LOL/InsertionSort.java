public class InsertionSort {
    public static void main(String[] args) {
        public int centeredAverage(int[] nums) {
  
            int sum = 0, count = 0;
            int highest, lowest, temp, j;
            
            for(int i = 1; i < nums.length; i++) {
              temp = nums[i];
              j = i - 1;
              while(j >= 0 && temp < nums[j]) {
                nums[j+1] = nums[j];
                j--;
              }
              nums[j+1] = temp;
            }
            
            lowest = nums[0];
            highest = nums[nums.length];
            
            for(int k = 1; k < nums.length - 1; k++) {
              if(k > 1 && k < nums.length && (nums[k] == lowest || nums[k] == highest)) {
                k++;
                
              }
              sum += nums[i];
              count++;
            }**/
}
