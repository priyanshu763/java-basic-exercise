package SelfPractice;

public class FindingMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(missingnum(arr, 5));

    }

    static int missingnum(int[] arr, int n ) {
        int missing = 0;

        for (int i = 1; i<=n; i++){
            for (int j = 0; i<n;i++){
                if (i == arr[j]) {
                    break;
                }

                missing = i;
            }
        }

        return missing;



    }
}
