import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1); // There's one way to have a prefix sum with remainder 0 (the empty prefix)
        
        int count = 0;
        int prefixSum = 0;
        
        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            
            // Adjust for negative remainders
            if (remainder < 0) {
                remainder += k;
            }
            
            // If the remainder has been seen before, it means there's a subarray ending here which sums to a multiple of k
            count += remainderCount.getOrDefault(remainder, 0);
            
            // Update the count of this remainder in the map
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}
