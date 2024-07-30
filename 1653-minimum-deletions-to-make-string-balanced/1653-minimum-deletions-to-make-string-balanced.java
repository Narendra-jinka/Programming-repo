class Solution {
    public int minimumDeletions(String s) {
        int r=0,bcount=0;
        
        for(var c:s.toCharArray()){
            if(c == 'b') bcount++;
            else {
                if(bcount>0){
                    r++;
                    bcount--;
                }
            }
        }
        
        return r;
    }
}