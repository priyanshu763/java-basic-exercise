package ArraysQ;

import java.util.Arrays;
//Q: running sum of array
public class Arrays01 {
    public static void main(String[] args)  {
        // int[] nums = {1,2,3,4};
        int[] nums = {1, 1, 1, 1, 1};
        int[] arr = nums;
        int sum = 0;
        for (int i = 0; i<nums.length;i++){
            sum += nums[i];
            arr[i] = sum;


        }
        System.out.println(Arrays.toString(arr));
    }
}
