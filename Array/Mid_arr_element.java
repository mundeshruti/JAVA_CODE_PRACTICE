package Array;

public class Mid_arr_element {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 8 };
        int mid = a.length / 2;

        if (a.length % 2 != 0) {
            System.out.println(a[mid]);
        } else {
            System.out.println(a[mid] + " and " + a[mid - 1]);
        }

    }

}
