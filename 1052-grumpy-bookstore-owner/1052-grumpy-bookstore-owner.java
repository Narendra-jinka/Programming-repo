class Solution {
    public int maxSatisfied(int[] cus, int[] g, int m) {
        
        int tot=0;
        
        for(int i=0;i<cus.length;i++){
            if(g[i]!=1) tot+=cus[i];
        }
        
        int max=0;
        int cur=0;
        int i=0,j=0;
        
        while(j<cus.length){
            if(g[j] != 0) cur+=cus[j];
            max=Math.max(cur,max);
            
            if(j-i+1 == m){
                max=Math.max(cur,max);
                //System.out.println(max+"  "+cur);
                if(g[i]==1) cur-=cus[i];
                i++;
            }
            
            j++;
            
        }
        
        
        
        return tot+max;
        
    }
}