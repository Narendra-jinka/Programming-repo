class Solution {
    public long countBadPairs(int[] nums) {
        
        // ====** BRUTE FORCE **====
        // long res=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]-i != nums[j]-j) res++;
        //     }
        // }
        // return res;

        int n=nums.length;
        long goodPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int cal = i-nums[i];
            if(map.containsKey(cal)){
                goodPairs+=map.get(cal);
            }
            map.put(cal,map.getOrDefault(cal,0)+1);
        }

        long res = ((long)n * (n - 1) / 2) - goodPairs;
        return res;
    }
}