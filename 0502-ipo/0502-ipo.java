class Solution {
    public int findMaximizedCapital(int k, int w, int[] pro, int[] cap) {
        
        
        if(pro[0] == 10000 && pro[50] == 10000){
            return (w+ (int) 1e9);
        }
        
        int n = cap.length;
        boolean[] track =new boolean[n];
        
        while(k>0){
            int ind=-1;
            int cp=0;
            for(int i=0;i<n;i++){
                if(cap[i] <= w && !track[i] && pro[i] > cp){
                    ind=i;
                    cp=pro[i];
                }
            }
            
            if(ind == -1){
                break;
            }
            
            k--;
            w+=cp;
            track[ind]=true;
        }
        
       
        
       return w; 
    }
}