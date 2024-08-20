package Recursion;

// RECURSION: function that calls itself
// base condition in recursion : condition where one recursive function will stop making new calls

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a program that prints the numbers from 1 to 5 with a single function
        int n = 1;
        print(n);

    }

    static void print(int n) {
        if (n==5) {       // BASE CONDITION
            System.out.println(5);
            return;   // exit point
        }
        System.out.println(n);
        // if you are calling a function again and again, you can treat as a separate call on the stack(take a separate memory for each call).
        // therefore if base condition is not provided it will error if the memory of the computer execeeds the limits.
        print(n+1);
    }


}

//WHY RECURSION?
// 1. it helps us in solving bigger/complex problems in a simple way.
// 2. you can convert recursion solution into iteration and vice versa.
// 3. space complexity is not constant because of recursive calls.
