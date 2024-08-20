package RecursionQ;

public class CountZeros {
    public static void main(String[] args) {
        int ans = count(304000500  );
        System.out.println(ans);
    }

    static int count(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int count){
        if (n==0) {
            return count;

        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10,count);
    }
}
