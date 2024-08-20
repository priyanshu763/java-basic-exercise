package SelfPractice;
import java.util.Stack;


public class NextGreaterElement {
    public static void main(String[] args) {

    }


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{0};
        }
        int[] nge = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            if(stack.isEmpty()) {
                nge[i] = -1;
                continue;
            }

            if (stack.peek() > element) {
                stack.push(element);
                nge[i]= stack.peek();
                continue;

            }

            while (stack.peek() <= element && !stack.isEmpty()) {
                stack.pop();
            }

            if (stack.isEmpty() ) {
                nge[i] = -1;
            }else{
                nge[i] = stack.peek();
                stack.push(element);
            }


        }

        return nge;







    }




}
