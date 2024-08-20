package SelfPractice;

public class FindPalindrome {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome(str));

    }

    static int isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 1;
        }

        s = s.toLowerCase();
        for (int i = 0; i <= s.length()/2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if (start != end) {
                return 0;
            }
        }
        return 1;
    }
}
