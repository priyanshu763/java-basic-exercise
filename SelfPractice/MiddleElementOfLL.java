package SelfPractice;

import LinkedList.LL;
import org.w3c.dom.Node;

public class MiddleElementOfLL {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }


    private Node head;
    private Node tail;
    private int size;
    public  MiddleElementOfLL() {
        this.size = 0;
    }


    public ListNode middleNode (ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public static void main(String[] args) {

    }
}
