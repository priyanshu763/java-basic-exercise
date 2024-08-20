package Strings;

// find the string is palindrome or not
//palindrome : same from both sides (original and reverse order)
//eg. : 121 , abcba ,adghgda
public class palin {
    public static void main(String[] args)  {
        // String str = "abcba";
        //String str  = "121";
        //String str = " ";
        String str = null;
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str)  {
        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for(int i = 0; i<= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end){
                return false;
            }


        }
        return true;

    }
}
