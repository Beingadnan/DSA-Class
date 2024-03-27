import java.util.*;
class Leetcode {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer>stc=new Stack<>();
       for(int i:nums2){
           while(!stc.isEmpty() && stc.peek()<i){
               map.put(stc.pop(),i);
           }
           stc.push(i);
       }
       for(int i=0;i<nums1.length;i++){
           arr[i]=map.getOrDefault(nums1[i],-1);
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2},nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

    }
}