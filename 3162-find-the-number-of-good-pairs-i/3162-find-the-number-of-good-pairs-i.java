import java.util.*;

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums2) {
            int product = num * k;
            map.put(product, map.getOrDefault(product, 0) + 1);
        }

        for (int num : nums1) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (num % entry.getKey() == 0) {
                    ans += entry.getValue();
                }
            }
        }

        return ans;
        
        /*int ans=0;
        
        for(int i:nums1){
            for(int j:nums2){
                if(i%(j*k)==0){
                    ans++;
                }
            }
        }
        
        return ans;*/
    }
}
