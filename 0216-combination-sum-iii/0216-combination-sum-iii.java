class Solution {
    
    private void find(int[] arr,int ind,int k,int n,List<List<Integer>> set,ArrayList<Integer> ds){
        if(ind >= arr.length){
           if(k==0){
                if(n==0) set.add(new ArrayList<>(ds));
                
            } 
            return;
        }
        
        if(arr[ind]<=n && k>0){
            ds.add(arr[ind]);
            find(arr,ind+1,k-1,n-arr[ind],set,ds);
            ds.remove(ds.size()-1);
            
        }
        find(arr,ind+1,k,n,set,ds);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> set =new ArrayList<>();
        find(arr,0,k,n,set,new ArrayList<>());
        return set;
    }
}