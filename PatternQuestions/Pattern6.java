package PatternQuestions;

//pattern6
/*
        1
       212
      32123
     4321234
    543212345

 */

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        pattern6(n);

    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int s=1;s<=n-row;s++) {
                System.out.print(" ");
            }
            for (int col =row; col>=1; col--) {
                System.out.print(col);
            }
            for (int col =2; col<=row; col++) {
                System.out.print(col);
            }
            System.out.println();  //move to new line

        }

    }
}
