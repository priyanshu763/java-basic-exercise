package Strings;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // adding their ASCII values (195)
        System.out.println("a" + "b");  // concatinating them(ab)
        System.out.println('a' + 3);   // adding their ASCII value (100)
        System.out.println((char)('a' + 3));  //typecasting : adding ASCII values and printing character (d)
        System.out.println("a" + 1); //this same as after few steps: "a" + "1" .(a1)
        System.out.println('a' + "b"); //(ab)

        System.out.println("kunal" + new ArrayList<>());  //(kunal[])
        System.out.println("kunal" + new Integer(56));  //(kunal56)
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);  //(56[])




    }
}
