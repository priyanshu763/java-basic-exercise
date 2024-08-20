package LinkedList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        //LinkedList<Integer> list = new LinkedList<>();
        LL list = new LL();
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(1);
        list.insertFirst(45);
        list.insertlast(56);
        list.insertlast(99);
        list.insertlast(89);
        // list.insert(100,3);


        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        // list.insertRec(88,2);
        list.display();

        // note : node.next = something (making change in object) => wrong
        // note : node = node.next (doesn't making change in object) => correct

        // note : in single sided linked list ; tail is pointing forward to null
        // note : in doubly linked list ; head is pointing backward to null and tail is pointing forward to null


        // DOUBLY lINKED LIST
    /*    DLL list = new DLL();
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertLast(90);
        list.insert(9,78);

        list.display();    */

        // CIRCULAR LINKED LIST
        // each element is pointing to next element (no backwards)
        // it has head and tail and none of them is pointing to null until list has only one element
        // if head is null => only one element exists then head = tail = node itself

     /*   CLL list = new CLL();
        list.insert(34);
        list.insert(43);
        list.insert(88);
        list.insert(23);
        list.insert(89);
        list.insert(100);


        list.display();
        list.delete(43);
        list.display();   */











    }
}
