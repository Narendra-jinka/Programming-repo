class Solution {
    /*public int minPatches(int[] nums, int n) {
        
        int miss=1;
        int p=0;
        
        int i=0;
        
        while(miss <= n){
            if(i < nums.length && nums[i] <=miss){
                miss+=nums[i];
                i++;
            }
            else{
                miss+=miss;
                p++;
            }
        }
        return p;
    }*/
    
    
  
    public int minPatches(int[] nums, int n) {
        int i = 0 ;
        long j = 1;
        
        int ans = 0;
        
        while(j <= n){
            if(i < nums.length && nums[i] <= j){
                j += nums[i++];
            }
            else{
                j += j;
                ans++;
            }
        }
        return ans;
    }
}
