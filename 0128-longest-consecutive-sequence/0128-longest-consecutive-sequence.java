class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i:nums){
            set.add(i);
        }

        for(int i:set){
            if(!set.contains(i-1)){
                int c = 0;
                int cur = i;
                while(set.contains(cur)){
                    c++;
                    cur++;
                }
                longest = Math.max(longest,c);
            }
        }

        return longest;
    }
}