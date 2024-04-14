class Solution {
    public boolean isPrime(int num){
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count!=1){
            return false;
        }
        else{
            return true;
        }
    }
    public int maximumPrimeDifference(int[] nums) {
        int low=-1;
        int high=-1;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i]) && low ==-1){                
                    low=i;
            }
            else if(isPrime(nums[i])){
                high=i;
            }
        }
        if(high==-1){
            return 0;
        }
        else{
            return Math.abs(high-low);
        }
    }
}