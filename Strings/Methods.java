package Strings;

import java.util.Arrays;


public class Methods {
    public static void main(String[] args)  {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));  //creating an array of characters and printing it
        System.out.println(name.toLowerCase()); //creating new object of lowercase letters
        System.out.println(name); //original one will not modify
        System.out.println(name.indexOf('a')); //gives index value of character
        System.out.println("    kunal    ".strip()); //removes extra spaces
        System.out.println(Arrays.toString(name.split(" ")));
        //splits the string where it will find space(" ") and converting it into an array

    }
}
