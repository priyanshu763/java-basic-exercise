package SelfPractice;

import java.util.Arrays;

public class SuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums, n)));


    }

    public static int[] shuffle(int[] nums, int n) {
        int [] res = new int[2*n];
        int index = 0;

        for(int i = 0; i<n; i++){
            res[index++] = nums[i];
            res[index++] = nums[i + n];

        }
        return res;
    }
}
