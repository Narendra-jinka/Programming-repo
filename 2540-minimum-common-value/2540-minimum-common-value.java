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
    public int getCommon(int[] n1, int[] n2) {
        int res=-1;
        
        //binary search 
        
        /*for(int n:n1){
            if(search(n,n2)){
                res=n;
                break;
            }
        }
        return res;*/
        
        
        
        //========Apporach 2 -- 2pointers ==========
        /*int i=0;
        int j=0;
        while(i<n1.length && j<n2.length){
            if(n1[i] == n2[j]){
                res=n1[i];
                break;
            }
            else if(n1[i]>n2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return res;*/
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:n1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:n2){
            if(map.containsKey(i)){
                res=i;
                break;
            }
        }
        return res;
        
    }
}