package Stacks;

import java.util.Stack;
// all the methods used are present in Stack : these all are abstract methods present in Stack

public class QueueusingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;


    public void  QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception {  // peek : it is the element removed first
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;

    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
