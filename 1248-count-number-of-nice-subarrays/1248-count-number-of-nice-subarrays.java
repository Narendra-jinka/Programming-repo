class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int[] countArr=new int[nums.length+1];
        int ans=0;
        int oddCount=0;
        
        
        countArr[0]=1 ;// bcz here if the oddCount-k =0 that means we encounted a subarry with exact k odds 
            
        for(int n:nums){
            if ( n % 2 != 0) oddCount++;
            
            if(oddCount - k >= 0){
                ans += countArr[oddCount - k];
            }
            
            countArr[oddCount]++;
            
        }
        return ans;
    }
}



