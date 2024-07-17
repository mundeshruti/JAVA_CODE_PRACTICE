package String;

public class Palidrome_String {
    public static void main(String[] args) {
        String s = "radar";
        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        System.out.println(r);
        if (r.equals(s)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }
    }

}
