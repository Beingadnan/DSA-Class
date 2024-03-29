import java.util.Arrays;

/**
 * Revison
 */
public class Revison {

    public static void main(String[] args) {
        int []arr={13,12,1,10,5};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}