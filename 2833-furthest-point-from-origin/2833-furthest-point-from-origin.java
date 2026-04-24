class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int lc=0,rc=0, n=s.length();
        for(char c:s.toCharArray()){
            if(c == 'L') lc++;
            else if(c == 'R') rc++;
        }
        if(lc ==0 || rc==0) return n;
        else if(lc > rc ){
            return n-(2*rc);
        }
        else  if(lc < rc ){
            return n-(2*lc);
        }
        else{
            return n-(2*lc);
        }
        
    }
}