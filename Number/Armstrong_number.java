package Number;

public class Armstrong_number {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int i = 0;
        while (n > 0) {
            int r = n % 10;
            i = i + (r * r * r);
            n = n / 10;
        }
        if (temp == i) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}