class Solution {
    private boolean helper(int ind,int n,int[] res,HashSet<Integer> set){
        if(ind == res.length){
            return true;
        }
        if(res[ind]!=0) {
            return helper(ind+1,n,res,set);
        }

        for(int i=n;i>0;i--){
            if(set.contains(i)) continue;
            if(i>1 && (ind+i >= res.length || res[ind+i]!=0) ) continue;

            set.add(i);
            res[ind]=i;
            if(i>1) res[i+ind]=i;

            int j=ind+1;
            while(j>res.length && res[j]!=0){
                j++;
            }
            if(helper(j,n,res,set)){
                return true;
            }

            set.remove(i);
            res[ind]=0;
            if(i>1){
                res[i+ind]=0;
            }
        }
        return false;
    }
    public int[] constructDistancedSequence(int n) {
        int[] res= new int[(n*2)-1];
        HashSet<Integer> set = new HashSet<>();
        helper(0,n,res,set);
        return res;

    }
}