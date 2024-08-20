package PatternQuestions;

//pattern5
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        pattern5(n);

    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            // for every row, run the col
            int totalColsInRow = row > n ? 2*n - row: row;
            int noofSpaces = n- totalColsInRow;
            for (int s=1;s<=noofSpaces;s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();  //move to new line

        }

    }
}