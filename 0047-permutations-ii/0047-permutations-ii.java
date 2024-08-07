class Solution {
    
    public void generate(int[] nums,List<Integer> list, HashSet<List<Integer>> set, boolean[] st){
        if(list.size()==nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        
        
        for(int i=0;i<nums.length;i++){
            if(!st[i]){
                st[i]=true;
                list.add(nums[i]);
                generate(nums,list,set,st);
                list.remove(list.size()-1);
                st[i]=false;
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        
        List<Integer> list=new ArrayList<>();
        boolean[] st=new boolean[nums.length];
        generate(nums,list,set,st);
        
        return new ArrayList<>(set);
    }
}