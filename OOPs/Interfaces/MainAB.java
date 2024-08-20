package OOPs.Interfaces;

public class MainAB implements B,A{

    @Override
    public void fun() {

    }

    @Override
    public void greet() {
        System.out.println();



    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}