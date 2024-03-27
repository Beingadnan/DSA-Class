import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionLeetcode {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ans = new int[n / 3][];
        for (int i = 0; i < n; i += 3) {
            int[] t = Arrays.copyOfRange(nums, i, i + 3);
            if (t[2] - t[0] > k) {
                return new int[][] {};
            }
            ans[i / 3] = t;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[]arr={1,3,4,8,7,9,3,5,1};
        int k=2;
        int arr1[][]= divideArray(arr, k);
        for (int[] subArray : arr1) {
            System.out.println(Arrays.toString(subArray));
        }
    }
}
