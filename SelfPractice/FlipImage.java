package SelfPractice;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,1},{1,0,1,1},{0,0,0,0},{0,1,1,0}};



    }


    public int[][] flipAndInvertImage(int[][] image) { // fastest
        for (int[] a : image) {
            int l = 0;
            int r = a.length - 1;
            while (l <= r) {
                int temp = a[l];
                a[l++] = a[r] ^ 1;
                a[r--] = temp ^ 1;
            }

        }



        return image;



    }


    public int[][] FlipAndInvertImage(int[][] image) {
        for (int[] a : image) {
            int l = 0;
            int r = a.length - 1;
            int n = a.length;
            for (int i = 0; i < n/2; i++) {
                int temp = a[i];
                a[i] = a[n - 1 - i];
                a[n - 1 - i] = temp;
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    a[i] = 1;
                }else {
                    a[i] = 0;
                }
            }

        }



        return image;



    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }

}
