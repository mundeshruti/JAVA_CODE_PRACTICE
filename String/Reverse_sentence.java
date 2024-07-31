package String;

public class Reverse_sentence {
    public static void main(String[] args) {
        String s = "My Name is Shrutika";
        String r = "";
        String rev[] = s.split(" ");
        for (int i = 0; i < rev.length; i++) {
            r = rev[i] + " " + r;
        }
        System.out.println(r);

    }

}
