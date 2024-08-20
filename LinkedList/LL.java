package LinkedList;


public class LL {  //LinkedList

    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }


    private static Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }


    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;

        }
        return null;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertlast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next =  node;
        node.next = null;
        tail = node;

        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertlast(val);
            return;
        }

        Node temp = head;
        for (int i =1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail =  null;
        }
        size--;
        return val;
    }

    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);

    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index--, node.next);
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size -2);  // length - 2 = index
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size -1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static int KthFromLast(int k) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        temp = head;
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }

        return temp.value;

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // GOOGLE FACEBOOK AND AMAZON QUESTIONS AND CONCEPTS

    // QUESTIONS 1

    public void duplicates() {  // removing duplicates nodes having same value of a sorted linked list
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    // QUESTION 2
    // merging two sorted linked list

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertlast(f.value);
                f = f.next;
            }else {
                ans.insertlast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertlast(f.value);
            f = f.next;

        }

        while (s != null) {
            ans.insertlast(s.value);
            s = s.next;
        }

        return ans;
    }

    // question 4
    // finding the middle element of the linked list

    public ListNode middleNode (ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    // REVERSING THE LINKED LIST VIA RECURSION
    private void reverse(Node node) {
        if (node == tail ) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev =  null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next =  prev;
            prev = present;
            present =  next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return prev;
    }

    // CHECK FOR PALINDROME LINKED LIST

    public boolean isPlaindrome(ListNode head) {
        ListNode mid = middleNode(head) ;
        ListNode headsecond = reverseList(mid);
        ListNode rereverseHead = headsecond;

        // compare the both halves
        while (head != null && headsecond != null) {
            if (head.val != headsecond.val) {
                break;

            }
            head = head.next;
            headsecond = headsecond.next;
        }
        reverseList(rereverseHead);

        if (head == null || headsecond == null) {
            return true;
        }
        return false;

    }

    // QUESTION 5
    // reordering the Linkedlist


    public void reorderList(ListNode head) {
        if (head == null && head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange

        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next =  hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    // QUESTION 6
    // roating of a linkedlist

    public Node rotateRight(Node haed, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations =  k % length;
        int skin = length - rotations;
        Node newLast = head;

        for (int i = 0 ; i < skin - 1; i++) {
            newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next =  null;

        return head;



    }


    public static void main(String[] args) {
     /*   LL first = new LL();
        LL second = new LL();

        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        LL ans = LL.merge(first, second);  // return type is LL

        ans.display();   */

        LL first = new LL();
        first.insertFirst(6);
        first.insertFirst(5);
        first.insertFirst(4);
        first.insertFirst(3);
        first.insertFirst(2);
        first.insertFirst(1);

        System.out.println(KthFromLast(4));









    }
}
