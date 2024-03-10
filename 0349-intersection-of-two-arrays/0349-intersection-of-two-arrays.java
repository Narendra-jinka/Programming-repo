class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums1){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        for(int i:nums2){
            if(set.contains(i) && !(res.contains(i))){
                res.add(i);
            }
        }
        nums1=new int[res.size()];
        int j=0;
        for(int i:res){
            nums1[j]=i;
            j++;
        }
        return nums1;
    }
}