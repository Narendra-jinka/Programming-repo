class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;

       /*Arrays.sort(nums);
       int i=0;
       for(;i<n;i++){
           if(nums[i]!=i){
               return i;
           }
       } 
       return i;*/

       /*HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
           map.put(i,1);

       }
       int j=0;
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getKey() !=j){
               return j;
           }
           else{
               ++j;
           }
       }
       return j;*/
       int sum1=(n*(n+1))/2;
       int sum2=0;
       for(int i:nums){
           sum2+=i;
       }
       return sum1-sum2;
    }
}