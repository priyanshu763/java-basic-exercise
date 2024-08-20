package Strings;

public class String1 {
    public static void main(String[] args){
        String name = "kunal kushwaha";
        System.out.println(name);

        // Strings are immuatable (value of the object cannot be modified)
        // but you can create a new object

        String a = "kunal";   //after creating a new object this value "kunal" moved in garbage collection
        System.out.println(a);
        a = "kushwaha";  // created a new object
        System.out.println(a);



    }

}
