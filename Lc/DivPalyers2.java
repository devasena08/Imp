import java.util.*;

public class DivPalyers2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt(); // 6
        int[] arr = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();//3 2 5 1 3 4
        }
        read.close();
        int result = Sol(arr, t);
        System.out.println(result);
    }

    public static int Sol(int[] arr, int n) {
        Arrays.sort(arr); // 1 2 3 3 4 5
        if (n % 2 != 0) {
            return -1;
        }
        int targetSum = arr[0] + arr[n - 1]; //0+6 =6
        int chemistrySum = 0;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] + arr[n - 1 - i] != targetSum) { // 0+(6-1-0)=5
                return -1;
            }
            chemistrySum += arr[i] * arr[n - 1 - i];
        }
        return chemistrySum;
    }
}
/* 
Example 1:

Input: skill = [3,2,5,1,3,4]
Output: 22
Explanation: 
Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6.
The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.
Example 2:

Input: skill = [3,4]
Output: 12
Explanation: 
The two players form a team with a total skill of 7.
The chemistry of the team is 3 * 4 = 12.
Example 3:

Input: skill = [1,1,2,3]
Output: -1
Explanation: 
There is no way to divide the players into teams such that the total skill of each team is equal.
 */

