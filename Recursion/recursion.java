package Recursion;

//IMPORTANT POINTS ABOUT THE RECURSION
// 1. while the function is not finished executing, it will remain in stack
// 2. when a function finishes executing it is removred from stack and the flow of program is restored where it was called.

public class recursion {
    public static void main(String[] args)  {
        // write a fuction that prints hello world 5 times with only  a single call of function
        message();
    }

    static void message() {
        System.out.println(" Hello world");
        message1();
    }

    static void message1() {
        System.out.println(" Hello world");
        message2();
    }

    static void message2() {
        System.out.println(" Hello world");
        message3();
    }

    static void message3() {
        System.out.println(" Hello world");
        message4();
    }

    static void message4() {
        System.out.println(" Hello world");

    }


}
