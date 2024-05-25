


// Time and Space optimized .........

/*class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void solve(int[] nums, int[] per, int c) {
        if (c == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : per) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (per[i] == 11) {
                per[i] = nums[c];
                solve(nums, per, c + 1);
                per[i] = 11;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int[] per = new int[n];
        for (int i = 0; i < n; i++) {
            per[i] = 11;
        }
        solve(nums, per, 0);
        return ans;
    }
}

 <--- brute Force ---------->
 
 
class Solution {
    
    private void find(int[] arr, List<List<Integer>> ans,ArrayList<Integer> ds,boolean[] freq){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
        }
        
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                find(arr,ans,ds,freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] freq=new boolean[arr.length];
        find(arr,ans,new ArrayList<>(),freq);
        
        return ans;
    }

}
*/


 // sapce optimized 
class Solution {
    
    private void find(int[] arr,int ind,List<List<Integer>> ans){
        if(ind == arr.length){
            List<Integer> ds=new ArrayList<>();
            for(int i:arr){
                ds.add(i);
            }
            ans.add(ds);
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(i,ind,arr);
            find(arr,ind+1,ans);
            swap(i,ind,arr);
        }
    }
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        find(arr,0,ans);
        
        return ans;
    }   
}

