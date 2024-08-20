package RecursionQ;

public class digitSum {
    public static void main(String[] args) {
        //System.out.println(sum(1324));
        System.out.println(product(1324));
    }

    //sum of digits
    static int sum(int n){
        if (n==0) {
            return 0;

        }
        return (n%10) + sum(n/10);
    }

    //product of digits
    static int product(int n){
        if (n%10 == n){ //if one digit is remaining then return that digit
            return n;
        }
        return (n%10) * product(n/10);
    }
}