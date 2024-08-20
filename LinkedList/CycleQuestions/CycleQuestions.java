package LinkedList.CycleQuestions;

public class CycleQuestions {
    // QUESTION 3
    // linked list cycle (check if present or not)


    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow =  slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;

    }

    // find length of cycle
    public int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow =  slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp =  slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp !=  slow);
                return length;
            }

        }
        return 0;

    }

    // return the node from where the cycle starts
    // step 1 : find the length of cycle
    // step 2 : move slow by length of cycle times
    // step 3 :  move slow and fast one by one and it will meet at start

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow =  slow.next;
            if (fast == slow) {
                length = LengthCycle(slow);
                break;
            }

        }
        if (length == 0) {
            return null;
        }
        // find the start node of cycle
        ListNode s = head;
        ListNode f =  head;

        while (length > 0) {
            s = s.next;
            length--;
        }
        // keep moving them one by one and they will meet at cycle start
        while (s != f) {
            s = s.next;
            f = f.next;

        }
        return s;
    }

    // Google question
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findsquare(n);
            fast =  findsquare(findsquare(n));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findsquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem ;
            number = number/10;
        }
        return ans;
    }


}

class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
}