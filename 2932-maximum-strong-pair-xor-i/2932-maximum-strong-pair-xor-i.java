import java.util.Arrays;

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                int val = Math.abs(nums[start] - nums[end]);
                if (val <= Math.min(nums[start], nums[end])) {
                    max = Math.max(max, nums[start] ^ nums[end]);
                }
            }
        }
        return max;
    }
}
