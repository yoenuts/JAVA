public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,4,2,1,3};
        int temp, j;

        for(int i = 0; i < array.length; i++) {
            temp = array[i];
            j = i - 1;
            while(j >= 0 && temp < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
