// How many are Repeated 
// Which are Repeated
// In which Place

import java.util.HashMap;

public class PractiseHashMap {
    public static void main(String[] args) {
        int[]arr={1,2,2,4,6,6,7,9,9,10};
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>map1=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count++;
                map1.put(arr[i],1);
                
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(count);
        System.out.println(map1.keySet());

    }
}
