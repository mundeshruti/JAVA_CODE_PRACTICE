package Number_Pattern;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        int n = 4; // This defines the height of the top half

        // Print the top half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print descending numbers
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
