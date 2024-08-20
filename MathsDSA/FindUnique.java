package MathsDSA;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;

        for(int n: arr) {
            unique ^= n;   //XOR all the numbers with itself and get that unique element i.e. 6.
        }                  // order of doing XOR does not matter
        return unique;
    }
}

// Q: find the ith bit of a number(n) (eg. 10110110 for getting its 5th bit(i.e. 1) , do AND with 00010000)
// soln: n & (1 << (i-1))    //n-1 => is the number of zeros on right side

//Q: set ith  bit (0=>1 , 1=>1)
// soln: n OR (1 << (i-1))

//Q: reset ith bit of a number n (1=>0, 0=>0)
//soln: n & !(1 << (i-1))
