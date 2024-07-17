package Number;

public class Palidrome {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("palidrome");
        } else {
            System.out.println("not palidrome");
        }
    }

}
