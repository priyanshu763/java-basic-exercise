package javaDSA;

import java.util.Arrays;
// selection sort - select an element(max or min) and put it at its correct position
public class selectionSort {
    public static void main(String[] args){
        //int[] arr = {4,5,2,3,1};
        int[] arr = {2,-32, 0,78,1,7,3, 9};
        selection(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void selection(int[] arr)  {
        for (int i=0; i<arr.length; i++)  {
            //  find the max item in the remaining array and swap with correct index
            int last = arr.length -i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i= start ; i<=end; i++){
            if (arr[max] < arr[i]) {
                max=i;
            }
        }
        return max;
    }
}

//worst and avg. time complexity: (n^2)
//space complexity: O(1)
