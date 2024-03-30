class Solution{
   /* public int subarraysWithKDistinct(int[] A, int K) {
        return subarraysWithAtMostKDistinct(A, K) - subarraysWithAtMostKDistinct(A, K - 1);
    }
    
    private int subarraysWithAtMostKDistinct(int[] A, int K) {
        if (K == 0) return 0;
        
        int j = 0, numGoodSubArr = 0, n = A.length;
        // Map a character to its frequency in current window.
        Map<Integer, Integer> chToFreq = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (; j < n; j++) {
                chToFreq.put(A[j], chToFreq.getOrDefault(A[j], 0) + 1);
                if (chToFreq.size() <= K) numGoodSubArr += j - i + 1; 
                else {
                    chToFreq.put(A[j], chToFreq.get(A[j]) - 1);
                    if (chToFreq.get(A[j]) == 0) chToFreq.remove(A[j]);
                    break; 
                }
            }
            chToFreq.put(A[i], chToFreq.get(A[i]) - 1);
            if (chToFreq.get(A[i]) == 0) chToFreq.remove(A[i]);
        }

        return numGoodSubArr;
    }*/
    public int subarraysWithKDistinct(int[] nums, int k) {
    int res = 0, sz = nums.length;
    int[] cnt = new int[sz + 1];
    for (int l = 0, m = 0, r = 0; r < sz; ++r) {
        if (++cnt[nums[r]] == 1)
            if (--k < 0) {
                cnt[nums[m++]] = 0;
                l = m;
            }
        if (k <= 0) {
            while (cnt[nums[m]] > 1)
                --cnt[nums[m++]];
            res += m - l + 1;   
        }
    }    
    return res;
}
}
