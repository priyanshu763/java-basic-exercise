package SelfPractice;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20} ;
        rotate(arr, 10, 3);
        System.out.println(Arrays.toString(arr));

    }

    static void rotate(int[] arr, int n, int d) {


        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n -1; j++) {
                arr[j] = arr[j+1];

            }
            arr[n - 1] = temp;
        }

    }
}
