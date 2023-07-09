import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            
        }

        return new int[] { 1, 2 };
    }
    public static void main(String[] args) {
        Solution su = new Solution();
        int[] nums = new int[] { 2,7,11,15 };
        int target = 9;
        int[] ret = su.twoSum(nums, target);
        System.out.println("twoSum: " + Arrays.toString(ret));
    }
}
