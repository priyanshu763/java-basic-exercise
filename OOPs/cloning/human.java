package OOPs.cloning;

public class human implements Cloneable{
    int age;
    String name;

    int[] arr;

    public human(int age,String name) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{3, 4, 5, 6, 7, 8, 9, 11};
    }

    public human(human other) {
        this.age = other.age;
        this.name = other.name;
    }

   /* @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }  */

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        human twin = (human)super.clone() ;  // this is actually shallow copy

        //  make a deep copy

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }


}