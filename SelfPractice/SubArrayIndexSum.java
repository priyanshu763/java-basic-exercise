package SelfPractice;

import java.util.ArrayList;
import java.util.List;

public class SubArrayIndexSum {

    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
            for (int j = i + 1; j < n; j++) {
                currentSum += arr[j];

                if (currentSum == s) {
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
            }
        }
        list.add(-1);
        return list;
    }

    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 1) return arr[0] != s ? new ArrayList(-1) : new ArrayList(0);


        int i = 0, j = 0, sum = 0;
        while (i <= j && i < n && j < n) {
            sum += arr[j];
            while(sum > s && i < j) {
                sum = sum - arr[i++];
            }
            if(sum == s) {
                list.add(i+1);
                list.add(j+1);
                return list;
            }
            j++;
        }
        list.add(-1);
        return list;
    }



        public static void main(String[]args){
             int[]arr={1,2,3,7,8,9};
             int n=6;

             List result=subarraySum2(arr,n,12);
             System.out.println(result);
        }
}