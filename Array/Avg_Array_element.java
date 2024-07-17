package Array;

public class Avg_Array_element {
    public static void main(String[] args) {
        int sum = 0;
        int a[] = { 6, 4 };
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        double Avg = sum / a.length;
        System.out.println(Avg);
    }

}
