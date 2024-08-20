package RecursionQ;

public class RevNum {
    public static void main(String[] arg) {
        revnum(1654);
        //System.out.println(sum );
        //System.out.println(rev2(1289));
        System.out.println(palin(252));


    }
    static int sum = 0;
    static void revnum(int n) {
        if (n == 0){
            return;
        }
        int rem = n%10;
        sum =  sum *10  + rem;
        revnum(n/10);
    }

    // OR

    static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1; //return number of digits
        return helper(n,digits);
    }
    private static int helper(int n , int digits){
        if ( n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

    static boolean palin(int n){
        return n == rev2 (n);
    }
}
