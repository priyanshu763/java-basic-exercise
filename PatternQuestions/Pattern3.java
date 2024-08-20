package PatternQuestions;

//pattern3
/*
1
12
123
1234
12345
 */

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();  //move to new line

        }

    }
}