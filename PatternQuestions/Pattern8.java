package PatternQuestions;

//pattern8
/*
     4 4 4 4 4 4 4
     4 3 3 3 3 3 4
     4 3 2 2 2 3 4
     4 3 2 1 2 3 4
     4 3 2 2 2 3 4
     4 3 3 3 3 3 4
     4 4 4 4 4 4 4
 */
public class Pattern8 {
    public static void main(String[] args) {
        int n = 4;
        pattern8(n);
    }

    static void pattern8(int n) {
        int originalN = n;
        n= 2*n;


        for (int row = 0; row <=n; row++) {
            // for every row, run the col
            for (int col = 0; col <=n; col++) {
                int atEveryIndex= originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col)) ;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();  //move to new line

        }

    }


}