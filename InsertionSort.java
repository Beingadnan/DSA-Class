import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={5,2,8,9,10,19,90,2,11,12};
        for(int i=1;i<arr.length;i++){
            int ele=arr[i];
            int check=i-1;
            while(check>=0 && ele<arr[check]){
                arr[check+1]=arr[check];
                check--;
            }
            arr[check+1]=ele;
        }
        System.out.println(Arrays.toString(arr));
    }
}
