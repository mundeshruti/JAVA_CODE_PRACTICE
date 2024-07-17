package String;

import java.util.Arrays;

public class Anagram_String {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        // check length
        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
        }
        // convert to character
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // sort
        Arrays.sort(c1);
        Arrays.sort(c2);

        // compare sorted
        if (Arrays.equals(c1, c2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }
}
