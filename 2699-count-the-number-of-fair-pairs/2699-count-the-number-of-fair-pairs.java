import java.util.Arrays;

class Solution {

    // Helper method to count pairs where nums[j] is in range
    int countInRange(int[] nums, int ind, int minVal, int maxVal) {
        int left = ind + 1;
        int right = nums.length - 1;
        
        // Find left bound where nums[j] >= minVal
        int start = left;
        while (start <= right) {
            int mid = start + (right - start) / 2;
            if (nums[mid] >= minVal) {
                right = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        // Find right bound where nums[j] <= maxVal
        int end = left;
        right = nums.length - 1;
        while (end <= right) {
            int mid = end + (right - end) / 2;
            if (nums[mid] <= maxVal) {
                end = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Return count of elements within the range [minVal, maxVal]
        return end - start;
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;

        // For each nums[i], find pairs with nums[j] in range [lower - nums[i], upper - nums[i]]
        for (int i = 0; i < nums.length; i++) {
            res += countInRange(nums, i, lower - nums[i], upper - nums[i]);
        }
        
        return res;
    }
}
