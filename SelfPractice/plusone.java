package SelfPractice;

public class plusone {
    public static void main(String[] args) {
        String str = "hdsgdhgxhgVGGHGFFH";
        System.out.println(str.toCharArray());
        System.out.println(str);


    }

    public int[] plusOne(int[] digits) {  // very important
        int n = digits.length;
        for (int i =n-1; i>=0; i--) {
            if ( digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;

        }
        if (digits[0] == 0) {
            int[] newinteger = new int[n+1];
            newinteger[0] = 1;
            return newinteger;


        }

        return digits;




    }
}
