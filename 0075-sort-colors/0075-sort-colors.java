class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=0;
        for(int a:nums){
            if(a==0) z++;
            if(a==1) o++;
            if(a==2) t++;
        }

        int i=0;
        while(z>0){
            nums[i]=0;
            z--;i++;
        }
        while(o>0){
            nums[i]=1;
            i++;o--;
        }
        while(t>0){
            nums[i]=2;
            i++;t--;
        }
    }
}