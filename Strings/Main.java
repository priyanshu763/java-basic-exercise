package Strings;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
// String buffer : mutable set of characters
// String : immutable

// Advantages of String Buffer over Strings
// 1. mutable
// 2. Efficient
// 3. thread safe (slower) : [single thread can act at a time]
// if working with multiple threads then use String builder : it is not thread safe [multiple threads can act at a time]
public class Main {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("kunal khushwaha");


        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());



        sb.append("WeMakeDevs");
        sb.append(" is nice !");

        //sb.insert(2, " rohit ");

        sb.replace(1, 5, "kunal");

        sb.delete(1, 5);

        //sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        //concept
        Random random = new Random();
        System.out.println(random.nextFloat()); // gives random float number between 0 to 1

        int n = 16;
        String name = RandomString.generate(n);
        System.out.println(name);

        // removing whiteSpaces

        String Sentence = "ghgf   h j   hjg   hj jh   uj   gj   h jh   yuj   g   n hg   hjn   bnhy   j bhbhb y";
        System.out.println(Sentence);

        System.out.println(Sentence.replaceAll("\\s", ""));

        // split concept

        String arr = "kunal apoorv rahul Snehal";
        String[] names = arr.split("");
        String[] names2 = arr.split(" ");

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));

        // rounding off
        DecimalFormat df = new DecimalFormat("000.0000");
        System.out.println(df.format(67.65));



    }
}
