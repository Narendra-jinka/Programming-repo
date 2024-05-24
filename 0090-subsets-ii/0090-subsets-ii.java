class Solution {
    
    private void find(int ind,int[] nums,HashSet<List<Integer>> set,ArrayList<Integer> ds){
        if(ind==nums.length){
            set.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[ind]);
        find(ind+1,nums,set,ds);
        ds.remove(ds.size()-1);
        find(ind+1,nums,set,ds);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        find(0,nums,set,new ArrayList<>());
        return new ArrayList<>(set);
    }
}