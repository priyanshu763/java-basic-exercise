package javaDSA;

// bubble sort(sinking sort or exchange sort) - sorting elements step by step
import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4,3,  5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step , max item will come at the last index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }

            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the loop
            if (!swapped) { // not swapped
                break;
            }
        }
    }
}

//worst and avg. case time complexity: O(n*n)
// auxiliary space: O(1)
