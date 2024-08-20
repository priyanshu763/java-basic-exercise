package PatternQuestions;

//procedure to apprach
// 1. number of rows = number of times outer for loop will run
// 2. identify for every row => number of columns it have ,types of elements in column
// 3. what do you need to print
// 4. try to find the formula relating column nad rows

// pattern1
/* *
 **
 *
 ** */
public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        pattern1(n);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();  //move to new line

        }

    }



}
