package javaDSA;

import java.util.Arrays;
// insertion sort - sorting the elements in parts

public class insertionSort {
    public static void main(String[] args) {
        //int[]  arr = {4,3,8,0,21,67};
        int[] arr= {5,3,4,1,2};
        //int[] arr = {0,-23,-67,8,9,0,3,2,78,129,78};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }



    static void insertion(int[] arr) {
        for(int i=0;i< arr.length-1; i++)  {
            for(int j=i+1; j>0; j--)  {
                if (arr[j] < arr[j-1])  {
                    swap(arr, j,j-1);
                }else{
                    break;
                }
            }
        }

    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// time complexity : O(N^2)
// auxiliary space : O(1)
