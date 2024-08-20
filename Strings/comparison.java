package Strings;

import java.util.Arrays;

public class comparison {
    public static void main(String[] args) {
        // comparison of strings

        java.lang.String a = "kunal";
        java.lang.String b = "kunal";

        // == checks if ref. variables are pointing to same object or not
        System.out.println(a == b);  // pointing to same object

        //creating these values outside the pool but in heap
        // name1 and name2 are not pointing to the same object

        String name1 = new String("kunal");
        String name2 = new String("kunal");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));  // checks only the values

        System.out.println(name1.charAt(0));  //gives the value of string at the passed index value

        System.out.println(Arrays.toString(new int[]{2, 3, 4 ,5}));

    }
}