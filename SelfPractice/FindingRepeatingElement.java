package SelfPractice;
import java.util.ArrayList;

public class FindingRepeatingElement {
    public static void printRepeating(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {

                    list.add(arr[i]);
                }


        }

        if (list.size() == 0) {
            list.add(-1);
        }

        for(int ele : list) {
            System.out.print(ele + " ");
        }

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int num : arr){
//            map.put(num, map.getOrDefault(num, 0)+1);
//        }
//        for(int keys : map.keySet()){
//            if(map.get(keys) != 1){
//                System.out.println(keys);
//            }
//        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        printRepeating(arr,3);
    }
}
