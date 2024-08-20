package SelfPractice;
import java.util.ArrayList;
import java.util.Arrays;

public class FindUniqueN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(7)));

    }

    public static int[] sumZero(int n) {
        if (n == 1) {
            return new int[]{0};
        }
        int[] arr = new int[n];
        if (n % 2 == 0) {
            for ( int i = 0; i < n-1; i = i+2) {
                arr[i] = i+1;
                arr[i+1] = -(i+1);

            }
        }else {
            for ( int i = 0; i < n-1; i = i+2) {
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }
            arr[n-1] = 0;
        }


        return arr;


    }
}
