class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max=0;
        for(int i:nums){
            max = max < i ? i : max ;   
        }
        
        int start=0;
        long maxfreq=0,ans=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==max){
                maxfreq++;
            }
            while(maxfreq==k){
               if(nums[start]==max){
                   maxfreq--;
               } 
                start++;
            }
            ans+=start;
        }
        return ans;   
    }
}