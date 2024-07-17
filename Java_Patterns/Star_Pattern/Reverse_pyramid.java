public class Reverse_pyramid {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (n - i - 1) * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
