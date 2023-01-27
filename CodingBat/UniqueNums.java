
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
