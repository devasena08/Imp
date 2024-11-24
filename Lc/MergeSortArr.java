import java.util.*;

public class MergeSortArr {
    public static void main(String[] args) {
        int[] nums1 = {0}; 
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        System.out.println(Arrays.toString(Merge(nums1,m,nums2,n)));
    }
    public static int[] Merge(int[] nums1, int m, int[] nums2, int n){
        int[] arr = new int[n+m];
        int index=0;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] != 0){
                arr[index] = nums1[i];
                index++;
            }else{
                
            }
        }

        for(int i=0; i<nums2.length; i++){
            if(nums2[i] != 0){
                arr[index] = nums2[i];
                index++;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
/*
 * Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]

Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
 */