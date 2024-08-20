package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

//queue follow => FIFO (first in first out)

public class inBuildExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();  // queues are interfaces which have some abstract methods
        queue.add(3);
        queue.add(6);
        queue.add(89);
        queue.add(23);
        queue.add(1);


        System.out.println(queue.peek());  // gets the first item but not removes it

        System.out.println(queue.remove());  // removes the item and return it
        System.out.println(queue.remove());


        // Deque : it is also a interface
        // in Deque we can add and remove from both sides

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(67);
        deque.addLast(90);
        deque.addFirst(2);
        // etc etc...

    }
}