package Number_Pattern;

public class Number_triangle {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.err.println();
        }
    }

}
