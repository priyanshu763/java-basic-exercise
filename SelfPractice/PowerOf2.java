package SelfPractice;

public class PowerOf2 {
    public static void main(String[] args) {
        int N = 98;
        System.out.println(powerOf2(N));

    }

    static boolean powerOf2(int N) {
        int n = 0;
        while (Math.pow(2,n) != N){
            if (Math.pow(2,n) > N) {
                return false;
            }
            n++;
        }
        return true;

    }
}
