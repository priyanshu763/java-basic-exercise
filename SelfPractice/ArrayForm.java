package SelfPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        //list.set(2,8);
        System.out.println(list);
        list.size();
        List<Integer> l1 = new ArrayList<>();
        System.out.println(l1);

        int[] arr = {1, 2, 3};




    }



    public List<Integer> addToArrayForm(int[] num, int k) {  // not fully correct
        int numb = 0;
        for (int i =  0; i < num.length; i++) {
            numb = numb * 10 + num[i];
        }
        int form = numb + k;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        while (form != 0) {
            l1.add(form % 10);
            form = form/10;
            
        }

        for (int i = l1.size() - 1; i >= 0; i--) {
            l2.add(l1.get(i));
        }

        return l2;



    }
}
