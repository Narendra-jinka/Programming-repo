class Solution {
    public int minIncrementForUnique(int[] nums) {
     
       /* Arrays.sort(nums);
        int count=0;
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i:nums){
            set.add(i);
        }
       
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
               int cur=nums[i];
                while(set.contains(cur)){
                    count++;
                    cur++;
                }
                
                set.add(cur);
            }
            
        }
        
        return count;
        */
        
        
        
        int c=0;
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int newval=nums[i-1]+1;
                c+=(newval - nums[i]);
                nums[i]=newval;
                
            }
        }
        return c;
    }
}