import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) return false;
        
        // Create a hashmap to store the remainder of the prefix sum and its index
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // To handle the case when the subarray starts from index 0
        
        int prefixSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            
            int remainder = prefixSum % k;
            
            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}
