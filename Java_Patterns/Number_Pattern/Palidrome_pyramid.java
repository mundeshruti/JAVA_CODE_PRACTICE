package Number_Pattern;

public class Palidrome_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
