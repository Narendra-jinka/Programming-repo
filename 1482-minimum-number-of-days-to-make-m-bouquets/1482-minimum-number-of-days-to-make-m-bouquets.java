class Solution {
    
    private int helper(int[] bloomDay, int mid, int k){
        int count=0;
        int noOfBq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <=mid){
                count ++ ;
            }
            else {
                count =0;
            }
            
            if(count == k){
                noOfBq ++ ;
                count =0;
            }
        }
        
        return noOfBq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
       
        
        int s=0;
         
        int e=0;
        
        int ans=-1;
        
        for(int i:bloomDay) {
            e=Math.max(e,i);
        }
        
        
        //binary search algo 
        
        while(s <= e){
            int mid=(s+e)/2;
            
            if(helper(bloomDay,mid,k) >=m) {
                ans = mid;
                e = mid -1;
            }
            else{
                s = mid +1;
            }
        }
        return ans;
    }
}