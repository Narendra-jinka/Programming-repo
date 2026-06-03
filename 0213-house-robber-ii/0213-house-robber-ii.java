class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int p1 = nums[0];
        int p2=0;
        for(int i=1;i<n-1;i++){
            int cur = Math.max(nums[i]+p2,p1);
            p2 = p1;
            p1=cur;
        }

        int n1 = nums[1];
        int n2 = 0;

        for(int i=2;i<n;i++){
            int cur = Math.max(nums[i]+n2,n1);
            n2 = n1;
            n1 = cur;
        }

        return Math.max(p1,n1);
    }
}