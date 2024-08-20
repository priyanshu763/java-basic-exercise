package SelfPractice;

public class diagonalsum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6} ,{7,8,9}};
        System.out.println(diagonalSum(mat));
        System.out.println(mat[2][mat[2].length-2-1]);

    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }

                sum += mat[i][mat[i].length-i-1];

            }
        }
        return sum;

    }
}
