import java.util.*;

class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        for (int num : nums1) {
            for (int divisor = 1; divisor * divisor <= num; divisor++) {
                if (num % divisor == 0) {
                    int pair1 = divisor;
                    int pair2 = num / divisor;

                    
                    if (pair1 % k == 0 && map.containsKey(pair1 / k)) {
                        ans += map.get(pair1 / k);
                    }
                    if (pair2 != pair1 && pair2 % k == 0 && map.containsKey(pair2 / k)) {
                        ans += map.get(pair2 / k);
                    }
                }
            }
        }

        return ans;
    }
}
