package Stacks;

public class StackMain {
    public static void main(String[] args) throws Exception{
        //  CustomStack stack  = new CustomStack(5);
        DynamicStack stack = new DynamicStack(5);  // it can insert more items than what size is passed

        stack.push(34);
        stack.push(7);
        stack.push(94);
        stack.push(56);
        stack.push(90);
        stack.push(45);

        System.out.println(stack.pop());  // pop() method returns the removed element
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());

    }
}
