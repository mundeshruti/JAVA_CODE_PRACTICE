package Array;

public class Even_Odd_Element {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");
            } else if (a[i] % 2 != 0) {
                System.out.println(a[i] + " is odd");
            }
        }
    }

}
