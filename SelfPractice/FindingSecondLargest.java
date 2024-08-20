package SelfPractice;

import java.util.*;

public class FindingSecondLargest {
    public static void main(String[] args) {
        Integer[] arr = {12, 35, 1, 10, 34, 1};
        Integer[] arr2 = {1,1,1,1,1};
        int n = arr2.length;
        print2largest(arr2, n);


    }

    static void print2largest(Integer[] arr , int n) {
        // sorting array in descending order
        // Arrays.sort(arr)  // Ascending order
        Arrays.sort( arr, Collections.reverseOrder());  // descending order

        for(int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                System.out.println("the second largest element is " + arr[i]);
                break;
            }
        }
        System.out.println(-1);




    }
}
