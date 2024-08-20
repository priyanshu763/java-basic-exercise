package SelfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrestestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < n; i++) {

                max = Math.max(max,candies[i]);

        }
        for(int j = 0; j < n; j++) {
            int temp = candies[j] + extraCandies;
            if (temp >= max){
                result.add(true);
            }else{
                result.add(false);

            }
        }


        return result;


    }

    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 8 , 0};
//       // boolean[] result  = new boolean[arr.length];
//        List<Boolean> result = new ArrayList<>();
//        System.out.println(result);

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr3 = new int[4];
        list.add(0, 8);
        list.add(0,9);
        System.out.println(list);
        System.out.println(list.get(0));
        Integer g = Integer.MIN_VALUE;
        String str = "kunal";
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        boolean[] arr = new boolean[26];
        System.out.println(Arrays.toString(arr));
        int[][] flip = new int[2][7];
        System.out.println(Arrays.toString(flip));


    }
}
