class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (right > 0 && nums[right] == nums[right - 1]) {
                left = right;
            }
            count += right - left + 1;
        }
        return count;
    }
}