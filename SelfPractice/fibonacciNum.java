package SelfPractice;

// fibo series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

public class fibonacciNum {
    public static void main(String[] args) {
        System.out.println(fibo(7));

    }

    static int fibo(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
