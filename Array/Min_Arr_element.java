package Array;

public class Min_Arr_element {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 0 };
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

}
