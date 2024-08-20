package OOPs.cloning;

import java.util.Arrays;

public class main {
    public static void  main (String [] args) throws CloneNotSupportedException  {
        human kunal = new human(34, "kunal kushwaha");
        //  human twin  = new human(kunal);

        human twin = (human)kunal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 120;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));


    }

}
