import java.util.Arrays;

public class Zoho2 {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        System.out.println(Arrays.toString(zoho(nums)));
        
        
    }
    
    public static int[] zoho(int[] nums) {
        int[] temp = new int[101];
        
        // Count occurrences of each number
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] += 1;
        }
        
        // Accumulate counts
        for (int j = 1; j < 100; j++) {
            temp[j] += temp[j - 1];
        }
        
        // Modify nums based on temp
        for (int k = 0; k < nums.length; k++) {
            int pos = nums[k];
            nums[k] = pos == 0 ? 0 : temp[pos - 1];
        }
        
        return nums;
    }
}
