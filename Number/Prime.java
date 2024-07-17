package Number;

public class Prime {
    public static void main(String[] args) {
        int n = 20;
        int flag = 0;
        int m = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.err.println("not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("prime");
            }
        }

    }
}