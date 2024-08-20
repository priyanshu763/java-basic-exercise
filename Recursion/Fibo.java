package Recursion;

// fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
// fino(n) = fibo(n-1) + fibo(n-2) => recurrence relation

public class Fibo {
    public static void main(String[] args)  {
        // int ans = fibo(5);
        //  System.out.println(ans);
        for (int i=0; i< 11; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(50));

    }

    static int fibo(int n) {
        if (n<2) {   // base condition
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }


    static int fiboFormula(int n)  {
        //return (int)((Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n))/ Math.sqrt(5));
        return (int)(Math.pow(((1 + Math.sqrt(5))/2), n)/ Math.sqrt(5));  //removing less dominating term
    }
}

// HOW TO UNDERSTAND AND APPROACH A PROBLEM

// identify if you can break down pronlem into smaller problems
//write the recurrence relation if needed
// draw the recursive tree
// first left tree oprations are executed then right tree operation occurs
