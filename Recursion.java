import java.util.Arrays;

/**
 * Recursion
 */
public class Recursion {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 1, 2, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}