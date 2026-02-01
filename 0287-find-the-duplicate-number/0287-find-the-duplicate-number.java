class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length-1;
        // int sum_n = (n*(n+1))/2;
        // int nums_sum = 0 ; 
        // for(int i : nums) nums_sum+=i;

        // return nums_sum-sum_n;

        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }
}