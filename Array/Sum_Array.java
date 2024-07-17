package Array;

public class Sum_Array {
    public static void main(String[] args) {
        int sum = 0;
        int a[] = { 1, 2, 3 };
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        System.out.println(sum);
    }
}
