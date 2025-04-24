class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int k=set.size();
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int left=0,right=0,ans=0;
        while(left <= right && right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()==k){
                ans+= n-right;
                map.put(nums[left], map.get(nums[left]) - 1);
if (map.get(nums[left]) == 0) {
    map.remove(nums[left]);
}
left++;
            }
            right++;
        }
        return ans;
    }
}