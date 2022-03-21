package ReverseString;

public class Solution {

    public static void main(String[] args) {
        reverseString(new char[]{'H','a','n','n','a','h'});
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i = i + 1;
            j = j - 1;
        }
    }

}
