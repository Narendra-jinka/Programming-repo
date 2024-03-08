class Solution {
    public int maxFrequencyElements(int[] nums) {
       /* HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : mp.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : mp.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;*/
        
        int[] count=new int[101];
        int max=0;
        for(int n:nums){
            count[n]++;
            max=Math.max(max,count[n]);
        }
        int ans=0;
        for(int c:count){
            if(c==max){
                ans+=c;
            }
        }
        return ans;
        
    }
}