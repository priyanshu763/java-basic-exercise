package MathsDSA;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;  // find 6th magic number

        int ans =0;
        int base = 5;
        while (n>0) {
            int last = n & 1;
            n = n>>1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
//how many times loop is runing => number of digits the binary representation of 6 have i.e. 3.

// time complexity = log(n)
