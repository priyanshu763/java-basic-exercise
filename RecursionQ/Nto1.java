package RecursionQ;

public class Nto1 {
    public static void main(String[] args){
        fun(5);
        fun1(5);
        funrev(5);

    }

    static void fun(int n){
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        fun(n-1);
    }


    static void fun1(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funrev(int n){
        if (n==0) {
            return;
        }
        funrev(n-1);
        System.out.println(n);

    }



}
