package RecursionQ;

import java.util.ArrayList;

public class Findelement {
    public static void main(String[] args) {
        int[] arr = {12,67,90,4,7,9,16,89};
        int target = 16;
        System.out.println(find(arr, target, 0));
        System.out.println(findindex(arr, target, 0));
        System.out.println(findindexlast(arr, target, arr.length-1 ));
        int[] arr1 = {2, 3, 1, 4, 4, 5};
        // findallindex(arr1, 4   , 0);
        // System.out.println(list);
        ArrayList<Integer> ans = findallindex(arr1, 4,0, new ArrayList<>());
        // new ArrayList<>() : [] (empty list created)
        System.out.println(ans);
        System.out.println(findallindex2(arr1,4,0));






    }

    static int findindex(int[] arr,  int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else{
            return findindex(arr, target, index + 1);
        }

    }

    static boolean find(int[] arr,  int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);


    }

    static int findindexlast(int[] arr,  int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else{
            return findindexlast(arr, target, index - 1);
        }

    }


    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr,  int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findallindex(arr, target, index + 1);
    }


    // return type is list

    static ArrayList<Integer> findallindex(int[] arr,  int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return  findallindex(arr, target, index + 1,list);
    }


    static ArrayList<Integer> findallindex2(int[] arr,  int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findallindex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }




}
