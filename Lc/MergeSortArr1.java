import java.util.*;

public class MergeSortArr1 {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0, 0, 0}; 
        int m = 6;
        int[] nums2 = {1,2,2};
        int n = 3;
        System.out.println(Arrays.toString(Merge(nums1,m,nums2,n)));
    }
    public static int[] Merge(int[] nums1, int m, int[] nums2, int n){
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] == 0 && i>=(m-n)){
                for(int j=0; j<nums2.length; j++){
                   nums1[i] = nums2[j];
                   i++;
                }
            }
        }
        Arrays.sort(nums1);
        return nums1;
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