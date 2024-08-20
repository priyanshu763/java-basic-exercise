package OOPs;

public class FinalKeyword {
    public static void main(String[] args) {


        final A kunal = new A("kunal kushwaha");
        kunal.name = "other name";  // valid

        // when a non primitie is final, you cannot reassign it.
//        kunal = new A("new object"); //Invalid

    }
}


class A {
    final int num = 10;  // always initialise
    String name;

    public A(String name) {
        this.name = name;
    }
}
