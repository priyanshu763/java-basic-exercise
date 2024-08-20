package Strings;

public class checkifpangramString {
    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a'] = true;   // this makes every letter's index true
        }

        for (boolean curr : arr) {
            if (curr == false) {
                return false;
            }
        }

        return true;

    }
}
