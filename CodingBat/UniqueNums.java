/** 
import java.util.Scanner;
//Create a class named UniqueNums
public class UniqueNums {
    //Create 5 element array called Numbers
    int[] numbers = new int[5];
    //Create 4 variables
    int num = 0, numValues = 0;
    boolean valid = true;
    Scanner in = new Scanner(System.in);

    //Use while loop to ask user to fill array with values
    while(numValues < 5){
        System.out.println("Fill the array with values."); 
        num = in.nextInt();
        numbers[numValues] = num;
        numValues++;
    }
    //use a "nested" do while loop to ask user for unique numbers
    do{
        System.out.println("Fill the array with unique values.");
        num = scan.nextInt();
        //use a nested for loop to check if unique
        // need to edit this
        for(numValues = 0; numValues < 5; numValues++){
            if(numbers[numValues] == num) {
                valid = false;
            }
            else {

            }

        }
    }
}
**/

import java.util.Arrays;

public class CenterAverage {
    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int min = nums[0];
        int max = nums[nums.length - 1];
        int minCount = 0;
        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                minCount++;
            }
            if (nums[i] == max) {
                maxCount++;
            }
            sum += nums[i];
        }
        
        sum = sum - min * minCount - max * maxCount;
        int count = nums.length - minCount - maxCount;
        
        return sum / count;
    }
}

