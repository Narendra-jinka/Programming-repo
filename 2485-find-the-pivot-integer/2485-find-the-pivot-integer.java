class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int left=0;
        
        for(int i=1;i<=n;i++){
            
            left+=i;
            if(left==sum){
                return i;
            }
            sum-=i;
        }
        return -1;
    }
}