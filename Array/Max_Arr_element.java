package Array;

public class Max_Arr_element {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 6, 8, 9 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
