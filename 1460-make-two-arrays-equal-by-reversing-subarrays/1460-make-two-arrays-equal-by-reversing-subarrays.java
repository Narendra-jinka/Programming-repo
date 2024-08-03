class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count=new int[1001];
        for(int i:arr){
            count[i]++;
        }
        
        for(int i:target){
            count[i]--;
        }
        
        for(int i=0;i<1001;i++){
            if(count[i]!=0) return false;
        }
        
        return true;
    }
}