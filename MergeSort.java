import java.util.Arrays;

public class MergeSort {
    public static void Conquer(int[] arr, int sti, int mid, int edi) {
        int f = sti;
        int s = mid + 1;
        int[] merge = new int[edi - sti + 1];
        int i = 0;
        while (f <= mid && s <= edi) {
            if (arr[f] <= arr[s]) {
                merge[i] = arr[f];
                i++;
                f++;
            } else {
                merge[i] = arr[s];
                i++;
                s++;
            }
        }
        while (f <= mid) {
            merge[i] = arr[f];
            i++;
            f++;
        }
        while (s <= edi) {
            merge[i] = arr[s];
            i++;
            s++;
        }
        int j = sti;
        for (int val : merge) {
            arr[j] = val;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void BreakDown(int[] arr, int sti, int edi) {
        if (sti >= edi) {
            return;
        }
        int mid = sti + (edi - sti) / 2;
        BreakDown(arr, sti, mid);
        BreakDown(arr, mid + 1, edi);
        Conquer(arr, sti, mid, edi);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int sti = 0;
        int edi = arr.length - 1;
        BreakDown(arr, sti, edi);
        System.out.println(Arrays.toString(arr));
    }
}
