package MathsDSA;

public class EvenOdd {
    public static void main(String[] args) {
        int n= 679;
        System.out.println(isOdd(n));

    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}

//OPERATORS
// 1. AND OPERATOR
// 2. OR OPERATOR
// 3. XOR OPERATOR - if only one is true and it gives true
// a XOR with 1 = complement of a
//a XOR with 0 = a itself
//a XOR with a = 0
