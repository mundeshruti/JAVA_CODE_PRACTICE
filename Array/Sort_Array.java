package Array;

public class Sort_Array {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 7, 8, 9, 0 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);

        }
    }

}
