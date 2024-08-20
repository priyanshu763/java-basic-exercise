package SelfPractice;

public class MaximumPopulation {
    public static void main(String[] args) {

    }


    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int maxyear = 1950;
        int maxval = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
                maxyear = i + 1950;
            }
        }

        return maxyear;


    }

    // optimized approach

    public int MaximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {

            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;

        }

        for (int i = 1; i < 101; i++) { // running sum of array
            arr[i] += arr[i - 1];
        }
        int maxyear = 1950;
        int maxval = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
                maxyear = i + 1950;
            }
        }

        return maxyear;


    }
}
