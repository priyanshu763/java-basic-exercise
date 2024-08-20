package SelfPractice;

import java.util.Stack;

public class queueUsingStack {
    public static void main(String[] args) {

    }
}
class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();


    }

    public void push(int x) {
        input.push(x);
        return;

    }

    public int pop() {
        peek();
        return output.pop();


    }

    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }

        }
        return output.peek();

    }

    public boolean empty() {
        return input.empty() && output.empty();

    }
}
