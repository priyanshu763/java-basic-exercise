package Stacks;

import java.util.LinkedList;
import java.util.Stack;
// Stack follow => LIFO (last in first out)
public class inBuildExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(7);
        stack.push(94);
        stack.push(56);
        stack.push(90);

        System.out.println(stack.pop());  // pop() method returns the removed element
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());





    }
}
