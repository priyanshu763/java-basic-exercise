package OOPs.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import java.util.Vector;


public class main {
    public static void main(String[] args)
    {
        List<Integer> List = new ArrayList<>();
        List<Integer> List2 = new LinkedList<>();

        List2.add(34);
        List2.add(78);
        List2.add(49);
        List2.add(65);

        System.out.println(List2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(47);
        vector.add(49);
        vector.add(56);
        System.out.println(vector);

        // ArrayLists are more faster than vectors in java
        // multiple threads can act on a ArrayList at a time while in case od vectors only one thread can act on a vector at a time
        // meanwhile remaining threads are waiting






    }
}