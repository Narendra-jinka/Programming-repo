class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> q=new ArrayList<>();
        for(int i:nums){
            if(i>=0){
                p.add(i);
            }
            else{
                q.add(i);
            }
        }
        int i=0,j=0,k=0;
        while(i<p.size() && j<q.size()){
            nums[k]=p.get(i);
            k++;i++;
            nums[k]=q.get(j);
            k++;j++;
        }
        while(i<p.size()){
            nums[k]=p.get(i);
            k++;i++;
        }
        while(i<q.size()){
            nums[k]=q.get(j);
            k++;j++;
        }
        
        return nums;
        
        
        
        
    }
}