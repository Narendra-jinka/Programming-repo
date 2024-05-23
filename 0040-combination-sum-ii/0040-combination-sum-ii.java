class Solution {
    
    
    private void find(int ind,int[] arr,int target,HashSet<List<Integer>> set,ArrayList<Integer> ds){
        if(ind==arr.length|| target <0){
            
            if(target == 0){
                
                set.add(new ArrayList<>(ds));
            } 
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            find(ind+1,arr,target-arr[ind],set,ds);
            ds.remove(ds.size()-1);
        }
        int temp=arr[ind];
        int i=1;
        while (ind + i < arr.length && arr[ind + i] == temp) {
            i++; // Skip duplicates
        }
        find(ind+i,arr,target,set,ds);
        
    }
    
    
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(arr);
        find(0,arr,target,set,new ArrayList<>());
        return new ArrayList<>(set);
    }
}