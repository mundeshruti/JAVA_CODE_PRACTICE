package String;

public class Reverse_string {
    public static void main(String[] args) {
        String s = "SHRUTIKA";
        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        System.out.println(r);

    }

}
