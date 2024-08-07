class Solution {
    
    
    public void generate(int i,int[] nums, ArrayList<Integer> list, HashSet<ArrayList<Integer>> set){
        if(i>=nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[i]);
        generate(i+1,nums,list,set);
        list.remove(list.size()-1);
        generate(i+1,nums,list,set);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        
        generate(0,nums,list,set);
        
        return new ArrayList<>(set);
    }
}