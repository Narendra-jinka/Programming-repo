class Solution {
    public int maxProfitAssignment(int[] dif, int[] pro, int[] w) {
        
        
        
        
        
        int max_prop=0;
        
        for(int i:w){
            
            int prof=0;
            
            for(int j=0;j<dif.length;j++){
                if(dif[j]<= i && prof <= pro[j]){
                     prof = pro[j];
                }
                
            }
            max_prop+=prof;
        }
        
        return max_prop ; 
        
    }
}