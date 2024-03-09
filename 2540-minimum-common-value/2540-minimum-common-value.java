class Solution {
    
    public boolean search(int x,int[] nums2){
        int s=0;
        int e=nums2.length-1;
        
        while(s<=e){
            int mid=(s+e)/2;
            if(x==nums2[mid]){
                return true;
            }
            else if(x>nums2[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        int res=-1;
        for(int n:nums1){
            if(search(n,nums2)){
                res=n;
                break;
            }
        }
        return res;
    }
}