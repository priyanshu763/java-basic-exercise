package Heaps;

import java.util.ArrayList;

public class main {
    public static void main(String[] args)  throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(66);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList list = heap.heapsort();
        System.out.println(list);





    }
}
