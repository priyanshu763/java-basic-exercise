package Strings;

public class Performance {
    public static void main(String args[]) {
        String series = "";
        for (int i = 0; i<26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            series = series + ch;   // problem : memory wastage , solution : use string builder
        }

        System.out.println(series);  //(abcdefghijklmnopqrstuvwxyz)
    }
}