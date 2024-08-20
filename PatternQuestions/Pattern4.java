package PatternQuestions;

//Pattern4 (for n = 5)
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

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        pattern1(n);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > n ? 2*n - row: row;
            // for every row, run the col
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();  //move to new line

        }



    }
}
