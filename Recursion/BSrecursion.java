package Recursion;

//binary search in recursion

public class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 55;
        System.out.println(search(arr, target, 0,arr.length-1));

    }


    static int search(int[] arr, int target, int s, int e) {
        // note: if there are variables that you need to pass in the future recursion calls then put it as a arguments in function
        if (s > e) {
            return -1;

        }

        int m = s + (e - s)/2;

        if (arr[m] == target) {
            return m; //index value
        }

        if (target < arr[m]) {
            return search(arr, target , s , m-1);
            //if you are calling a recursion call then make sure you return it if there is a return type
        }

        return search(arr, target, m+1,e);


    }
}
